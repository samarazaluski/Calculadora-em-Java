package Calculadora;

public class Calc {

    //atributos
    double n1;
    double n2;
    double result;




    //métodos/ acessores e modificadores
    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }



    //métodos operacionais

    public double add (double n1, double n2) {
        double r = n1 + n2;
        return r;
    }

    public double sub (double n1, double n2){
        return n1 - n2;
    }

    public double mult(double n1, double n2){
        return n1 * n2;
    }
    public double div(double n1, double n2){
        return n1 / n2;

    }
}
