package com.habage.growing.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 *
 * @author yuz
 * @date 2018/8/28
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
