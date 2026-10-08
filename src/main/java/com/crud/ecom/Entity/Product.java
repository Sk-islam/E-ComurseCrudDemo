package com.crud.ecom.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column
    int pid;
    @Column(nullable = false)
    String pname;
    @Column(nullable = false)
    Integer pprice;
    @Column(nullable = false)
    Integer pqty;
    @Column(nullable = false)
    Integer pstock;
    @Column
    String pdescription;
}
