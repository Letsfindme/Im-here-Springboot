package com.fadi.imhere.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
@Setter
@Getter

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 15)
    private String userName;

    @Column(nullable = false, length = 40)
    private String password;

    @Column(nullable = false, length = 20)
    private  String bio;

    private LocalDateTime createdDate;


}
