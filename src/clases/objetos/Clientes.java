package objetos;

import java.util.LinkedList;


public class Clientes {

    //Creo los atributos de clientes 
    private String nombre;
    private double Documento;
    private String formaDePago;
    private String Direccion; 
    private LinkedList <Envio> envios; //lista enlazada hago referencia a la clase existente


    public Clientes (String nombre, double Documento, String formaDePago, String Direccion) {
        this.nombre = nombre;
        this.Documento = Documento;
        this.formaDePago = formaDePago;
        this.Direccion = Direccion; 
        this.envios= new LinkedList<>();
    };


    //Se guarda cada envio realizado por el cliente en la lista creada. 
    public void agregarEnvio( Envio envio) {// En el parametro Envio hago referencia al tipo de instancia que va a recbiri el metodo. 
    envios.add(envio);
    }

    public String  pagoDeEnvio(){          
       return this.formaDePago = "Credito" + "Debito" + "Prepaga";
    }
    
    

};









