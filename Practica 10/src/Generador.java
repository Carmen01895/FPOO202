import java.security.SecureRandom;
import javax.swing.JOptionPane;

public class Generador {
    public String minusculas = "abcdefghijklmnñopqrstuvwxyz";
    String mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    String numeros = "0123456789";
    String especiales = "!@#$%&*";
    int longitud = 8; // Longitud por defecto
    boolean incluirMayusculas = false;
    boolean incluirEspeciales = false;
    SecureRandom random = new SecureRandom();

    public String generar() {
        String caracteres = minusculas + numeros; // Caracteres base

        if (incluirMayusculas) {
            caracteres += mayusculas;
        }
        if (incluirEspeciales) {
            caracteres += especiales;
        }

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int randomIndex = random.nextInt(caracteres.length());
            password.append(caracteres.charAt(randomIndex));
        }

        return password.toString();
    }

    public String fortaleza(String password) {
        boolean tieneMinusculas = password.matches(".*[a-zñ].*");
        boolean tieneMayusculas = password.matches(".*[A-ZÑ].*");
        boolean tieneNumeros = password.matches(".*\\d.*");
        boolean tieneEspeciales = password.matches(".*[!@#$%&*].*");

        int fortaleza = 0;

        if (password.length() >= 8) {
            fortaleza++;
        }

        if (tieneMinusculas) fortaleza++;
        if (tieneMayusculas) fortaleza++;
        if (tieneNumeros) fortaleza++;
        if (tieneEspeciales) fortaleza++;

        if (fortaleza <= 2) {
            return "Débil";
        } else if (fortaleza <= 4) {
            return "Moderada";
        } else {
            return "Fuerte";
        }
    }
    }