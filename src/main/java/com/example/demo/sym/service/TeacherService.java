package com.example.demo.sym.service;

import java.util.ArrayList;

import com.example.demo.sym.service.model.TeacherDto;

import org.springframework.stereotype.Component;

@Component
public interface TeacherService {
    public int register(TeacherDto teacher);

    public ArrayList<?> list();

    public TeacherDto findById(String teaNum);

    public int update(TeacherDto teacher);

    public int delete(TeacherDto teacher);

}
