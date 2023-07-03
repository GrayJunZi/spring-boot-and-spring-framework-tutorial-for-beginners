package com.grayjunzi.myfirstwebapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model){

       List<Todo> todos =  todoService.findByUserName("grayjunzi");
       model.addAttribute("todos",todos);

        return "listTodos";
    }
}
