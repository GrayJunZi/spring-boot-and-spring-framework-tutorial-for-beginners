package com.grayjunzi.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
    private static List<Todo> todos;
    static {
        todos.add(new Todo(1,"grayjunzi","Learn AWS", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(1,"grayjunzi","Learn Devops", LocalDate.now().plusYears(2),false));
        todos.add(new Todo(1,"grayjunzi","Learn Full Stack Development", LocalDate.now().plusYears(3),false));
    }

    public static List<Todo> findByUserName(String username) {
        return todos;
    }
}
