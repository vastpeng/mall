package me.vastpeng.mall.db.dao;

import java.util.List;
import me.vastpeng.mall.db.domain.MallCategory;
import me.vastpeng.mall.db.domain.MallCategoryExample;
import org.apache.ibatis.annotations.Param;

public interface MallCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_category
     *
     * @mbg.generated
     */
    long countByExample(MallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_category
     *
     * @mbg.generated
     */
    int deleteByExample(MallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_category
     *
     * @mbg.generated
     */
    int insert(MallCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_category
     *
     * @mbg.generated
     */
    int insertSelective(MallCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallCategory selectOneByExample(MallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallCategory selectOneByExampleSelective(@Param("example") MallCategoryExample example, @Param("selective") MallCategory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<MallCategory> selectByExampleSelective(@Param("example") MallCategoryExample example, @Param("selective") MallCategory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_category
     *
     * @mbg.generated
     */
    List<MallCategory> selectByExample(MallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_category
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallCategory record, @Param("example") MallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_category
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallCategory record, @Param("example") MallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") MallCategoryExample example);
}