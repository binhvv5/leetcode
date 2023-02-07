package main.java;


import main.java.array.FruitIntoBaskets;
import main.java.array.MissingNumber;

public class MainClass {

    public static void main(String[] args) {
        FruitIntoBaskets solution = new FruitIntoBaskets();
        System.out.println(solution.totalFruit(new int[]{1,2,3,2,2,1,4}));
    }

}
