package com.fh.service;

import com.fh.entity.po.Student;
import com.fh.utils.PageEntity;

public interface StudentService {
    void getstudentalldatalist(PageEntity<Student> pager);

    void addStudent(Student student);

    Student getStudentById(Integer id);

    void updateStudent(Student student);

    void updateStudentIsDelById(Integer id);
}
