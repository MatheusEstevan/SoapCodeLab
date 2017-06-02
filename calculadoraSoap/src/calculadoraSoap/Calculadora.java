package calculadoraSoap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Calculadora {
	
	@WebMethod
	double somar(double numero1, double numero2);
	@WebMethod
	double subtrair(double numero1, double numero2);
	@WebMethod
	double multiplicar(double numero1, double numero2);
	@WebMethod
	double dividir(double numero1, double numero2);
	
	
}
