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
public class Courses {
    @Id
    @SequenceGenerator(name = "course_Sequence",allocationSize = 1,sequenceName = "course_Sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "course_Sequence")
    private  Long CourseId;
    private  String title;
    private Integer credits;
}
