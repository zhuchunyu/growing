package com.habage.growing.ctrl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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

        PageHelper.startPage(1, 3);
        Page<City> page = cityMapper.getPage();
        System.out.println(page);

        return "HelloWorld!";
    }
}
