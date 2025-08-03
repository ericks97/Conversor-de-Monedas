package com.challenge.conversordemonedas.servicio;

import com.challenge.conversordemonedas.api.ClienteApi;
import com.challenge.conversordemonedas.modelo.TasaDeCambio;

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
