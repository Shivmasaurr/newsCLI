import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Newsfetcher {
    public void fetchnews (String query,String apikey) throws Exception{
        HttpClient Client =HttpClient.newBuilder().build();

        String baseurl="https://newsapi.org/v2/everything";
        String url = baseurl + "?q=" + query + "&apiKey=" + apikey;
        URI uri= URI.create(url);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();
        HttpResponse<String> response = Client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());




    }



}
