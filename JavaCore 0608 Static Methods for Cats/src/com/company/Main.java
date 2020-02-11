package com.company;

import java.io.*;
import java.util.Scanner;

/*

0608 Статические методы для кошек

Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
с помощью которых можно получить/изменить количество котов (переменную catCount).

Требования:
1. Добавь в класс метод getCatCount.
2. Метод getCatCount должен возвращать int.
3. Метод getCatCount должен возвращать значение переменной catCount.
4. Добавь в класс метод setCatCount, принимающий int.
5. Метод setCatCount ничего не должен возвращать.
6. Метод setCatCount должен присваивать переменной catCount переданное значение.


*/

// public class Cat
public class Main {
    public static int catCount = 0;
    public Main(){
        catCount++;
    }
    public static int getCatCount() {
        return catCount;
    }
    public static void setCatCount(int catCount) {
        Main.catCount = catCount;
    }
    public static void main(String[] args) throws IOException {

    }
}









