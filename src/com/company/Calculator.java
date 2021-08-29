package com.company;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;//принимает два объекта типа T, возвращает один объект(результат)
    //public static int plus(int a, int b) {
    //int plus = a+b;
    // return plus;
    //}

    BinaryOperator<Integer> minus = (x, y) -> x - y;// принимает два объекта типа T, возвращает один объект(рез. над ними)
    BinaryOperator<Integer> multiply = (x, y) -> x * y;//принимает два объекта типа T, возвращает один объект(рез. над ними)
    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : x / (y+1);//принимает два объекта типа T, возвращает один объект(рез. над ними)

    UnaryOperator<Integer> pow = x -> x * x;//принимает один объект типа Т, возвращает один объект(результат над ним)
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;//примает один объект типа Т, проверяет условие, если да выводит
    //объект типа Т, если нет умножает этот объект на "-1", и выводит этот результат

    Predicate<Integer> isPositive = x -> x > 0;//принимает один объект с типом Т, проверяет условие, возвращает boolean
    Consumer<Integer> println = System.out::println;//выполняет действие над объектом, ничего не возвращает
}


