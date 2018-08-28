package com.habage.growing.mapper;

import com.habage.growing.entity.City;
import com.habage.growing.util.MyMapper;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yuz
 */
@Repository
public interface CityMapper extends MyMapper<City> {
    /**
     * 获取全部城市列表
     * @return
     */
    List<City> getAll();
}
