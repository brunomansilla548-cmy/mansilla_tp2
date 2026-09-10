
import java.time.LocalTime;//El registro de seguimiento necesita la hora en la que se realizo el envnio
import java.util.LinkedList; //lo necesito para la lista de envio 

import objetos.Envio;
import objetos.paquete;
import objetos.Clientes;
import objetos.RegistroSeguimiento;
import objetos.Sucursal;
import objetos.estadoPaquete;



public class main {

    public static void main(String[] args) {

        //Coloco los datos correspondientes

        //Declaracion de clases  
        Clientes cliente1 = new Clientes("Julian", 20356795, "Credito", "Av. Mitre");

        Sucursal sucursal1 = new Sucursal("General Paz 145", "Pedidos SRL", "Inmobiliaria");
        
        paquete paquete1 = new paquete(1,"Notebook",40,2.5);

        paquete paquete2 = new paquete(2, "Celular", 20, 0.5);

        Envio envio1 = new envioEstandar("ABC123", "Av. Nueve de Julio 742", 5000); 

        //----------------------------------------------------------------------------------------------------------------------------------

        //Utilizo metodos de envio para agregar paquetes. 
        envio1.agregarPaquete(paquete1);
        envio1.agregarPaquete(paquete2);

        //Se guarda el envio en la lista de clientes, para que el cliente pueda tener un historial de envios realizados.
        cliente1.agregarEnvio(envio1);

        //Empieza el recorrido 
        envio1.inicioDeRecorrido();
        sucursal1.recibirEnvio(envio1); // Utilizo metodos de la clase Sucursal para recibir el envio.
        sucursal1.despachar(envio1); // Utilizo metodos de la Sucursal para despachar el envio.
        envio1.finalizacionDelEnvio();

        //Se crea el registro de seguimiento del paquete, con el estado del paquete y la sucursal por la que paso.
        RegistroSeguimiento registro1 = new RegistroSeguimiento(LocalTime.now(), estadoPaquete.Recibido, sucursal1); // Se crea un historial con el estado del paquete y la sucursal. 

        LinkedList <RegistroSeguimiento> historial = new LinkedList<>();
        
        historial.add(registro1); //Se guarda todo lo sucedido en el historial del paquete. 
        envio1.RegistroSeguimiento(registro1); //Tambien se guarda en el envio. 

        //-----------------------------------------------------------------------------------------------------------------------------------------

        //El envio en guardado en una lista de envios.

        LinkedList<Envio> envios = new LinkedList<>();

        envios.add(envio1);

        //Se muestra los costos totales del envio.

        for (Envio envio : envios) {
            envio.resumenDeRecorrido();
        }

        envio1.mostrarHistorial(); //Se muestra el historial de seguimiento del paquete. 

    //--------------------------------------------------------------------------------------------------------------------------------------
    
   
    }
}
