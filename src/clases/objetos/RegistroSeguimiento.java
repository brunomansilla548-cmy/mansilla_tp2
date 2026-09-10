package objetos;
import java.time.LocalTime;

/**
 * RegistroSeguimiento
 */
public class RegistroSeguimiento  {
    //Atributos
    private LocalTime hora = LocalTime.now();
    private estadoPaquete historial; //Necesito un historial que incluya todo el recorrido del paquete, desde su inicio de recorrida, hasta el final //
    private Sucursal sucursal; //Se necesita incluir las sucursales por las que pasa.


    public RegistroSeguimiento(LocalTime hora, estadoPaquete historial, Sucursal sucursal){
        this.hora = hora;
        this.historial = historial;
        this.sucursal = sucursal;
    }
}
