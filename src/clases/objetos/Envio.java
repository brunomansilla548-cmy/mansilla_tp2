package objetos;
import java.util.LinkedList;


public abstract  class Envio  {
    //Agrego atributos de envio
    private String codigodeSeguimiento;
    private String direccionDestinatario;
    private double costo;
    private LinkedList <paquete> paquetes; //Uso listas enlazadas para almacenar los elementos de la clase Paquete en la variable "paquetes".
    private LinkedList <RegistroSeguimiento> historial; 
    
    //Creo el cosntructor de envio referensiando a los atributos 
    public Envio (String codigodeSeguimiento, String direccionDestinatario, double costo){
        this.codigodeSeguimiento = codigodeSeguimiento;
        this.direccionDestinatario = direccionDestinatario;
        this.costo = costo; 
        this.paquetes = new LinkedList<>();
        this.historial = new LinkedList <RegistroSeguimiento>();
    }

    //Metodos
    
    //Agrego historial de movimientos de un envio.
    public void RegistroSeguimiento(RegistroSeguimiento historial){
        this.historial.add(historial);

    }

    public void mostrarHistorial(){
        for (RegistroSeguimiento historial : historial){
            System.out.println(historial);
        }
    }
    //Creo metodos publicos necesarios de Envios
    public void agregarPaquete (paquete paquete){
        if(paquetes.size() < 3){ //Marco el limite a 3 paquetes maximo.
            paquetes.add(paquete); 
        }

    }

    public void inicioDeRecorrido (){
        for (paquete paquete : paquetes){
            paquete.distribucion(); //Me comunico con paquete. El envio es el responsable de avisar.
        }
    }

    public void finalizacionDelEnvio (){
        for (paquete paquete : paquetes){ //Me vuevlo a comunicar con paquete. 
            paquete.entrega();
        }
    }

    public void resumenDeRecorrido (){
        System.out.println("Resumen de costos: " + calcularCosto());
    
    }

    //Si ya de por si es una clase abstracta dejo que las demas clases apliquen sus resultados.

    public  abstract  double calcularCosto();
    

    public abstract double aplicarRecargo();
}