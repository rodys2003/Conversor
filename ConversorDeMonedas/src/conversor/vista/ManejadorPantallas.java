package conversor.vista;

import javax.swing.JOptionPane;

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
        JOptionPane.showMessageDialog(null, "GACIAS, TEN UN BONITO DIA");
    }
   
    public static void abrirPantallaMoneda(){
    pantallaMoneda = new VConMoneda();
    pantallaMoneda.setVisible(true);
    pantallaMoneda.setLocationRelativeTo(null);
    }
   }
