package me.vastpeng.mall.db.dao;

import java.util.List;
import me.vastpeng.mall.db.domain.MallAdmin;
import me.vastpeng.mall.db.domain.MallAdminExample;
import org.apache.ibatis.annotations.Param;

public interface MallAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    long countByExample(MallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    int deleteByExample(MallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    int insert(MallAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    int insertSelective(MallAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallAdmin selectOneByExample(MallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallAdmin selectOneByExampleSelective(@Param("example") MallAdminExample example, @Param("selective") MallAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<MallAdmin> selectByExampleSelective(@Param("example") MallAdminExample example, @Param("selective") MallAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    List<MallAdmin> selectByExample(MallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallAdmin record, @Param("example") MallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallAdmin record, @Param("example") MallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") MallAdminExample example);
}