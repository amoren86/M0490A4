package sockets.url;

import java.net.URL;

public class UrlPartsExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com:443/docs/index.html?lang=ca");

        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Path: " + url.getPath());
        System.out.println("Query: " + url.getQuery());
    }
}
