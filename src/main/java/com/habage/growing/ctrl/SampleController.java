package com.habage.growing.ctrl;


import com.habage.growing.entity.City;
import com.habage.growing.mapper.CityMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuz
 */
@RestController
@RequestMapping("/")
public class SampleController {

    @Autowired
    private CityMapper cityMapper;

    @RequestMapping("/")
    public String index() {

        System.out.println(cityMapper.getAll());

        cityMapper.selectAll();

        return "HelloWorld!";
    }
}
