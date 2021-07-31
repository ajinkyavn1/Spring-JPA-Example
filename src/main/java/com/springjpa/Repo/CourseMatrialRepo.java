package com.springjpa.Repo;

import com.springjpa.Entity.CourceMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMatrialRepo extends JpaRepository<CourceMaterial,Long> {


}
