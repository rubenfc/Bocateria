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

    /**
     * este metodo imprime por pantalla los datos de los clientes en la cola
     */
    public void visualizaDatosClientesEnCola()
    {
        if(primeraPersonaEnLaCola == null)
        {
            System.out.println("lo sentimos aun no ha llegado ningun cliente");
        }
        else if (primeraPersonaEnLaCola.getSiguienteEnLaCola() == null)
        {
            System.out.println("cliente: " + primeraPersonaEnLaCola.getNumeroDeCliente() + " ( " + 
                               primeraPersonaEnLaCola.getNumeroDeBocadillos() * PRECIO_BOCADILLO + " )");
        }
        else
        {
            System.out.println("cliente: " + primeraPersonaEnLaCola.getNumeroDeCliente() + " ( " + 
                               primeraPersonaEnLaCola.getNumeroDeBocadillos() * PRECIO_BOCADILLO + " )");
            while(primeraPersonaEnLaCola.getSiguienteEnLaCola() != null)
            {
                System.out.println("cliente: " + primeraPersonaEnLaCola.getSiguienteEnLaCola().getNumeroDeCliente() + " ( " + 
                                    primeraPersonaEnLaCola.getSiguienteEnLaCola().getNumeroDeBocadillos() * PRECIO_BOCADILLO + " )");
            }
        }
    }
}
