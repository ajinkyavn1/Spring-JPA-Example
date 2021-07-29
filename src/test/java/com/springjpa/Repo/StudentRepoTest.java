package com.springjpa.Repo;

import com.springjpa.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepoTest {
    @Autowired
   private StudentRepo studentRepo;
    @Test
    public void saveStudent(){
        Student student=Student.builder()
                .emailId("ajinnkyha@gmail.com")
                .fristName("Ajinkya")
                .lastName("Narkhede")
                .gurdianMobail("9881211594")
                .gurdianName("Aj")
                .GurdianEmail("ajhasgjh@gmail.com")
                .build();
        studentRepo.save(student);
    }
    @Test
    public  void  printAllStudent(){
        List<Student> studentList= studentRepo.findAll();
        System.out.println("Student List = "+studentList);
    }
}