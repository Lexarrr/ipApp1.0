package org.ipapp.ipapp.persistence.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student extends User{

//    private User id;
//
//    private Course id;
//
//    private Group id;

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    @JoinColumn(nullable = false, name = "userId")
    private User userId;

    private Long courseId;


}
