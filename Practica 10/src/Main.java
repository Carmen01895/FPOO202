import javax.swing.*;
public class Main{
public static void main(String[] args) {
    Generador g = new Generador();

    JOptionPane.showMessageDialog(null, "Generador de Passwords");

    String input = JOptionPane.showInputDialog(null, "Digite el número de caracteres (8 por defecto):",
            JOptionPane.QUESTION_MESSAGE);

    if (input != null && !input.trim().isEmpty()) {
        g.longitud = Integer.parseInt(input);
    } else {
        JOptionPane.showMessageDialog(null, "Longitud por defecto: 8 caracteres.");
    }

    int respuestaMayusculas = JOptionPane.showConfirmDialog(null,
            "¿Desea incluir mayúsculas?", "Opciones", JOptionPane.YES_NO_OPTION);
    g.incluirMayusculas = (respuestaMayusculas == JOptionPane.YES_OPTION);

    int respuestaEspeciales = JOptionPane.showConfirmDialog(null,
            "¿Desea incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION);
    g.incluirEspeciales = (respuestaEspeciales == JOptionPane.YES_OPTION);

    JOptionPane.showMessageDialog(null, "Su password es: " + g.generar(),
            "Password Generado", JOptionPane.INFORMATION_MESSAGE);


    JOptionPane.showMessageDialog(null, "Fortaleza del password: " + g.fortaleza(g.generar()),
            "Fortaleza", JOptionPane.INFORMATION_MESSAGE);
    }
}


