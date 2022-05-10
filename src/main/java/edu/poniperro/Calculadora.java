package edu.poniperro;

public class Calculadora implements ICalculadora {

    @Override
    public double suma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    @Override
    public double resta(double numero1, double numero2) {
        return numero1 - numero2;
    }

    @Override
    public double divide(double numero1, double numero2) {
        return numero1 / numero2;
    }

    @Override
    public double multiplica(double numero1, double numero2) {
        return numero1 * numero2;
    }
}
