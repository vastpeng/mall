package me.vastpeng.mall.db.dao;

import java.util.List;
import me.vastpeng.mall.db.domain.MallFootprint;
import me.vastpeng.mall.db.domain.MallFootprintExample;
import org.apache.ibatis.annotations.Param;

public interface MallFootprintMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    long countByExample(MallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int deleteByExample(MallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int insert(MallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int insertSelective(MallFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallFootprint selectOneByExample(MallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MallFootprint selectOneByExampleSelective(@Param("example") MallFootprintExample example, @Param("selective") MallFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<MallFootprint> selectByExampleSelective(@Param("example") MallFootprintExample example, @Param("selective") MallFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    List<MallFootprint> selectByExample(MallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MallFootprint record, @Param("example") MallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MallFootprint record, @Param("example") MallFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mall_footprint
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") MallFootprintExample example);
}