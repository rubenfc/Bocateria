import java.util.HashMap;
/**
 * Write a description of class Bocateria here.
 * 
 * @author (ruben fernandez) 
 * @version (version 1.0)
 */
public class Bocateria
{
    private Cliente primeraPersonaEnLaCola;
    private int facturacionActual;
    private HashMap<Integer, Cliente> clientesDespachados;
    private static final int PRECIO_BOCADILLO = 5;
    /**
     * constructor de la clase Bocateria sin parametros
     */
    public Bocateria()
    {
        facturacionActual = 0;
    }
    
    /**
     * almacena un nuevo cliente a la cola
     * @param int que simboliza el numero de bocadillos que quiere el cliente
     */
    public void llegaNuevoClienteAlacola(int numeroDeBocadillos)
    {
        if(primeraPersonaEnLaCola == null)
        {
            Cliente nuevoCliente = new Cliente(numeroDeBocadillos);
            primeraPersonaEnLaCola = nuevoCliente;
        }
        else
        {
            Cliente cliente = new Cliente(numeroDeBocadillos);
            primeraPersonaEnLaCola.setSiguienteCliente(cliente);
        }
    }
}
