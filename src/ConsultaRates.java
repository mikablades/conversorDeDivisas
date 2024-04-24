import com.google.gson.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaRates {
    public static RatesObj consulta(String divOrigen, String divSalida, double valorSalida) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/15eaee3648c4d592d7252421/pair/" + divOrigen + "/" + divSalida + "/" + valorSalida);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

        } catch (Exception e) {
            throw new RuntimeException("Error");
        }
        return new Gson().fromJson(response.body(), RatesObj.class);


    }

}

