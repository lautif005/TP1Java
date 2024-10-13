import javax.swing.*;

public class ej5 {
    public static void main(String[] args) {
        String distancia_str = JOptionPane.showInputDialog("Ingrese la distancia del viaje a realizar en kilómetros: ");
        String combustible_str = JOptionPane.showInputDialog("Ingrese el gasto de combustible del vehículo en litros por kilómetro");
        String precio_str = JOptionPane.showInputDialog("Ingrese el precio del combustible por litro");
        float distancia = Float.parseFloat(distancia_str);
        float combustible = Float.parseFloat(combustible_str);
        float precio = Float.parseFloat(precio_str);
        float costo = (distancia * combustible) * precio;
        JOptionPane.showMessageDialog(null, "El costo total es: " + costo);
    }
}
