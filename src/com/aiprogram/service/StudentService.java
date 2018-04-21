package com.aiprogram.service;

import com.aiprogram.entity.Student;
import org.springframework.stereotype.Service;

/**
 * Created by 平凡的世界 on 2018/4/21.
 */
@Service("usercontroller")
public interface StudentService {
    //命名规范
    int createStudent(Student student);
}
