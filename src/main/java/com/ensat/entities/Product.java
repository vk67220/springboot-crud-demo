package com.ensat.entities;

import javax.persistence.*;
import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Better for MySQL
    private Integer id;

    @Version
    private Integer version; // Optional: for optimistic locking

    private String name;
    private String description; // Add if needed
    private BigDecimal price; // Better than Double for currency

}
