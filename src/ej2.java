import javax.swing.*;

public class ej2 {
    public static void main(String[] args) {
        String peso_str = JOptionPane.showInputDialog("Ingrese su peso: ");
        String duracion_str = JOptionPane.showInputDialog("Ingrese el tiempo que estuvo haciendo ejercicio en minutos: ");
        String actividad = JOptionPane.showInputDialog("Ingrese la actividad realizada:\n Correr\n Nadar\n Bicicleta");
        int duracion = Integer.parseInt(duracion_str);
        float peso = Float.parseFloat(peso_str);
        float gasto_calorico;
        String actividad_may = actividad.toUpperCase();
        gasto_calorico = 0;
        if (peso >= 0 && peso <= 49) {
            if (actividad_may.equals("CORRER")) {
                gasto_calorico = duracion * 7;
            }
            if (actividad_may.equals("NADAR")) {
                gasto_calorico = duracion * 4;
            }
            if (actividad_may.equals("BICICLETA")) {
                gasto_calorico = duracion * 5;
            }
        }
        if (peso >= 50 && peso <= 59) {
            if (actividad_may.equals("CORRER")) {
                gasto_calorico = duracion * 9;
            }
            if (actividad_may.equals("NADAR")) {
                gasto_calorico = duracion * 6;
            }
            if (actividad_may.equals("BICICLETA")) {
                gasto_calorico = duracion * 7;
            }
        }
        if (peso >= 60 && peso <= 69) {
            if (actividad_may.equals("CORRER")) {
                gasto_calorico = duracion * 10;
            }
            if (actividad_may.equals("NADAR")) {
                gasto_calorico = duracion * 7;
            }
            if (actividad_may.equals("BICICLETA")) {
                gasto_calorico = duracion * 8;
            }
        }
        if (peso >= 70 && peso <= 79) {
            if (actividad_may.equals("CORRER")) {
                gasto_calorico = duracion * 11;
            }
            if (actividad_may.equals("NADAR")) {
                gasto_calorico = duracion * 8;
            }
            if (actividad_may.equals("BICICLETA")) {
                gasto_calorico = duracion * 9;
            }
        }
        if (peso >= 80 && peso <= 89) {
            if (actividad_may.equals("CORRER")) {
                gasto_calorico = duracion * 13;
            }
            if (actividad_may.equals("NADAR")) {
                gasto_calorico = duracion * 9;
            }
            if (actividad_may.equals("BICICLETA")) {
                gasto_calorico = duracion * 10;
            }
        }
        if (peso >= 90 && peso <= 99) {
            if (actividad_may.equals("CORRER")) {
                gasto_calorico = duracion * 14;
            }
            if (actividad_may.equals("NADAR")) {
                gasto_calorico = duracion * 10;
            }
            if (actividad_may.equals("BICICLETA")) {
                gasto_calorico = duracion * 12;
            }
        }
        if (peso >= 100 && peso <= 109) {
            if (actividad_may.equals("CORRER")) {
                gasto_calorico = duracion * 16;
            }
            if (actividad_may.equals("NADAR")) {
                gasto_calorico = duracion * 11;
            }
            if (actividad_may.equals("BICICLETA")) {
                gasto_calorico = duracion * 14;
            }
        }
        if (peso >= 110) {
            if (actividad_may.equals("CORRER")) {
                gasto_calorico = duracion * 19;
            }
            if (actividad_may.equals("NADAR")) {
                gasto_calorico = duracion * 12;
            }
            if (actividad_may.equals("BICICLETA")) {
                gasto_calorico = duracion * 16;
            }
        }
        JOptionPane.showMessageDialog(null, "Quemaste " + gasto_calorico + " kcal");
    }
}
