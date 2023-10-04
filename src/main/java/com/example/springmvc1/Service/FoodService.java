package com.example.springmvc1.Service;

import com.example.springmvc1.Food;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    public Food[] getFoods(){
        Food[] foods={new Food("Pizza",500.00),
                new Food("Dragon Fruit",400.00),
                new Food("ColdCoffee",150.00)
        };
        return foods;
    }
}
