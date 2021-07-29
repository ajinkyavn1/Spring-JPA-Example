package com.springjpa.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    @Id
//    @GeneratedValue()
    private  Long StudentId;
    private  String fristName;
    private  String lastName;
    private  String emailId;
    private  String gurdianName;
    private  String GurdianEmail;
    private  String gurdianMobail;
}
