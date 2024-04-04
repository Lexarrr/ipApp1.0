package org.ipapp.ipapp.persistence.model;

import java.util.HashSet;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
import org.ipapp.ipapp.persistence.model.Course;
import org.ipapp.ipapp.persistence.model.User;

@Entity
@Data
public class Teacher extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "teacher", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
            CascadeType.REFRESH })
    private HashSet<Course> courses;

}
