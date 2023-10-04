package com.example.springmvc1.Mapper;

import com.example.springmvc1.Food;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FoodMapper {
    @Select("SELECT * FROM FOOD")
    public Food[] getFoods();
    @Insert("INSERT INTO FOOD(name,price)VALUE(#{name},#{price})")
    int addFood(Food food);
}
