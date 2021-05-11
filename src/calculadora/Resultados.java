package calculadora;

import calculadora.Calculadora;

public class Resultados {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.suma(12);
        calculadora.resta(4);
        calculadora.multiplicación(4);
        calculadora.división(2);
        calculadora.multiplicación(2);
        calculadora.eliminar();
        calculadora.resultado();

    }
}
