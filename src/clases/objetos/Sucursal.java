package objetos; 
import java.util.LinkedList;
//Necesito importar la clase paquete para usar los metodos encaplusados en el enum estado paquete.
public class Sucursal  {
    //Caracteristicas que agregue de sucursal
    private String direccion;
    private String nombre;
    private String productos; //Articulos que vende esa sucursal
    private LinkedList <Envio> envios;  //creo una lista de envios lo que significa que existe una relación muchos a muchos. 
   

    //Constructor 
    public Sucursal (String direccion, String nombre, String productos){
     
        this.direccion = direccion;
        this.nombre = nombre;
        this.productos = productos;
        this.envios = new LinkedList<>();
        

    }

    //Metodos 
    // Cada sucursal recibie muchos envios, y un envio puede pasar por muchas sucursales, por eso es necesario una lista con los envios recibidos.
    public void recibirEnvio(Envio envio){
        envios.add(envio);
    }
    // Por cada envio recibido se despachara hacia una nueva dirección.
    public void despachar(Envio envio){
        envios.remove(envio); //con el metodo remove elimino un elemento de una colección de datos, en este caso envio
    }
    
    
}

