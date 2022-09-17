import java.net.URLEncoder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;


public class Main {
    public static void main( String[] args ) throws Exception{
        // Host url
        //String host = "http://api.weatherapi.com/";
        // Headers for a request
        /*String x_rapidapi_host = "api.weatherapi.com";
        String x_rapidapi_key = "6dd88670beff4270bf9141611221609";//Type here your key*/

        String i = "tt0110912";
        String charset = "UTF-8";
        // Формат запроса для предотвращения проблем с кодировкой
        String query = String.format("i=%s",
                URLEncoder.encode(i, charset));
        // JSON-ответ
        String k = "Kazan";
        HttpResponse <String> response1 = Unirest.get("http://api.weatherapi.com/v1/current.json?key=6dd88670beff4270bf9141611221609&q="+ k +"&aqi=yes")
                .header("X-RapidAPI-Key", "6dd88670beff4270bf9141611221609")
                .header("X-RapidAPI-Host", "api.weatherapi.com")
                .asString();
        //Prettifying
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(response1.getBody().toString());
        String prettyJsonString = gson.toJson(je);
        System.out.println(prettyJsonString);
    }
}
