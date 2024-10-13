import javax.swing.*;

public class ej3 {
    public static void main(String[] args) {
        String condicion = JOptionPane.showInputDialog("Ingrese su condición física:\n 1 - Principiante\n 2 - Intermedio\n 3 - Avanzado");
        String objetivo = JOptionPane.showInputDialog("Ingrese su objetivo físico:\n 1 - Volumen\n 2 - Definición");
        String condicion_may = condicion.toUpperCase();
        String objetivo_may = objetivo.toUpperCase();
        if (condicion_may.equals("PRINCIPIANTE")) {
            if (objetivo_may.equals("VOLUMEN")) {
                JOptionPane.showMessageDialog(null, "DIA 1: Pecho y Triceps\n Press de banca con barra (3x12)\n Press inclinado con mancuernas (3x12)\n Apertura con mancuernas (3x12)\n Fondos en paralelas (3x12)\n Extenciones de tríceps en polea (3x12)\n\n DIA 2: Espalda y Bíceps\n Dominadas (3x10)\n Remo en barra (3x12)\n Remo en mancuernas (3x12)\n Curl con barra (3x12)\n Curl con mancuernas (3x12)\n\n DIA 3: Piernas y Hombros\n Sentadillas (3x12)\n Prensa de piernas (3x12)\n Peso muerto rumano (3x12)\n Press militar con mancuernas (3x12)\n Elevaciones laterales con mancuernas (3x12)\n\n DIA 4: Cuerpo Completo\n Press de banca con barra (3x12)\n Dominadas (3x10)\n Sentadillas (3x12)\n Press militar con mancuernas (3x12)\n Curl con barra (3x12)\n\n Entre cada serie debe haber 2 MINUTOS DE DESCANSO");
            }
            if (objetivo_may.equals("DEFINICION")) {
                JOptionPane.showMessageDialog(null, "DIA 1: Pecho y Triceps\n Press de banca con barra (3x15)\n Press inclinado con mancuernas (3x15)\n Apertura con mancuernas (3x15)\n Fondos en paralelas (3x15)\n Extenciones de tríceps en polea (3x15)\n\n DIA 2: Espalda y Bíceps\n Dominadas (3x12)\n Remo en barra (3x15)\n Remo en mancuernas (3x15)\n Curl con barra (3x15)\n Curl con mancuernas (3x15)\n\n DIA 3: Piernas y Hombros\n Sentadillas (3x15)\n Prensa de piernas (3x15)\n Peso muerto rumano (3x15)\n Press militar con mancuernas (3x15)\n Elevaciones laterales con mancuernas (3x15)\n\n DIA 4: Cuerpo Completo\n Press de banca con barra (3x15)\n Dominadas (3x12)\n Sentadillas (3x15)\n Press militar con mancuernas (3x15)\n Curl con barra (3x15)\n\n Entre cada serie debe haber 1 MINUTO DE DESCANSO");
            }
        }
        if (condicion_may.equals("INTERMEDIO")) {
            if (objetivo_may.equals("VOLUMEN")) {
                JOptionPane.showMessageDialog(null, "DIA 1: Pecho y Triceps\n Press de banca con barra (4x10)\n Press inclinado con mancuernas (4x10)\n Apertura con mancuernas (4x10)\n Fondos en paralelas (4x10)\n Extenciones de tríceps en polea (4x10)\n\n DIA 2: Espalda y Bíceps\n Dominadas (4x8)\n Remo en barra (4x10)\n Remo en mancuernas (4x10)\n Curl con barra (4x10)\n Curl con mancuernas (4x10)\n\n DIA 3: Piernas y Hombros\n Sentadillas (4x10)\n Prensa de piernas (4x10)\n Peso muerto rumano (4x10)\n Press militar con mancuernas (4x10)\n Elevaciones laterales con mancuernas (4x10)\n\n DIA 4: Cuerpo Completo\n Press de banca con barra (4x10)\n Dominadas (4x8)\n Sentadillas (4x10)\n Press militar con mancuernas (4x10)\n Curl con barra (4x10)\n\n Entre cada serie debe haber 2 MINUTOS DE DESCANSO");
            }
            if (objetivo_may.equals("DEFINICION")) {
                JOptionPane.showMessageDialog(null, "DIA 1: Pecho y Triceps\n Press de banca con barra (4x12)\n Press inclinado con mancuernas (4x12)\n Apertura con mancuernas (4x12)\n Fondos en paralelas (4x12)\n Extenciones de tríceps en polea (4x12)\n\n DIA 2: Espalda y Bíceps\n Dominadas (4x10)\n Remo en barra (4x12)\n Remo en mancuernas (4x12)\n Curl con barra (4x12)\n Curl con mancuernas (4x12)\n\n DIA 3: Piernas y Hombros\n Sentadillas (4x12)\n Prensa de piernas (4x12)\n Peso muerto rumano (4x12)\n Press militar con mancuernas (4x12)\n Elevaciones laterales con mancuernas (4x12)\n\n DIA 4: Cuerpo Completo\n Press de banca con barra (4x12)\n Dominadas (4x10)\n Sentadillas (4x12)\n Press militar con mancuernas (4x12)\n Curl con barra (4x12)\n\n Entre cada serie debe haber 1 MINUTO DE DESCANSO");
            }
        }
        if (condicion_may.equals("AVANZADO")) {
            if (objetivo_may.equals("VOLUMEN")) {
                JOptionPane.showMessageDialog(null, "DIA 1: Pecho y Triceps\n Press de banca con barra (5x8)\n Press inclinado con mancuernas (5x8)\n Apertura con mancuernas (5x8)\n Fondos en paralelas (5x8)\n Extenciones de tríceps en polea (5x8)\n\n DIA 2: Espalda y Bíceps\n Dominadas (5x8)\n Remo en barra (5x8)\n Remo en mancuernas (5x8)\n Curl con barra (5x8)\n Curl con mancuernas (5x8)\n\n DIA 3: Piernas y Hombros\n Sentadillas (5x8)\n Prensa de piernas (5x8)\n Peso muerto rumano (5x8)\n Press militar con mancuernas (5x8)\n Elevaciones laterales con mancuernas (5x8)\n\n DIA 4: Cuerpo Completo\n Press de banca con barra (5x8)\n Dominadas (5x8)\n Sentadillas (5x8)\n Press militar con mancuernas (5x8)\n Curl con barra (5x8)\n\n Entre cada serie debe haber 2 MINUTOS DE DESCANSO");
            }
            if (objetivo_may.equals("DEFINICION")) {
                JOptionPane.showMessageDialog(null, "DIA 1: Pecho y Triceps\n Press de banca con barra (5x10)\n Press inclinado con mancuernas (5x10)\n Apertura con mancuernas (5x10)\n Fondos en paralelas (5x10)\n Extenciones de tríceps en polea (5x10)\n\n DIA 2: Espalda y Bíceps\n Dominadas (5x8)\n Remo en barra (5x10)\n Remo en mancuernas (5x10)\n Curl con barra (5x10)\n Curl con mancuernas (5x10)\n\n DIA 3: Piernas y Hombros\n Sentadillas (5x10)\n Prensa de piernas (5x10)\n Peso muerto rumano (5x10)\n Press militar con mancuernas (5x10)\n Elevaciones laterales con mancuernas (5x10)\n\n DIA 4: Cuerpo Completo\n Press de banca con barra (5x10)\n Dominadas (5x8)\n Sentadillas (5x10)\n Press militar con mancuernas (5x10)\n Curl con barra (5x10)\n\n Entre cada serie debe haber 1 MINUTO DE DESCANSO");
            }
        }

    }
}
