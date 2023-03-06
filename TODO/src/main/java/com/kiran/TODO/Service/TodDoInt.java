package com.kiran.TODO.Service;

import com.kiran.TODO.Model.ToDo;

import java.util.List;
public interface TodDoInt {
    public List<ToDo> findAll();
    public ToDo findById(int id);
    public String add(ToDo toDo);
    public String deleteById(int id);
    public String updateById(int id, ToDo todo);

}