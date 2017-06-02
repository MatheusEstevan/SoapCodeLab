package Server;

import javax.xml.ws.Endpoint;


public class WelcomeServer {
	
	public static void main(String[] args) {

		Endpoint.publish("http://localhost:4000/Welcome", new WelcomeImplement());
		System.out.println("ws online");
	}

	
	
}
