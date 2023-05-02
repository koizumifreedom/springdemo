package com.example.demo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserRequest implements Serializable {

    private String name;

    private String address;

    private String phone;
}
