package com.example.demo;
import java.time.LocalDate;
public class Main {
  public static void main(String[] args) {
    FoodBranch foodBranch = null;
        try {
             foodBranch = new FoodBranch("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        FoodBranch foodBranch1 = null;
        try {
             foodBranch1 = new FoodBranch("1","A",1,
                    LocalDate.of(2023,10,10),
                    LocalDate.of(2023,10,10));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(foodBranch);
    }
}
