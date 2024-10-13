import javax.swing.*;

public class ej1 {
    public static void main(String[] args) {
        String fecha = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento en formato DD/MM/YYYY: ");
        String [] numeros = fecha.split("/");
        int dia = Integer.parseInt(numeros[0]);
        int mes = Integer.parseInt(numeros[1]);
        if (dia <= 0 || dia > 31 || mes <= 0 || mes > 12) {
            JOptionPane.showMessageDialog(null, "Fecha ingresada no válida");
        }
        else {
            JOptionPane.showMessageDialog(null, "Tu signo es: " + Zodiaco(dia, mes));
        }
    }

    public static String Zodiaco(int dia, int mes) {
        String signo = "";
        switch (mes) {
            case 1:
                if (dia <= 19) {
                    signo = "capricornio";
                } else {
                    signo = "acuario";
                }
                break;
            case 2:
                if (dia <= 18) {
                    signo = "acuario";
                } else {
                    signo = "piscis";
                }
                break;
            case 3:
                if (dia <= 20) {
                    signo = "piscis";
                } else {
                    signo = "aries";
                }
                break;
            case 4:
                if (dia <= 19) {
                    signo = "aries";
                } else {
                    signo = "tauro";
                }
                break;
            case 5:
                if (dia <= 20) {
                    signo = "tauro";
                } else {
                    signo = "géminis";
                }
                break;
            case 6:
                if (dia <= 20) {
                    signo = "géminis";
                } else {
                    signo = "cáncer";
                }
                break;
            case 7:
                if (dia <= 22) {
                    signo = "cáncer";
                } else {
                    signo = "leo";
                }
                break;
            case 8:
                if (dia <= 22) {
                    signo = "leo";
                } else {
                    signo = "virgo";
                }
                break;
            case 9:
                if (dia <= 22) {
                    signo = "virgo";
                } else {
                    signo = "libra";
                }
                break;
            case 10:
                if (dia <= 22) {
                    signo = "libra";
                } else {
                    signo = "escorpio";
                }
                break;
            case 11:
                if (dia <= 21) {
                    signo = "escorpio";
                } else {
                    signo = "sagitario";
                }
                break;
            case 12:
                if (dia <= 21) {
                    signo = "sagitario";
                } else {
                    signo = "capricornio";
                }
                break;
        }

        return signo;
    }


}
