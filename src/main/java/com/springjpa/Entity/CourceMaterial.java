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
public class CourceMaterial {
    @Id
    @SequenceGenerator(name = "course_Material_Sequence",allocationSize = 1,sequenceName = "course_Material_Sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "course_Material_Sequence")
    private Long CourceMaterialId;
    private  String url;
    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "Course_id",
            referencedColumnName = "CourseId",
    )
    private Courses course;
}
