package com.io.SBDataJPAJPARepoApp.repository;


import com.io.SBDataJPAJPARepoApp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository  //optional
public interface StudentRepo extends JpaRepository<Student, Serializable> {


}
