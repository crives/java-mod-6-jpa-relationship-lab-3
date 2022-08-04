package org.example.models;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CAT_DATA")
public class Cat {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private String breed;

    @ManyToMany(mappedBy = "cats")
    private List<Owner> owners = new ArrayList<>();

}
