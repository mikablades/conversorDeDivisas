import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class ConsultaApi {
    public Map tipoDeCambio(String eleccion) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/15eaee3648c4d592d7252421/latest/" + eleccion);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Map.class);
        } catch (Exception e) {
            throw new RuntimeException("Error.");
        }
    }
}