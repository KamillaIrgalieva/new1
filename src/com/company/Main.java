package com.company;



public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);// результат 0, делить на "0" нельзя
        int c = calc.devide.apply(a, b);
        int l = calc.abs.apply(a);
        int m = calc.multiply.apply(a, b);
        int k = calc.pow.apply(a);
        System.out.println("умножение:");
        calc.println.accept(m);
        System.out.println("abs:");
        calc.println.accept(l);
        System.out.println("деление:");
        calc.println.accept(c);
        System.out.println("возведение в квадрат:");
        calc.println.accept(k);
        System.out.println("isPositive:");
        boolean f = calc.isPositive.test(a);
        System.out.println(f);

    }
}
