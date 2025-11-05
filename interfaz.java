import java.rmi.Remote;
import java.rmi.RemoteException;

public interface interfaz extends Remote {

    // Métodos de la calculadora
    float sumar(float a, float b) throws RemoteException;
    float restar (float a, float b) throws RemoteException;
    float multiplicar (float a, float b) throws RemoteException;
    float dividir (float a, float b) throws RemoteException;

    // Registro y desconexión de cliente
    void registrarCliente(String ip) throws RemoteException;
    void desconectarCliente(String ip) throws RemoteException;

    // Métodos del conversor de temperatura
    float celsiusAFahrenheit(float c) throws RemoteException;
    float fahrenheitACelsius(float f) throws RemoteException;
}
