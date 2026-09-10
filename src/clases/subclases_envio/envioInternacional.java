import objetos.Envio;

public class envioInternacional extends Envio {
    
     public envioInternacional(String codigodeSeguimiento,
                         String direccionDestinatario,
                         double costo,
                        String envios) {

        super(codigodeSeguimiento, direccionDestinatario, costo);

    }

    @Override
public double calcularCosto() {
    return 10000;
}

@Override
public double aplicarRecargo(){
    return 1000;
}
}
