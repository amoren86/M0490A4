package sockets.url;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("GET");

        System.out.println("Response code: " + conn.getResponseCode());
    }
}
