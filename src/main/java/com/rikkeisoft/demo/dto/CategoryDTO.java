package com.rikkeisoft.demo.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CategoryDTO {
    private int id;
    private String name;
    private Long number_of_products;
}
