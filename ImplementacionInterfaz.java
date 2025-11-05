import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ImplementacionInterfaz extends UnicastRemoteObject implements interfaz {

    // Constructor
    public ImplementacionInterfaz() throws RemoteException {
        super();
    }

    // Implementar todos los metodos
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
            throw new RemoteException("Error: Division por cero");
        }
        return a / b;
    }

    @Override
    public void registrarCliente(String ip) throws RemoteException {
        System.out.println("Cliente conectado: " + ip);
    }

}