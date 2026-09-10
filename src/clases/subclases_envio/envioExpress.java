import objetos.Envio;

public class envioExpress extends Envio {
   //Les paso las propiedades de la clase padre.
    public envioExpress(String codigodeSeguimiento,
                         String direccionDestinatario,
                         double costo,
                        String envios) {

        super(codigodeSeguimiento, direccionDestinatario, costo);

    }

//Modifico el metodo por medio del override
@Override
public double calcularCosto() {
    return 5000;
}

@Override
public double aplicarRecargo(){
    return 600;
}


}
