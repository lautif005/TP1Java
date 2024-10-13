import javax.swing.*;

public class ej6 {
    public static void main(String[] args) {
        String tiempoDiario_str = JOptionPane.showInputDialog("Ingrese cuantas horas libres para estudio tiene por dia");
        int tiempoDiario = Integer.parseInt(tiempoDiario_str);
        int matematica = 2;
        int organizacion_empresarial = 3;
        int sistemas_operativos = 3;
        int python = 6;
        int java = 6;
        if (tiempoDiario == 0 || tiempoDiario == 1 || tiempoDiario == 2) {
            JOptionPane.showMessageDialog(null, "Dedíquese a otra carrera");
        } else if (tiempoDiario == 3) {
            JOptionPane.showMessageDialog(null, "Lunes: 3hs de Organización Empresarial\n Martes: 3hs de Sistemas Operativos\n Miércoles: 3hs de Python\n Jueves: 3hs de Java\n Viernes: 3hs de Python\n Sábado: 3hs de Java\n Domingo: 2hs de Matemática");
        } else if (tiempoDiario == 4) {
            JOptionPane.showMessageDialog(null, "Lunes: 3hs de Organización Empresarial y 1h de Matemática\n Martes: 3hs de Sistemas Operativos y 1h de Matemática\n Miércoles: 2hs de Python y 2hs de Java\n Jueves: 2hs de Python y 2hs de Java\n Viernes: 2hs de Python y 2hs de Java");
        } else if (tiempoDiario == 5) {
            JOptionPane.showMessageDialog(null, "Lunes: 3hs de Organización Empresarial y 2hs de Matemática\n Martes: 2hs de Python, 2hs de Java y 1h de Sistemas Operativos\n Miércoles: 2hs de Python, 2hs de Java y 1h de Sistemas Operativos\n Jueves: 2hs de Python, 2hs de Java y 1h de Sistemas Operativos");
        } else if (tiempoDiario == 6) {
            JOptionPane.showMessageDialog(null, "Lunes: 3hs de Organización Empresarial y 3hs de Sistemas Operativos\n Martes: 3hs de Python y 3hs de Java\n Miércoles: 3hs de Python y 3hs de Java\n Jueves: 2hs de Matemática");
        } else if (tiempoDiario >= 7) {
            JOptionPane.showMessageDialog(null, "Lunes: 3hs de Organización Empresarial, 3hs de Sistemas Operativos y 1h de Matemática\n Martes: 3hs de Python, 3hs de Java y 1h de Matemática\n Miércoles: 3hs de Python y 3hs de Java");
        }
    }
}
