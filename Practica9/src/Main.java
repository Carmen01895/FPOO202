import javax.swing.JOptionPane;
public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Administracion admin = new Administracion();

        JOptionPane.showMessageDialog(null, "Bienvenido a tu Cuenta");

        admin.setTitular(JOptionPane.showInputDialog(null,
                "Ingrese su nombre", "Datos de la persona",
                JOptionPane.QUESTION_MESSAGE));

        admin.setCuenta(Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese su numero de cuenta", "Numero de cuenta",
                JOptionPane.QUESTION_MESSAGE)));

        admin.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese su Edad", "Edad del Titular",
                JOptionPane.QUESTION_MESSAGE)));


        if (admin.getTitular()!= null) {

            admin.setSaldo(JOptionPane.showInputDialog(null,
                    "Ingrese la cantidad con la que desea Iniciar ", "Saldo",
                    JOptionPane.QUESTION_MESSAGE));

            JOptionPane.showMessageDialog(null, "Bienvenid@ a tu cuenta \n" + admin.getTitular());


            while (true) {

                String[] opciones = {"Consultar saldo", "Ingresar", "Retirar", "Depositar a otra cuenta"};
                int opcion = JOptionPane.showOptionDialog(null,
                        "Seleccione la operación que desea realizar",
                        "Operaciones", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, opciones,
                        opciones[2]);

                switch (opcion) {
                    case 0:
                        admin.consulta();
                        break;
                    case 1:
                        admin.ingresa();
                        break;
                    case 2:
                        admin.retirar();
                        break;
                    case 3:
                        admin.depositoOtro();
                        break;
                }
                int continuar = JOptionPane.showConfirmDialog(null,
                        "¿Desea realizar otra operación?", "Continuar",
                        JOptionPane.YES_NO_OPTION);
                if (continuar == JOptionPane.NO_OPTION || continuar == JOptionPane.CLOSED_OPTION) {
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema. Hasta luego.");
                    return;
                }

            }
        }
    }
}