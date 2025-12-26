package sockets.inetadress;

import java.net.InetAddress;

public class LocalAddressExample {
    public static void main(String[] args) throws Exception {
        InetAddress local = InetAddress.getLocalHost();

        System.out.println("Host name: " + local.getHostName());
        System.out.println("Host address: " + local.getHostAddress());
    }
}
