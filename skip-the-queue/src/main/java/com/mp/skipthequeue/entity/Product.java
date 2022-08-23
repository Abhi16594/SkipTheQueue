package com.mp.skipthequeue.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue
    private Long productId;
    private String name;
    private String category;
    private Date manufacturedDate;
    private Date expiryDate;
    private Double price;
    private String description;
}
