package Server;

import javax.jws.WebService;

@WebService(endpointInterface = "Server.WelcomeService")
public class WelcomeImplement implements WelcomeService {

	@Override
	public String bemvindo(String nome) {
		// TODO Auto-generated method stub
		return "bem vindo, " + nome;
	}

	@Override
	public String intervalo(int numero1, int numero2) {
		String resultado = new String();
		int n = numero1;
		while(n < numero2){
			n++;
			resultado = String.valueOf(n);
		}
		
		
		return resultado;
	}

}
