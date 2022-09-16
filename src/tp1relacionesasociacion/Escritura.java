package tp1relacionesasociacion;

/**
 *
 * @author mativ
 */
public class Escritura {
    public Integer numero;
    public int superficie;
    private String domicilio;
    public Lote inmueble;
    public Registro inscripto;

    public Escritura(Integer numero, Lote inmueble, Registro inscripto) {
        this.numero = numero;
        this.inmueble = inmueble;
        this.inscripto = inscripto;
        this.superficie= inmueble.superficie;
        this.domicilio = inmueble.getDomicilio();        
    }

    public Lote getInmueble() {
        return inmueble;
    }

    public void setInmueble(Lote inmueble) {
        this.inmueble = inmueble;
    }

    public Registro getInscripto() {
        return inscripto;
    }

    public void setInscripto(Registro inscripto) {
        this.inscripto = inscripto;
    }
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    
    public static void matias(){}
    
    private void a(){}
    private void a (int a){}
}
