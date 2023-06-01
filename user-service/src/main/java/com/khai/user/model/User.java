package com.khai.user.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "users")
public class User {
    @Id
    private String id;
    private String name;
}
