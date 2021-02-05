package com.io.SBDataJPAJPARepoApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_dtls")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @Column(name = "student_id")
    private Integer studentId;
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "student_email")
    private String studentEmail;
    @Column(name = "student_age")
    private Integer studentAge;

}
