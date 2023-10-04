package com.example.springmvc1.Controller;

import com.example.springmvc1.Food;
import com.example.springmvc1.Service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {
    private FoodService foodService;
@Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/food")
    public String getFood(Model model){
       Food[] foods={new Food("Pizza",500.00),
       new Food("Dragon Fruit",400.00),
       new Food("ColdCoffee",150.00)
       };
      model.addAttribute("foods",foods);

        return "food";
    }

}
