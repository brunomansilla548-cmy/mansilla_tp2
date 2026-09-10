package objetos;


public class paquete {
    //Declaro los atributos necesarios
    private int codigodePaquete;
    private String descripcionGeneral; 
    private double dimensiones;
    private double peso; 
    private estadoPaquete estado;

    //El constructor va con el nombre de la clase.
    public paquete (int codigodePaquete, String descripcionGeneral, double dimensiones, double peso ){
        this.codigodePaquete = codigodePaquete;
        this.descripcionGeneral = descripcionGeneral;
        this.dimensiones = dimensiones;
        this.peso = peso; 
        this.estado = estadoPaquete.Recibido; //para que los paquetes se creen en el mismo estado (asi el paquete que cree recien no se entrega enseguida)
    }
    

//Ademas ahora tengo que colocar una capa que ayude a que no hayan incoherencias. T.P N°2
   private boolean verificarTransicionValida(estadoPaquete nuevoEstado){ //nuevoEstado sera la variable con la que voy a trabajar y retornar la verificacion de los paquetes.

    switch (estado) {
        case Recibido:
            return nuevoEstado == estadoPaquete.preparacion;

    
        case preparacion:
            return nuevoEstado == estadoPaquete.distribucion;

        case distribucion:
            return nuevoEstado == estadoPaquete.Entregado;

        case Entregado:

        return false;
        default:
            return false;
            
    
        }
    }

    //Por cada estado en el que se encuentre el paquete se verificara con el nuevoEstado si es correcta la transición del paquete. Haciendo que no pase de Recibido a Entregado (porque no tiene sentido)
    private void cambiarEstado(estadoPaquete nuevoEstado) { 

    if (verificarTransicionValida(nuevoEstado)) {
        estado = nuevoEstado;
    } else {
        System.out.println(
            "Transición inválida: " + estado + " → " + nuevoEstado
        );
    }
}

 //Declaro Metodos a partir de variables constantes declaradas con enum y referenciadas en los atributos de paquete, ademas uso la verificacion de transición.
    public void recepcion(){
        cambiarEstado(estadoPaquete.Recibido);
    }


    public void preparacion(){
        cambiarEstado(estadoPaquete.preparacion);

    }

     public void distribucion(){
        cambiarEstado(estadoPaquete.distribucion);
    }

     public void entrega(){

        cambiarEstado(estadoPaquete.Entregado);
    }

   
   
   

   
}

