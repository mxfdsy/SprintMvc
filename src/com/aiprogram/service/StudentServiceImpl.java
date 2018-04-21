package com.aiprogram.service;

import com.aiprogram.dao.StudentMapper;
import com.aiprogram.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 平凡的世界 on 2018/4/21.
 */
@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService {

   @Autowired
   @Resource
   private StudentMapper studentMapper;
    @Override
    public int createStudent(Student student) {

        return 0;
    }
}
