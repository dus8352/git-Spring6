package com.example.demo.sym.service.impl;

import java.util.ArrayList;

import com.example.demo.cmm.mpr.TeacherMapper;
import com.example.demo.sym.service.TeacherService;
import com.example.demo.sym.service.model.TeacherDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public int register(TeacherDto teacher) {
        return teacherMapper.insert(teacher);
    }

    @Override
    public ArrayList<?> list() {
        return teacherMapper.selectAll();
    }

    @Override
    public TeacherDto findById(String teaNum) {
        return teacherMapper.selectById(teaNum);
    }

}
