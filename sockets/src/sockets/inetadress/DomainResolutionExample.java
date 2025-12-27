package sockets.inetadress;

import java.net.InetAddress;

public class DomainResolutionExample {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("www.google.com");

        System.out.println("Domain: " + address.getHostName());
        System.out.println("IP: " + address.getHostAddress());
    }
}
