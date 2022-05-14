package edu.poniperro;

/** La clase Calculadora implementa los metodos de la interfaz ICalculadora
 *
 * @author jouad
 */

public class Calculadora implements ICalculadora {

    /**
     * Implementa el double de la interfaz
     * @param numero1
     * @param numero2
     * @return: devuelve la suma de dos metodos
     */

    @Override
    public double suma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    /**
     * Implementa el double de la interfaz
     * @param numero1
     * @param numero2
     * @return: devuelve la resta de dos metodos
     */

    @Override
    public double resta(double numero1, double numero2) {
        return numero1 - numero2;
    }

    /**
     * Implementa el double de la interfaz
     * @param numero1
     * @param numero2
     * @return: devuelve la división de dos metodos solo si no es entre 0
     */

    @Override
    public double divide(double numero1, double numero2) {
        if (numero1 == 0)
            throw new IllegalArgumentException("No puedes dividir entre 0");
        return numero1 / numero2;
    }

    /**
     * Implementa el metodo double de la interfaz
     * @param numero1
     * @param numero2
     * @return: devuelve la multiplicación de dos metodos
     */

    @Override
    public double multiplica(double numero1, double numero2) {
        return numero1 * numero2;
    }
}