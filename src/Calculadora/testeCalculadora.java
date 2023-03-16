package Calculadora;

import java.util.Arrays;

public class testeCalculadora {
    public static void main(String[] args) {
        Calc calculo = new Calc();
        calculo.setN1(10);
        calculo.setN2(20);
        double r = calculo.add(calculo.getN1(), calculo.getN2());
        System.out.println("Resultado" + r);

    }
}
