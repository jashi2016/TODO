package com.kiran.TODO.Service;


import com.kiran.TODO.Model.ToDo;
import com.kiran.TODO.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ToDoIntImpl implements TodDoInt{
    private static final List<ToDo> todos = new ArrayList<>(); // Acting as Local DataBase
    private static int todocount = 0;

    @Autowired
    private TodoRepository iTodoRepository;


    public List<ToDo> findAll(){
        return iTodoRepository.findAll();
    }

    public ToDo findById(int id) {
        return iTodoRepository.findById(id).get();
    }

    public String add(ToDo toDo){
        iTodoRepository.save(toDo);
        return toDo.getTitle() + " - Todo Added";
    }

    public String deleteById(int id) {
        iTodoRepository.deleteById(id);
        return "Todo at " + id + " Deleted";
    }

    public String updateById(int id, ToDo todo) {
        this.deleteById(id);
        this.add(todo);
        return todo.getTitle() + " - Todo Updated";
    }
}