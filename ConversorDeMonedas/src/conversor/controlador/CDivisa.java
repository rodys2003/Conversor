package conversor.controlador;

import java.text.DecimalFormat;

public class CDivisa {

    public static String msj(double valor, String divisa) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        String txt =df.format(valor );
        return txt + "  " + divisa;
    }

    public static Double convertir(double valor, String divisa, String divisaFinal) {
        double resultado = 0;

        switch (divisa) {
            case "COP":
                // El código dentro de este bloque se ejecutará si la divisa de origen es COP (pesos colombianos).
                switch (divisaFinal) {
                    // Este bloque `switch` se utiliza para determinar la tasa de cambio correspondiente según la divisa de destino.
                    case "USD":
                        resultado = valor * 0.00021;
                        break;
                    case "MXN":
                        resultado = valor * 0.0038;
                        break;
                    case "GBP":
                        resultado = valor * 0.00018;
                        break;
                    case "JPY":
                        resultado = valor * 0.029;
                        break;
                    case "EUR":
                        resultado = valor * 0.00020;
                        break;
                    default:
                        resultado = valor;
                        break;
                }
                break;

            case "USD":
                switch (divisaFinal) {
                    case "EUR":
                        resultado = valor * 0.94;
                        break;
                    case "COP":
                        resultado = valor * 4748.06;
                        break;
                    case "MXN":
                        resultado = valor * 18.07;
                        break;
                    case "GBP":
                        resultado = valor * 0.84;
                        break;
                    case "JPY":
                        resultado = valor * 136.11;
                        break;
                    default:
                        resultado = valor;
                        break;
                }
                break;

            case "EUR":
                switch (divisaFinal) {
                    case "USD":
                        resultado = valor * 1.06;
                        break;
                    case "COP":
                        resultado = valor * 5027.96;
                        break;
                    case "MXN":
                        resultado = valor * 19.12;
                        break;
                    case "GBP":
                        resultado = valor * 0.89;
                        break;
                    case "JPY":
                        resultado = valor * 144.06;
                        break;
                    default:
                        resultado = valor;
                        break;
                }
                break;

            case "MXN":
                switch (divisaFinal) {
                    case "USD":
                        resultado = valor * 0.055;
                        break;
                    case "COP":
                        resultado = valor * 262.85;
                        break;
                    case "EUR":
                        resultado = valor * 0.052;
                        break;
                    case "GBP":
                        resultado = valor * 0.046;
                        break;
                    case "JPY":
                        resultado = valor * 7.53;
                        break;
                    default:
                        resultado = valor;
                        break;
                }
                break;

            case "GBP":
                switch (divisaFinal) {
                    case "USD":
                        resultado = valor * 1.19;
                        break;
                    case "COP":
                        resultado = valor * 5660.59;
                        break;
                    case "EUR":
                        resultado = valor * 1.13;
                        break;
                    case "MXN":
                        resultado = valor * 21.55;
                        break;
                    case "JPY":
                        resultado = valor * 162.24;
                        break;
                    default:
                        resultado = valor;
                        break;
                }
                break;

            case "JPY":
                switch (divisaFinal) {
                    case "USD":
                        resultado = valor * 0.0073;
                        break;
                    case "COP":
                        resultado = valor * 34.91;
                        break;
                    case "EUR":
                        resultado = valor * 0.0069;
                        break;
                    case "MXN":
                        resultado = valor * 0.13;
                        break;
                    case "GBP":
                        resultado = valor * 0.0062;
                        break;
                    default:
                        resultado = valor;
                        break;
                }
                break;

            default:
                resultado = valor;
                break;
        }

        return resultado;
    }

    /* Funcionando
    public static Double convertir(double valor, String divisa, String divisaFinal, double resultado) {

        switch (divisa) {
            case "COP":
                if (divisaFinal.equals("EUR")) {
                    resultado = valor * 0.00020;
                    // Si la divisa de destino es EUR (euros), se multiplica el valor en pesos colombianos por la tasa de cambio aproximada de COP a EUR.
                } else if (divisaFinal.equals("USD")) {
                    resultado = valor * 0.00021;
                } else if (divisaFinal.equals("LIBRA")) {
                    resultado = valor * 0.00018;
                } else if (divisaFinal.equals("YEN")) {
                    resultado = valor * 0.029;
                } else if (divisaFinal.equals("CHF")) {
                    resultado = valor * 0.00020;
                } else {
                    resultado = valor;
                    // Si la divisa de destino no se encuentra en la lista de opciones, se devuelve el valor original sin cambios.
                }
                break;
                
        }

        return resultado;
        // Se devuelve el resultado de la conversión.
    }
     */
}
