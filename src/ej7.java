import javax.swing.*;

public class ej7 {
    public static void main(String[] args) {
        String satisfaccion_str = JOptionPane.showInputDialog("¿Cuanto es su satisfacción con la vida del 1 al 10?");
        String salud_str = JOptionPane.showInputDialog("¿Cómo está su salud del 1 al 10?");
        String socializacion_str = JOptionPane.showInputDialog("¿Cómo va con sus relaciones sociales del 1 al 10?");
        String economia_str = JOptionPane.showInputDialog("¿Cuanto es su economía del 1 al 10?");
        float satisfaccion = Float.parseFloat(satisfaccion_str);
        float salud = Float.parseFloat(salud_str);
        float socializacion = Float.parseFloat(socializacion_str);
        float economia = Float.parseFloat(economia_str);
        float promedio = (satisfaccion + salud + socializacion + economia) / 4;
        JOptionPane.showMessageDialog(null, "Su índice de felicidad es de: " + promedio);




    }
}
