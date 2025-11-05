import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class servidor {
  public static void main(String[] args) {

    try {
      //Instanciar la implementacion de la interfaz
      interfaz objRemoto = new ImplementacionInterfaz();
      

      //Registrar el objeto remoto en el registro RMI
      Registry registro = LocateRegistry.createRegistry(1099); //puerto por defecto para trabajar con RMI es el 1099 (pero si esta ocupado se puede cambiar)
      registro.rebind("ClienteRemoto", objRemoto); //con ese nombre ("ClienteRemoto") es con el cual el cliente va a poder localizar el objeto remoto, asi que este mismo nombre 
      //hay que usarlo en el cliente para la busqueda del objeto remoto
      //.

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
//.
