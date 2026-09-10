import objetos.Envio;


public class envioEstandar extends Envio {
    //Coloco las propiedades de la clase padre (Envio)
     public envioEstandar(String codigodeSeguimiento,
                         String direccionDestinatario,
                         double costo
                        ) {

        super(codigodeSeguimiento, direccionDestinatario, costo);
    }

    //Modifico el metodo calcularCosto
@Override
public double calcularCosto() {
    return 1000;
}

@Override
public double aplicarRecargo(){
    return 400;
}
    
}
