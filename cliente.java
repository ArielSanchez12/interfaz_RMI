import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class cliente {
  public static void main(String[] args) throws NotBoundException {
      try {
        //Obtener el registro RMI del servidor
        Registry registro = LocateRegistry.getRegistry("localhost", 1099);

        //instanciar la interfaz (se instancia tanto en servidor como en cliente)
        interfaz objRemoto = (interfaz) registro.lookup("ClienteRemoto");

        //Llamar a los métodos remotos
        float resultadoSuma = objRemoto.suma(5.0f, 3.0f);
        System.out.println("Resultado de la suma: " + resultadoSuma);
        
        String respuestaMensaje = objRemoto.mensaje("Hola desde el cliente RMI");
        System.out.println(respuestaMensaje);
      } catch (RemoteException e) {
        e.printStackTrace();
      }
  }
}
