import java.rmi.Remote;
import java.rmi.RemoteException;

public interface interfaz extends Remote {
  // Métodos que el cliente puede invocar de forma remota

  float suma (float a, float b) throws RemoteException;
  String mensaje (String nombre) throws RemoteException;
}