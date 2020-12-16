package com.example.demo.cmm.mpr;

import java.util.ArrayList;

import com.example.demo.sym.service.model.TeacherDto;

import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper {
    public int insert(TeacherDto teacher);

    public ArrayList<?> selectAll();

    public TeacherDto selectById(String teaNum);

    public int update(TeacherDto teacher);

    public int delete(TeacherDto teacher);

}
