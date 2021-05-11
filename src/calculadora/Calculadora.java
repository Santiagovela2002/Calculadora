package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    private int numero;
    public double resultado;
    private String signo;
    private int segundoresultado;

    public Calculadora() {

    }

    public void suma(int... numero) {
        this.signo = "+";
        for (int i = 0; i < numero.length; i++) {
            this.numero = numero[i];
            this.resultado += this.numero;
        }
    }

    public void resta(int... numero) {
        this.signo = "-";
        for (int i = 0; i < numero.length; i++) {
            this.numero = numero[i];
            this.resultado -= this.numero;
        }
    }

    public void multiplicación(int... numero) {
        this.signo = "*";
        for (int i = 0; i < numero.length; i++) {
            this.numero = numero[i];
            this.resultado *= this.numero;
        }
    }

    public void división(int... numero) {
        this.signo = "/";
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] == 0) {
                resultado = 0;
                JOptionPane.showMessageDialog(null, "Introduce un numero correcto para la division", "!ERROR", 0);
                break;
            } else {
                this.numero = numero[i];
                resultado /= this.numero;
            }
        }
    }

    public void operación(int resultado) {
        this.resultado = resultado;
    }

    public void resultado() {
        segundoresultado = (int) resultado;
        if (resultado % segundoresultado == 0) {
            System.out.println("resultado = " + segundoresultado);
        } else {
            System.out.println("resultado = " + resultado);
        }
    }

    public void eliminar() {
        if (this.signo.equalsIgnoreCase("+")) {
            this.resultado -= this.numero;
        } else if (this.signo.equalsIgnoreCase("-")) {
            this.resultado += this.numero;
        } else if (this.signo.equalsIgnoreCase("*")) {
            this.resultado /= this.numero;
        } else if (this.signo.equalsIgnoreCase("/")) {
            this.resultado *= this.numero;
        }
    }

}
