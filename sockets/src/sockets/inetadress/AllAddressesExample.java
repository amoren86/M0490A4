package sockets.inetadress;

import java.net.InetAddress;

public class AllAddressesExample {
    public static void main(String[] args) throws Exception {
        InetAddress[] addresses = InetAddress.getAllByName("www.google.com");

        for (InetAddress address : addresses) {
            System.out.println(address.getHostAddress());
        }
    }
}
