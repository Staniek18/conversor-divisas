import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDeDivisas {

    public Monedas buscarTipoMoneda(String mBase, String mCambio){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/f9e3d674186930855939acf2/pair/"+mBase+"/"+mCambio);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Monedas.class);

        } catch (Exception e) {
            throw new RuntimeException("No se encontró la divisa ingresada");
        }


    }
}
