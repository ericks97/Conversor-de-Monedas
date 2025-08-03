package com.erick.conversordemonedas.modelo;

import java.util.Map;

public class TasaDeCambio {
    private Map<String, Double> conversion_rates;
    private String documentation;
    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

//    public String getDocumentation() {
//        return documentation;
//    }

    @Override
    public String toString() {
        return "TasaDeCambio:\n" + conversion_rates
//                +"\n" +
//                "" + documentation;
        ;
    }
}
