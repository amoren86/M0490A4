package sockets.inetadress;

import java.net.InetAddress;

public class AddressTypeExample {
	public static void main(String[] args) throws Exception {
		InetAddress address = InetAddress.getByName("127.0.0.1");

		System.out.println("Address: " + address.getHostAddress());
		System.out.println("Is loopback: " + address.isLoopbackAddress());
		System.out.println("Is multicast: " + address.isMulticastAddress());
		System.out.println("Is link local: " + address.isLinkLocalAddress());
		System.out.println("Is site local: " + address.isSiteLocalAddress());
	}
}
