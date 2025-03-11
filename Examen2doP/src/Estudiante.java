import javax.swing.*;
import java.security.SecureRandom;

public class Estudiante {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String añoCurso = "2025";
    private String añoNacimiento;
    private String Carrera;

    public String getAñoCurso() {
        return añoCurso;
    }

    public void setAñoCurso(String añoCurso) {
        this.añoCurso = añoCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(String añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public Estudiante(String nombre, String apellidoPaterno, String apellidoMaterno, String añoCurso,String añoNacimiento, String carrera) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.añoNacimiento = añoNacimiento;
        Carrera = carrera;
    }

    public void SolicitarInfo (){

        nombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre del Estudiante", "Información"
        , JOptionPane.QUESTION_MESSAGE);
        apellidoPaterno = JOptionPane.showInputDialog(null, "Ingrese el Apellido Paterno",
                "Información", JOptionPane.QUESTION_MESSAGE);
        apellidoMaterno = JOptionPane.showInputDialog(null, "Ingrese el Apellido Materno",
                "Información", JOptionPane.QUESTION_MESSAGE);
        añoNacimiento = JOptionPane.showInputDialog(null, "Ingrese su año de nacimiento",
                "Información", JOptionPane.QUESTION_MESSAGE);
        Carrera = JOptionPane.showInputDialog(null, "Ingrese la Carrera",
                "Información", JOptionPane.QUESTION_MESSAGE);
    }

    public void matricula (){
        String aleatorios = "0123456789";
        int longitud = 3;
        SecureRandom random = new SecureRandom();

        StringBuilder ale = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int randomIndex = random.nextInt(aleatorios.length());
            ale.append(aleatorios.charAt(randomIndex));
        }
        JOptionPane.showMessageDialog(null, "Su Matricula es: \n" + Carrera.substring(0,3).toUpperCase() + añoCurso.substring(2).toUpperCase()+
                añoNacimiento.substring(2).toUpperCase() + nombre.substring(0,1).toUpperCase() + apellidoPaterno.substring(0,3).toUpperCase() +
                apellidoMaterno.substring(0,3).toUpperCase() + ale);
    }
}
