package com.springjpa.Repo;

import com.springjpa.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo  extends JpaRepository<Student,Long> {
    public List<Student> findByFristName(String fristName);
    public  List<Student> findByFristNameContaining(String str);
//Native Query
    @Query(
            value = "select * from jpa_student j where  j.email=?1",
            nativeQuery = true
    )
    Student getStudentByEmailId(String email);
    //JPL Query
    @Query("select  s.fristName from Student  s where  s.emailId=?1")
    String getStudentFristNameByEmailId(String email);

    // Native Named Params Query
    @Query(
            value = "select * from  jpa_student s where  s.email=:emailId",
            nativeQuery = true
    )
    Student getStudentByEmailIdNativeNamedParams(@Param("emailId") String Str);
}
