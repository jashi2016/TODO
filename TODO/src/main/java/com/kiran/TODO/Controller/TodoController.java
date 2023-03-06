package com.kiran.TODO.Controller;
import com.kiran.TODO.Model.ToDo;
import com.kiran.TODO.Service.TodDoInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController // @Controller + @ResponseBddy
@RequestMapping("api/v1/ToDo/")
public class TodoController {

    @Autowired
    private TodDoInt service;

    @PostMapping("add") //Create
    public void add(@RequestBody ToDo toDo){
        service.add(toDo);
    }

    @GetMapping("find/id/{id}") //Read
    public ToDo findToDoById(@PathVariable int id){
        return service.findById(id);
    }

    @GetMapping("findAll") //Read => form service and posting on website
    public List<ToDo> findAllToDos(){
        return service.findAll();
    }

    @PutMapping("put/id/{id}") //Update
    public void updateToDo(@PathVariable int id, @RequestBody ToDo toDo){
        service.updateById(id,toDo);
    }

    @DeleteMapping("delete/id/{id}") //Delete
    public void deleteToDoById(@PathVariable int id){
        service.deleteById(id);
    }

}