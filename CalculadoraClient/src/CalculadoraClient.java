
public class CalculadoraClient {

	public static void main(String[] args) {
		
		CalculadoraServerImplementService serviceReference = new CalculadoraServerImplementService();
		Calculadora proxy = serviceReference.getCalculadoraServerImplementPort();
		System.out.println(proxy.somar(1234, 1234));
		
	}

}
