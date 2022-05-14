package edu.poniperro;

public interface ICalculadora {
    /**
     * Los metodos que implementara la clase Calculadora
     * Se ha usado el metodo double y no int puesto que a la hora de dividir y restar
     * podrá almacenar decimales
     */

    double suma(double numero1, double numero2);
    double resta(double numero1, double numero2);
    double divide(double numero1, double numero2);
    double multiplica(double numero1, double numero2);
}
