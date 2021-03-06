package com.aiprogram.dao;


import com.aiprogram.entity.Teacher;

public interface TeacherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer tId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbggenerated
     */
    int insert(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbggenerated
     */
    int insertSelective(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbggenerated
     */
    Teacher selectByPrimaryKey(Integer tId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Teacher record);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Teacher record);

    Teacher selectByPrimaryKeyWithStudent(Integer sid);

//    List<Teacher> selectByTids(@Param("tids") List<Integer> tids);


}