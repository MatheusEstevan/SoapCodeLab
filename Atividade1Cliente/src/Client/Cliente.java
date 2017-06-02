package Client;

public class Cliente {

	public static void main(String[] args) {

		WelcomeImplementService serviceReference = new WelcomeImplementService();
		WelcomeService proxy = serviceReference.getWelcomeImplementPort();
		System.out.println(proxy.bemvindo("joao"));
		System.out.println(proxy.intervalo(1, 8));
	}

}
