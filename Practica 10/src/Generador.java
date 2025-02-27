import java.security.SecureRandom;
import javax.swing.JOptionPane;

public class Generador {
    private String minusculas = "abcdefghijklmnñopqrstuvwxyz";
    private String mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    private String numeros = "0123456789";
    private String especiales = "!@#$%&*";
    private int longitud = 8;
    private boolean incluirMayusculas = false;
    private boolean incluirEspeciales = false;
    private String input;
    private int respuestaMayusculas;
    private int respuestaEspeciales;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getRespuestaMayusculas() {
        return respuestaMayusculas;
    }

    public void setRespuestaMayusculas(int respuestaMayusculas) {
        this.respuestaMayusculas = respuestaMayusculas;
    }

    public int getRespuestaEspeciales() {
        return respuestaEspeciales;
    }

    public void setRespuestaEspeciales(int respuestaEspeciales) {
        this.respuestaEspeciales = respuestaEspeciales;
    }




    public String getMinusculas() {
        return minusculas;
    }

    public void setMinusculas(String minusculas) {
        this.minusculas = minusculas;
    }

    public String getMayusculas() {
        return mayusculas;
    }

    public void setMayusculas(String mayusculas) {
        this.mayusculas = mayusculas;
    }

    public String getNumeros() {
        return numeros;
    }

    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }

    public String getEspeciales() {
        return especiales;
    }

    public void setEspeciales(String especiales) {
        this.especiales = especiales;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean isIncluirMayusculas() {
        return incluirMayusculas;
    }

    public void setIncluirMayusculas(boolean incluirMayusculas) {
        this.incluirMayusculas = incluirMayusculas;
    }

    public SecureRandom getRandom() {
        return random;
    }

    public void setRandom(SecureRandom random) {
        this.random = random;
    }

    public boolean isIncluirEspeciales() {
        return incluirEspeciales;
    }

    public void setIncluirEspeciales(boolean incluirEspeciales) {
        this.incluirEspeciales = incluirEspeciales;
    }

    public Generador() {
        this.minusculas = minusculas;
        this.mayusculas = mayusculas;
        this.numeros = numeros;
        this.especiales = especiales;
        this.longitud = longitud;
        this.incluirMayusculas = incluirMayusculas;
        this.incluirEspeciales = incluirEspeciales;
    }

    SecureRandom random = new SecureRandom();

    public String generar() {
        String caracteres = minusculas + numeros;

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