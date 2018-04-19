package com.aiprogram.entity;

import java.util.List;

public class Teacher {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_info.t_id
     *
     * @mbggenerated
     */
    private Integer tId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_info.teacher_name
     *
     * @mbggenerated
     */
    private String teacherName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_info.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_info.t_id
     *
     * @return the value of teacher_info.t_id
     *
     * @mbggenerated
     */
    public Integer gettId() {
        return tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_info.t_id
     *
     * @param tId the value for teacher_info.t_id
     *
     * @mbggenerated
     */
    public void settId(Integer tId) {
        this.tId = tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_info.teacher_name
     *
     * @return the value of teacher_info.teacher_name
     *
     * @mbggenerated
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_info.teacher_name
     *
     * @param teacherName the value for teacher_info.teacher_name
     *
     * @mbggenerated
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_info.password
     *
     * @return the value of teacher_info.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_info.password
     *
     * @param password the value for teacher_info.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}