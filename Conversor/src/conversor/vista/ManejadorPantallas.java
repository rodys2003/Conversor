package conversor.vista;

import javax.swing.JOptionPane;

public class ManejadorPantallas {

    private static VConMoneda pantallaMoneda;
    private static VMenu pantallaMenu;
    private static VConTemperatura pantallaTemperatura;

    //Metodos para controlar las pantallas 
    public static void abrirPantallaMenu() {
        pantallaMenu = new VMenu();//se crea un objeto VMenu y su referencia sera pantallaMenu
        pantallaMenu.setVisible(true); //Permite  que puedas mostar a VMenu en pantalla
        pantallaMenu.setLocationRelativeTo(null); //cuando la ventana se abra aparecera en el centro de la pantalla
    }

    public static void cerrarPantallaMenu() {
        pantallaMenu.setVisible(false);
        pantallaMenu = null;
        JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO, TEN UN BONITO DIA");
    }

    public static void abrirPantallaMoneda() {
        pantallaMoneda = new VConMoneda();
        pantallaMoneda.setVisible(true);
        pantallaMoneda.setLocationRelativeTo(null);
    }

    public static void cerraPantallaMoneda() {
        pantallaMoneda.setVisible(false);
        pantallaMoneda = null;
    }

    public static void abrirPantallaTemperatura() {
        pantallaTemperatura = new VConTemperatura();
        pantallaTemperatura.setVisible(true);
        pantallaTemperatura.setLocationRelativeTo(null);
    }
    
     public static void cerraPantallaTemperatura() {
        pantallaTemperatura.setVisible(false);
        pantallaTemperatura = null;
    }
}
