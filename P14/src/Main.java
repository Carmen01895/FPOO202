public class Main {
    public static void main(String[] args) {

        SpartanII jefemaestro = new SpartanII("John", 90, "Rifle de Asalto", 0);
        jefemaestro.mostrarInfo();
        jefemaestro.usarManejoAvanzado();
        jefemaestro.atacar("Convenant");
        jefemaestro.recibirDano(50);
        jefemaestro.recargarEscudo();

        SpartanIII jefemaestro2 = new SpartanIII("Car", 90, "Rifle de Asalto", 0);
        jefemaestro2.mostrarInfo();
        jefemaestro2.camuflajeActivo();
        jefemaestro2.atacar("Convenant");
        jefemaestro2.recibirDano(50);
        jefemaestro2.recargarEscudo();

        SpartanIV jefemestro3 = new SpartanIV("Juan", 90, "Rifle de Asalto", 0);
        jefemestro3.mostrarInfo();
        jefemestro3.usarPropulsores();
        jefemestro3.atacar("Convenant");
        jefemestro3.recibirDano(50);
        jefemestro3.recargarEscudo();
    }
}