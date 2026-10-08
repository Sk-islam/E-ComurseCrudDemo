package com.crud.ecom.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Users")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    String userName;
    @Column(nullable = false)
    String userEmail;
    @Column(nullable = false)
    String userNumber;

}
