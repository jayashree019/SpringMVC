package com.example.springmvc1.Service;

import com.example.springmvc1.Food;
import com.example.springmvc1.Mapper.FoodMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    @Autowired
    private FoodMapper foodMapper;
    public Food[] getFoods(){
        Food[] foods=foodMapper.getFoods();

        return foods;
    }
    public int addFood(Food food){
        return foodMapper.addFood(food);
    }
}
