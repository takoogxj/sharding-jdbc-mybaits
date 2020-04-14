package com.gxj.sharding.mapper;

import com.gxj.sharding.entity.Student;

import java.util.List;

public interface StudentMapper {

    Integer insert(Student s);

    List<Student> findAll();

    List<Student> findByStudentIds(List<Integer> studentIds);
}
