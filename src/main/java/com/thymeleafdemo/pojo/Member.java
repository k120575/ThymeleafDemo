package com.thymeleafdemo.pojo;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "memeber")
public class Member {

    public Member(String name, String password, String password2){
        this.name = name;
        this.password = password;
        this.password2 = password2;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自動增長主鍵
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "password2")
    private String password2;

    @Column(name = "score")
    private Long score;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "create_user")
    private String createUser;

    @Column(name = "update_time")
    private LocalDateTime updateTime;

    @Column(name = "update_user")
    private String updateUser;

    public Member() {

    }
}
