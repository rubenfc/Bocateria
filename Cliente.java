
/**
 * Write a description of class Cliente here.
 * 
 * @author (ruben fernandez) 
 * @version (version 1.0)
 */
public class Cliente
{
    private int numeroDeCliente;
    private Cliente siguienteEnLaCola;
    private int numeroDeBocadillos;
    private static int numeroDeClienteActual = 1;

    /**
     *Constructor de la clase Cliente
     *@param numeroDeBocadillos, que inicializa el numero de bocadillos que quiere ese cliente
     */

    public Cliente(int numeroDeBocadillos)
    {
        this.numeroDeBocadillos = numeroDeBocadillos;
        
        numeroDeCliente = 1;
        
    }

    /**
     * este metodo getter returna un objeto de la clase Cliente
     * @return Cliente que simboliza al siguiente cliente
     */
    public Cliente getSiguienteEnLaCola()
    {
        return siguienteEnLaCola;
    }

    /**
     * este metodo getter returna el numero de bocadillos
     * @return int 
     */
    public int getNumeroDeBocadillos()
    {
        return numeroDeBocadillos;
    }

    /**
     * este metodo getter returna el numero de clientes
     * @return int
     */
    public int getNumeroDeCliente()
    {
        return numeroDeCliente;
    }
    
    /**
     * este metodo devuelve la informacion del cliente
     * @return String
     */
    public String toString()
    {
        return "el cliente numero: " + numeroDeCliente + " compra: " + numeroDeBocadillos;
    }
    
    /**
     * este metodo permite crear un objeto de la clase Cliente para asignar un cliente nuevo a la cola;
     * @param Cliente
     */
    public void setSiguienteCliente(Cliente cliente)
    {
        siguienteEnLaCola = cliente;
        numeroDeCliente += 1;
        numeroDeClienteActual += 1;
    }
}
