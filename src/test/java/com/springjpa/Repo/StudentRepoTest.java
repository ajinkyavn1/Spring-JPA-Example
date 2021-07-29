package com.springjpa.Repo;

import com.springjpa.Entity.Gurdian;
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
                .build();
        studentRepo.save(student);
    }
    @Test
    public  void  printAllStudent(){
        List<Student> studentList= studentRepo.findAll();
        System.out.println("Student List = "+studentList);
    }
    @Test
    public  void saveStudentWithGurdian(){
        Gurdian gurdian=Gurdian.builder()
                .mobail("9881211594")
                .name("Aj")
                .email("ajhasgjfh@gmail.com").build();
        Student student=Student.builder()
                .fristName("Ajink")
                .lastName("Narkhe")
                .emailId("adsada@gmail.com")
                .gurdian(gurdian)
                .build();
        studentRepo.save(student);
    }
}