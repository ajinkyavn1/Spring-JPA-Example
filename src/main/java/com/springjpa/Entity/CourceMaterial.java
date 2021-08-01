package com.springjpa.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "course")
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
            referencedColumnName = "CourseId"
    )
    private Courses course;
}
