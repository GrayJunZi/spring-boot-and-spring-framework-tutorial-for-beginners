package com.grayjunzi.learnjpaandhibernate.course;

import com.grayjunzi.learnjpaandhibernate.course.jpa.CourseJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    //  @Autowired
    //  private CourseJDBCRepository repository;

    @Autowired
    private CourseJPARepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn AWS", "grayjunzi"));
        repository.insert(new Course(2,"Learn Azure", "grayjunzi"));
        repository.insert(new Course(3,"Learn DevOps", "grayjunzi"));

        repository.deleteById(2);

        System.out.println(repository.findById(1));
        System.out.println(repository.findById(3));
    }
}
