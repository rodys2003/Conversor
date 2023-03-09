package conversor.vista;

public class ManejadorPantallas {

    private static VConMoneda pantallaMoneda;
    private static VMenu pantallaMenu;

    public static void abrirPantallaMenu() {
        pantallaMenu = new VMenu();
        pantallaMenu.setVisible(true);
        pantallaMenu.setLocationRelativeTo(null);
    }

    public static void cerrarPantallaMenu() {
        pantallaMenu.setVisible(false);
        pantallaMenu = null;
    }
   
    public static void abrirPantallaMoneda(){
    pantallaMoneda = new VConMoneda();
    pantallaMoneda.setVisible(true);
    pantallaMoneda.setLocationRelativeTo(null);
    }
   }
