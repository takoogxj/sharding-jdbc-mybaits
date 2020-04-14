package com.gxj.sharding.service.impl;

import com.gxj.sharding.entity.Student;
import com.gxj.sharding.mapper.StudentMapper;
import com.gxj.sharding.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentMapper studentMapper;

    public boolean insert(Student student) {

        return studentMapper.insert(student) > 0 ? true : false;
    }
}
