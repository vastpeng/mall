package me.vastpeng.mall.db.dao;

import java.util.List;
import me.vastpeng.mall.db.domain.MallGrouponRules;
import me.vastpeng.mall.db.domain.MallGrouponRulesExample;
import org.apache.ibatis.annotations.Param;

public interface MallGrouponRulesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     */
    long countByExample(MallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     */
    int deleteByExample(MallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     */
    int insert(MallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     */
    int insertSelective(MallGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallGrouponRules selectOneByExample(MallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallGrouponRules selectOneByExampleSelective(@Param("example") MallGrouponRulesExample example, @Param("selective") MallGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<MallGrouponRules> selectByExampleSelective(@Param("example") MallGrouponRulesExample example, @Param("selective") MallGrouponRules.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     */
    List<MallGrouponRules> selectByExample(MallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallGrouponRules record, @Param("example") MallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallGrouponRules record, @Param("example") MallGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_groupon_rules
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") MallGrouponRulesExample example);
}