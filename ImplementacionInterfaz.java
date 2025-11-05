import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImplementacionInterfaz extends UnicastRemoteObject implements interfaz { //mismo nombre que el archivo de la interfaz

  public ImplementacionInterfaz() throws RemoteException { //constructor
    super();
  }

  @Override //sobrescribir los métodos de la interfaz (tienen que llamarse EXACTAMENTE igual que en el archivo interfaz.java para que funcione, si no, da error)
  public float suma(float a, float b) throws RemoteException { //mismo tipo de dato y nombre que en la interfaz
    return a + b;
  }

  @Override //sobrescribir los métodos de la interfaz
  public String mensaje(String nombre) throws RemoteException {
    return "Mensaje recibido: " + nombre;
  }
  
}
