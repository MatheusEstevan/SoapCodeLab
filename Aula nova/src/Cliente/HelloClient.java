package Cliente;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import Servidor.IHello;

public class HelloClient {
	
	public static void main(String[] args) throws AccessException, RemoteException, NotBoundException 
	{
		// TODO Auto-generated method stub
		
		Registry registry = LocateRegistry.getRegistry();
		IHello stub = (IHello)registry.lookup("Hello");
		
		System.out.println(stub.sayHello("Eduardo"));
	}
}
