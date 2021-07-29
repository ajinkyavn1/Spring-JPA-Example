package com.springjpa.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(
        name = "Jpa_Student",
        uniqueConstraints=@UniqueConstraint(
                    name = "emailid_unique",
                columnNames = "email"
        )
)
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_Id",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private  Long StudentId;
    private  String fristName;
    private  String lastName;
    @Column(name = "email",nullable = false)
    private  String emailId;
    @Embedded
    private  Gurdian gurdian;
}
