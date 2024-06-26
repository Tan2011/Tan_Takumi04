package vn.com.vti.bookshop.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import vn.com.vti.bookshop.entity.Member;
import vn.com.vti.bookshop.form.PasswordChangeForm;
import vn.com.vti.bookshop.mapper.MemberMapper;
import vn.com.vti.bookshop.security.MemberDetails;
import vn.com.vti.bookshop.validator.PasswordChangeValidator;

@Controller
@RequestMapping("passwordChange")
public class PasswordChangeController {
	@Autowired
	private MemberMapper memberMapper;

	@ModelAttribute
	public PasswordChangeForm createForm() {
		return new PasswordChangeForm();
	}

	@Autowired
	private PasswordChangeValidator changeValidator;
	
	@InitBinder
	public void validatorBinder(WebDataBinder binder) {
		binder.addValidators(changeValidator);
	}
	
	@RequestMapping("input")
	public String input(PasswordChangeForm passwordChangeForm) {
		return "passwordChange/passwordChangeInput";
	}
	@PostMapping("update")
	public String update(@Valid PasswordChangeForm passwordChangeForm, BindingResult bindingResult, RedirectAttributes redirectAttributes, @AuthenticationPrincipal MemberDetails memberDetails) {
		if(bindingResult.hasErrors()) {
			return input(passwordChangeForm);
		}
		//TODO パスワード変更
		Member member = memberMapper.selectByPrimaryKey(memberDetails.getMember().getId());
//		Member member = memberMapper.selectByPrimaryKey(TODO);
		member.setPassword(passwordChangeForm.getPassword1());
//
		memberMapper.updateByPrimaryKeySelective(member);

        redirectAttributes.addFlashAttribute("message", "パスワードを変更しました。");

		return "redirect:/";
	}
}
