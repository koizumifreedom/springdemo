package com.example.demo.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "sampledb")
public class User implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "update_date")
    private Date updateData;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "delete_date")
    private Date deleteDate;

    public void setUpdateDate(Date now) {
    }
}
