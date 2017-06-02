package Server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface WelcomeService {
	@WebMethod
	String bemvindo(String nome);
	@WebMethod
	String intervalo(int numero1, int numero2);
}
