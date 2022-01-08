package com.rikkeisoft.demo.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private int category_id;
    @Column
    private String description;
    @Column
    private String image;
    @Column
    private BigDecimal price;
    @Column
    private int status;
    @Column
    @CreationTimestamp
    private Timestamp created_at;
    @Column
    @UpdateTimestamp
    private Timestamp updated_at;
}
