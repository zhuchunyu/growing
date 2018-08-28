package com.habage.growing.entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


/**
 * @author yuz
 */
@Table(name = "city")
@Data
public class City {
    @Id
    private String id;
    private String name;
    private String state;
}
