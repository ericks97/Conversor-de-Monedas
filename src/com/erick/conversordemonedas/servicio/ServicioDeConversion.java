package com.erick.conversordemonedas.servicio;

import com.erick.conversordemonedas.api.ClienteApi;
import com.erick.conversordemonedas.modelo.TasaDeCambio;

import java.util.Map;

public class ServicioDeConversion {
    public Double realizarConversion(String monedaOrigen, String monedaDestino, double cantidad){
        ClienteApi miCliente = new ClienteApi();
        TasaDeCambio misTasas = miCliente.buscarConversoresDeCambio();
        Map<String, Double> mapaDeTasas = misTasas.getConversion_rates();

        if (monedaOrigen.equals("USD")){
            Double tasa = mapaDeTasas.get(monedaDestino);
            return cantidad*tasa;

        }else{
            Double tasa = mapaDeTasas.get(monedaOrigen);
            return cantidad / tasa;
        }
    }


}
