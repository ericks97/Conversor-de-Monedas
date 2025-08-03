package com.challenge.conversordemonedas.api;

import com.challenge.conversordemonedas.modelo.TasaDeCambio;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClienteApi {
    public TasaDeCambio buscarConversoresDeCambio() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/06276b9a9b5a0076254f7b68/latest/USD"))
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String json = response.body();
        Gson gson = new Gson();
        TasaDeCambio tasas = gson.fromJson(json, TasaDeCambio.class);
        return tasas;

    }

}

