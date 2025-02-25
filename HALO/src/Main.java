public class Main {
    public static void main(String[] args) {

        //crear el primer objeto
        Spartan masterChief = new Spartan("John",80,100,"Rifle de Salto");


        //invocamos metodos
        masterChief.mostrarInfo();
        masterChief.atacar("Grunt");
        masterChief.recargarArma(75);
        masterChief.correr(true);

        //Segundo Objeto

        Spartan TheBest = new Spartan("Car", 100, 100,"M99 Stanchion");

        TheBest.mostrarInfo();
        TheBest.atacar("Rom");
        TheBest.recargarArma(75);
        TheBest.correr(true);
    }
}