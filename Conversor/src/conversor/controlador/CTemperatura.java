/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor.controlador;

/**
 *
 * @author RERS
 */
public class CTemperatura {

    public static double convertir(Double valor, String temp, String tempFinal) {
        double resultado = 0;

        switch (temp) {
            case "CELSIUS":
                switch (tempFinal) {
                    case "KELVIN":
                        resultado = valor + 273.15;
                        break;
                    case "FARENHEIT":
                        resultado = (valor * 1.8) + 32;
                        break;
                    default:
                        resultado = valor;
                }
                break;
                
            case "FARENHEIT":
                switch (tempFinal) {
                    case "KELVIN":
                        resultado = ((valor - 32) * 0.55) + 273.15;
                        break;
                    case "CELSIUS":
                        resultado = (valor - 32) * 0.55;
                        break;
                    default:
                        resultado = valor;
                }
                break;
                
            case "KELVIN":
                switch (tempFinal) {
                    case "FARENHEIT":
                        resultado = ((valor - 273.15) * 1.8) + 32;
                        break;
                    case "CELSIUS":
                        resultado = valor - 273.15;
                        break;
                    default:
                        resultado = valor;
                }
                break;
        }
        return resultado;
    }
}
