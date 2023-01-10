package tp1relacionesasociacion;

import exception.ErrorLote;

/**
 *
 * @author mativ
 */
public class Lote {

    public Integer idPadron;
    private String domicilio;
    private float avaluoxmt;
    public int superficie;
    public Registro inscripto;
    private Edificio construccion;
    private static int acumulador = 0;
    
    public Lote(String domicilio, float avaluoxmt, int superficie) {
        this.idPadron = acumulador++;
        this.domicilio = domicilio;
        this.avaluoxmt = avaluoxmt;
        this.superficie = superficie;        
    }

    public String getDomicilio() {
        return domicilio;
    }

    public float getAvaluoxmt() {
        return avaluoxmt;
    }
    
    public float valuar() {
        return this.avaluoxmt * this.superficie;
    }

    public Edificio getConstruccion() {
        return construccion;
    }

    public void setConstruccion(Edificio construccion) {
        this.construccion = construccion;
    }
    
    public Edificio crearEdificio (Edificio edificio) {
     
        if (this.construccion != null) {
            throw new ErrorLote("No se puede construir! Ya existe un edificio!");
        }
        this.construccion = edificio;
        return edificio;
    
 }
}
