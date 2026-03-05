package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity  //Laptop table will be created
public class Laptop {
       @Id  //to make an attribute as the primary key of table
       @GeneratedValue(strategy = GenerationType.AUTO)
       private Integer id;
       private String brand;
       private int price;
       private int RAM;

}
