package com.example.boot.controller;

import com.example.boot.bean.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2021/1/21
 * Time: 3:26 下午
 */
@RestController
public class ParameterTestController {

    @GetMapping("/savePerson")
    public Person main(Person person) {
        return person;
    }
}
