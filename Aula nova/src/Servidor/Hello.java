package Servidor;

import java.rmi.RemoteException;

public class Hello implements IHello {

	@Override
	public String sayHello(String name) throws RemoteException {
		return "Hello world" + name + "!";
	}

}
