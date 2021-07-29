package com.springjpa.Repo;

import com.springjpa.Entity.CourceMaterial;
import com.springjpa.Entity.Courses;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMatrialRepoTest {

    @Autowired
    CourseMatrialRepo courseMatrialRepo;
    @Test
    public  void SaveCourse(){
        Courses courses=Courses.builder()
                .title("C++")
                .credits(6)
                .build();
        CourceMaterial courceMaterial= CourceMaterial.builder()
                .url("www.google.com")
                .course(courses)
                .build();
        courseMatrialRepo.save(courceMaterial);
    }
}