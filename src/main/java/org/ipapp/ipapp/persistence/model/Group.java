package org.ipapp.ipapp.persistence.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Group {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
