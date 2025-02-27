import javax.swing.*;
public class Main{
public static void main(String[] args) {
    Generador g = new Generador();

    JOptionPane.showMessageDialog(null, "Generador de Passwords");

    g.setInput ( JOptionPane.showInputDialog(null, "Digite el número de caracteres (8 por defecto):",
            JOptionPane.QUESTION_MESSAGE));

    if (g.getInput() != null && !g.getInput().trim().isEmpty()) {
        g.setLongitud(Integer.parseInt(g.getInput()));
    } else {
        JOptionPane.showMessageDialog(null, "Longitud por defecto: 8 caracteres.");
    }

    g.setRespuestaMayusculas(JOptionPane.showConfirmDialog(null,
            "¿Desea incluir mayúsculas?", "Opciones", JOptionPane.YES_NO_OPTION));
    g.setIncluirMayusculas((g.getRespuestaMayusculas () == JOptionPane.YES_OPTION));

    g.setRespuestaEspeciales (JOptionPane.showConfirmDialog(null,
            "¿Desea incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION));
    g.setIncluirEspeciales((g.getRespuestaEspeciales () == JOptionPane.YES_OPTION));

    JOptionPane.showMessageDialog(null, "Su password es: " + g.generar(),
            "Password Generado", JOptionPane.INFORMATION_MESSAGE);


    JOptionPane.showMessageDialog(null, "Fortaleza del password: " + g.fortaleza(g.generar()),
            "Fortaleza", JOptionPane.INFORMATION_MESSAGE);
    }
}


