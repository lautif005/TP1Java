import javax.swing.*;

public class ej4 {
    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            String emocion = JOptionPane.showInputDialog("Ingrese su emoción actual:\n 1 - Feliz\n 2 - Triste\n 3 - Enérgico\n 4 - Relajado");
            String emocion_min = emocion.toLowerCase();
            if (emocion_min.equals("feliz")) {
                JOptionPane.showMessageDialog(null, "CANCIONES RECOMENDADAS:\n - 'Happy' by Pharrell Williams\n - 'Good Life' by OneRepublic\n - 'Don't Stop Me Now' by Queen");
            } else if (emocion_min.equals("triste")) {
                JOptionPane.showMessageDialog(null, "CANCIONES RECOMENDADAS:\n - 'Fix You' by Coldplay\n - 'Someone Like You' by Adele\n - 'Landslide' by Fleetwood Mac");
            } else if (emocion_min.equals("energico") || emocion_min.equals("enérgico")) {
                JOptionPane.showMessageDialog(null, "CANCIONES RECOMENDADAS:\n - 'Can't Stop the Feeling!' by Justin Timberlake\n - 'Uptown Funk' by Mark Ronson ft. Bruno Mars\n - 'On the Top of the World' by Imagine Dragons");
            } else if (emocion_min.equals("relajado")) {
                JOptionPane.showMessageDialog(null, "CANCIONES RECOMENDADAS:\n - 'Weightless' by Marconi Union\n - 'Clair de Lune' by Claude Debussy\n - 'Spiegel im Spiegel' by Arvo Pärt");
            } else {
                JOptionPane.showMessageDialog(null, "Emoción no parte de las opciones");
            }
            String opcion = JOptionPane.showInputDialog("¿Quiere?:\n - Continuar\n - Salir");
            if (opcion.equals("continuar")) {
                continuar = true;
            } else if (opcion.equals("salir")) {
                continuar = false;
            } else {
                JOptionPane.showMessageDialog(null, "No es parte de las opciones");
                continuar = false;
            }
        }
    }
}
