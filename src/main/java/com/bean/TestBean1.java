package com.bean;

import org.springframework.stereotype.Service;

import javax.persistence.*;

/**
 * @Author: yunxiang.yang
 * @Date: 2018/11/23 16:33
 */

@Entity
@Table(name = "testttttttt")
public class TestBean1 {

    @Id
    @GeneratedValue
    private int id;

    @Column(length = 255)
    String name;
}
