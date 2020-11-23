package com.qf.service.impl;

import com.qf.dao.CarMapper;
import com.qf.pojo.Car;
import com.qf.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarMapper carMapper;
    @Override
    public List<Car> findAll() {
        return carMapper.findAll();
    }
}
