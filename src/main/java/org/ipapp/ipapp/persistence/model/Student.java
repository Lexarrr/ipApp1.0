package org.ipapp.ipapp.persistence.model;

import jakarta.persistence.*;
import lombok.Data;


import java.util.Collection;
import java.util.HashSet;

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

    @ManyToMany(targetEntity = User.class, fetch = FetchType.EAGER, mappedBy = "id")
    @JoinColumn(nullable = false, name = "id")
    private HashSet<Course> courses;


    @ManyToMany(targetEntity = User.class, fetch = FetchType.EAGER, mappedBy = "id")
    @JoinColumn(nullable = false, name = "id")
    private HashSet<Group> groups;

}
