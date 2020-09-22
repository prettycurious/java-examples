package com.example.mybatisplus.entity;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2020/9/22
 * Time: 5:51 下午
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
