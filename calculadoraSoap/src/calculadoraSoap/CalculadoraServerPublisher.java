package calculadoraSoap;

import javax.xml.ws.Endpoint;

public class CalculadoraServerPublisher {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:3000/calc", new CalculadoraServerImplement());
		System.out.println("ws online");
	}

}
