package vn.com.vti.bookshop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import vn.com.vti.bookshop.entity.BusinessType;
import vn.com.vti.bookshop.entity.BusinessTypeExample;

public interface BusinessTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.business_type
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    long countByExample(BusinessTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.business_type
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    int deleteByExample(BusinessTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.business_type
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.business_type
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    int insert(BusinessType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.business_type
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    int insertSelective(BusinessType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.business_type
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    List<BusinessType> selectByExample(BusinessTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.business_type
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    BusinessType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.business_type
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    int updateByExampleSelective(@Param("record") BusinessType record, @Param("example") BusinessTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.business_type
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    int updateByExample(@Param("record") BusinessType record, @Param("example") BusinessTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.business_type
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    int updateByPrimaryKeySelective(BusinessType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.business_type
     *
     * @mbg.generated Sun May 24 00:30:09 JST 2020
     */
    int updateByPrimaryKey(BusinessType record);
}