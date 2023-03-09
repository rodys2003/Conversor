package conversor.modelo;

import java.util.Map;
import java.util.HashMap;

public class Divisa {

    private Map<String, Double> divisas;

    public Divisa() {
        divisas = new HashMap<>();
        divisas.put("USD", 1.0);
        divisas.put("EUR", 1.1929);
        divisas.put("GBP", 1.3892);
        divisas.put("JPY", 0.009039);
    }

}
