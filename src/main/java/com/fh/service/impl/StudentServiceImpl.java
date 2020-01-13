package com.fh.service.impl;

import com.fh.dao.StudentDao;
import com.fh.entity.po.Student;
import com.fh.service.StudentService;
import com.fh.utils.PageEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public void getstudentalldatalist(PageEntity<Student> pager) {


        pager.setRecordsFiltered(studentDao.queryCount());
        pager.setRecordsTotal(studentDao.queryCount());

        List<Student> getstudentalldatalist=studentDao.getstudentalldatalist(pager);

        pager.setData(getstudentalldatalist);


    }

    @Override
    public void addStudent(Student student) {
        studentDao.insert(student);
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentDao.selectById(id);
    }

    @Override
    public void updateStudent(Student student) {

        studentDao.updateById(student);
    }

    @Override
    public void updateStudentIsDelById(Integer id) {

        studentDao.updateStudentIsDelById(id);
    }

}

