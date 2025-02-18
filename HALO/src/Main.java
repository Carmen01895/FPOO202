public class Main {
    public static void main(String[] args) {

        //crear el primer objeto
        Spartan masterChief = new Spartan();

        //Usar atributos
        masterChief.nombre = "John";
        masterChief.salud = 100;
        masterChief.escudo = 80;
        masterChief.armaPrincipal = "Rifle de Salto";

        //invocamos metodos
        masterChief.mostrarInfo();
        masterChief.atacar("Grunt");
        masterChief.recargarArma(75);
        masterChief.correr(true);

        //Segundo Objeto

        Spartan TheBest = new Spartan();

        TheBest.nombre = "Car";
        TheBest.salud = 100;
        TheBest.escudo = 100;
        TheBest.armaPrincipal = "M99 Stanchion";

        TheBest.mostrarInfo();
        TheBest.atacar("Rom");
        TheBest.recargarArma(75);
        TheBest.correr(true);
    }
}