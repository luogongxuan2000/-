package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.Car;
import com.qf.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Component
@RequestMapping("/car")
public class CarController {
    @Autowired
    CarService carService;
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public String findAll(Integer page, Model model){
        if (page == null){
            page = 1;
        }
        PageHelper.startPage(page,2);
        List<Car> all = carService.findAll();
        PageInfo<Car> pg = new PageInfo<>(all);

        model.addAttribute("carlist",all);
        model.addAttribute("pg",pg);
        return "/staticHTML/shortRent/shortsort.html";
    }
}
