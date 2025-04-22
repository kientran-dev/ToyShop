package com.kiendz.toyshop_website.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ToyResponse<T> {
    String id;
    String name;
    double price;
    int stock;
    String description;
    String material;
    String origin;
    int age;
    String image;
}
