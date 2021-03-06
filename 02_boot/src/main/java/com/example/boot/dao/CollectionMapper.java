package com.example.boot.dao;

import com.example.boot.po.Collection;
import com.example.boot.po.CollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CollectionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbg.generated Tue Jun 09 14:52:59 CST 2020
     */
    long countByExample(CollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbg.generated Tue Jun 09 14:52:59 CST 2020
     */
    int deleteByExample(CollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbg.generated Tue Jun 09 14:52:59 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbg.generated Tue Jun 09 14:52:59 CST 2020
     */
    int insert(Collection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbg.generated Tue Jun 09 14:52:59 CST 2020
     */
    int insertSelective(Collection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbg.generated Tue Jun 09 14:52:59 CST 2020
     */
    List<Collection> selectByExampleWithRowbounds(CollectionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbg.generated Tue Jun 09 14:52:59 CST 2020
     */
    List<Collection> selectByExample(CollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbg.generated Tue Jun 09 14:52:59 CST 2020
     */
    Collection selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbg.generated Tue Jun 09 14:52:59 CST 2020
     */
    int updateByExampleSelective(@Param("record") Collection record, @Param("example") CollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbg.generated Tue Jun 09 14:52:59 CST 2020
     */
    int updateByExample(@Param("record") Collection record, @Param("example") CollectionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbg.generated Tue Jun 09 14:52:59 CST 2020
     */
    int updateByPrimaryKeySelective(Collection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collection
     *
     * @mbg.generated Tue Jun 09 14:52:59 CST 2020
     */
    int updateByPrimaryKey(Collection record);
}