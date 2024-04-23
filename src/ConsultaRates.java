import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaRates {
    public Rates consulta (String cambio){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/15eaee3648c4d592d7252421/latest/"+cambio);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
        HttpResponse <String> response;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        return new Gson().fromJson(response.body(), Rates.class);
        } catch (Exception e) {
            throw new RuntimeException("Error");
        }
    }

}

