package com.erick.conversordemonedas.Test;

import com.erick.conversordemonedas.api.ClienteApi;
import com.erick.conversordemonedas.modelo.TasaDeCambio;

public class TestApi {
    public static void main(String[] args) {
        ClienteApi miCliente = new ClienteApi();
        TasaDeCambio misTasas = miCliente.buscarConversoresDeCambio();

        if(misTasas!=null){
            System.out.println(misTasas);
        }else{
            System.out.println("Ocurrio un error al obtener las tasas de Conversion");
        }
    }
}
