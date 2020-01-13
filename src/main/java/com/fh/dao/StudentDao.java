package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.entity.po.Student;
import com.fh.utils.PageEntity;

import java.util.List;

public interface StudentDao  extends BaseMapper<Student> {

    Long queryCount();

    List<Student> getstudentalldatalist(PageEntity<Student> pager);

    void updateStudentIsDelById(Integer id);
}
