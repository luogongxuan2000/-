package com.qf.dao;

import com.qf.pojo.Car;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CarMapper {
    List<Car> findAll();
}
