import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImplementacionInterfaz extends UnicastRemoteObject implements interfaz {

    public ImplementacionInterfaz() throws RemoteException {
        super();
    }

    // ---- Métodos de la calculadora ----
    @Override
    public float sumar(float a, float b) throws RemoteException {
        return a + b;
    }

    @Override
    public float restar(float a, float b) throws RemoteException {
        return a - b;
    }

    @Override
    public float multiplicar(float a, float b) throws RemoteException {
        return a * b;
    }

    @Override
    public float dividir(float a, float b) throws RemoteException {
        if (b == 0) {
            throw new RemoteException("Error: División por cero");
        }
        return a / b;
    }

    // ---- Registro y desconexión de cliente ----
    @Override
    public void registrarCliente(String ip) throws RemoteException {
        System.out.println("Cliente conectado: " + ip);
    }

    @Override
    public void desconectarCliente(String ip) throws RemoteException {
        System.out.println("Cliente desconectado: " + ip);
    }

    // ---- Métodos del conversor ----
    @Override
    public float celsiusAFahrenheit(float c) throws RemoteException {
        return (c * 9 / 5) + 32;
    }

    @Override
    public float fahrenheitACelsius(float f) throws RemoteException {
        return (f - 32) * 5 / 9;
    }
}
