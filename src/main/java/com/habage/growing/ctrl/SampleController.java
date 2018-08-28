package com.habage.growing.ctrl;


import com.habage.growing.entity.City;
import com.habage.growing.mapper.CityMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

        List<City> cities = cityMapper.selectAll();
        System.out.println(cities);

        City city = cityMapper.selectByPrimaryKey("1");
        System.out.println(city);

        return "HelloWorld!";
    }
}
