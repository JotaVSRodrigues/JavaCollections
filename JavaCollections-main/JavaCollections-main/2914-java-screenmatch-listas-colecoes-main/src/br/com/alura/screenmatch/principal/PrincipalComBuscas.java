package br.com.alura.screenmatch.principal;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.io.IOException;
import java.time.Duration; // For setting timeouts

public class PrincipalComBuscas  {
    public static void main(String[] args) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().
                    uri(URI.create("https://www.omdbapi.com/?i=tt3896198&apikey=1ed8810a")).
                    build();

            HttpResponse response = client.
                    send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
