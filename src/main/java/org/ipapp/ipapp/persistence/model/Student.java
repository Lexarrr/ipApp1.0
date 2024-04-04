package org.ipapp.ipapp.persistence.model;

import jakarta.persistence.*;
import lombok.Data;


import java.util.Collection;

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

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "id")
    private User user;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "id")
    private Course course;


    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "id")
    private Group group;

}
