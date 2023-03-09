package conversor;
import java.util.HashMap;
import java.util.Map;
import conversor.vista.ManejadorPantallas;
import java.text.DecimalFormat;

public class Conversor {

    public static void main(String[] args) {
       ManejadorPantallas.abrirPantallaMoneda();
       
      /*
        double numero = 1283097142.40;
        
        // Creamos un objeto DecimalFormat con el formato que queremos
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        // Formateamos el número con el objeto DecimalFormat
        String numeroFormateado = df.format(numero);
        
        // Imprimimos el resultado
        System.out.println("Número original: " + numero);
        System.out.println("Número formateado: " + numeroFormateado);
      
      
      */
        /*Map<String, Double> divisas = new HashMap<>();

       divisas.put("USD", 1.0);
        divisas.put("EUR", 0.95);
        divisas.put("JPY", 137.30);
        divisas.put("COP", 4750.94);

        // Imprimir el mapa de divisas
        System.out.println("Divisas y valores de cambio:");
        System.out.println(divisas);

        // Convertir de USD a EUR
        double usd = 100.0;
        double eur = convertirDivisa("USD", "EUR", usd, divisas);

        // Imprimir resultado
        System.out.println(usd + " USD equivale a " + eur + " EUR.");

        // Convertir de USD a COP
        double cop = convertirDivisa("USD", "COP", usd, divisas);

        // Imprimir resultado
        System.out.println(usd + " USD equivale a " + cop + " COP.");

        // Convertir de COP a USD
        double cop2 = 5000000.0;
        double usd2 = convertirDivisa("COP", "USD", cop2, divisas);

        // Imprimir resultado
        System.out.println(cop2 + " COP equivale a " + usd2 + " USD.");
        */
    }
/*
    public static double convertirDivisa(String divisaInicial, String divisaFinal, double cantidad, Map<String, Double> divisas) {
        double valorDivisaInicial = divisas.get(divisaInicial);
        double valorDivisaFinal = divisas.get(divisaFinal);

        return (cantidad / valorDivisaInicial) * valorDivisaFinal;
    }*/
}
