package sockets.url;

import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionExample {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.example.com");
		URLConnection connection = url.openConnection();

		System.out.println("Content type: " + connection.getContentType());
		System.out.println("Content length: " + connection.getContentLengthLong());
	}
}
