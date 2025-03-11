import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(" ", " ", " ",
                "", "", "");

        while (true) {
            estudiante.SolicitarInfo();
            estudiante.matricula();
        }
    }
}