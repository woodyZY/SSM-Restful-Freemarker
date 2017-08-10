package com.ssmfr.test.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssmfr.test.entity.Person;
@Repository("personDao")
public interface PersonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ssmfr_person
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ssmfr_person
     *
     * @mbggenerated
     */
    int insert(Person record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ssmfr_person
     *
     * @mbggenerated
     */
    int insertSelective(Person record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ssmfr_person
     *
     * @mbggenerated
     */
    Person selectByPrimaryKey(Integer pid);

    
    
    /**
     * selectAll
     */
    List<Person>selectAll();
    
    
    
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ssmfr_person
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Person record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ssmfr_person
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Person record);
}