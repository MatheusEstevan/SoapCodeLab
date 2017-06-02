package Servidor;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerHello {

	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		// TODO Auto-generated method stub
		
		Hello hello = new Hello();
		
		IHello stub = (IHello)UnicastRemoteObject.exportObject(hello, 0);
		
		Registry registry = LocateRegistry.getRegistry();
		registry.rebind("Hello", stub);
	}

}
