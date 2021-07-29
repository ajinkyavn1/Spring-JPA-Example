package com.springjpa.Repo;

import com.springjpa.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo  extends JpaRepository<Student,Long> {
    public List<Student> findByFristName(String fristName);
}
