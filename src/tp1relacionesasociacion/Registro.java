package tp1relacionesasociacion;

import java.util.ArrayList;

/**
 *
 * @author mativ
 */
public class Registro {

    public float coefAvaluoEdificio;
    public String municipio;
    private float tasa;
    public ArrayList<Lote> inmueble;
    public ArrayList<Escritura> escrituras;
    private int count = 0;

    public Registro(float coefAvaluoEdificio, String municipio, float tasa) {
        this.coefAvaluoEdificio = coefAvaluoEdificio;
        this.municipio = municipio;
        this.tasa = tasa;
        inmueble = new ArrayList<>();
        escrituras = new ArrayList<>();
    }

    public float getCoefAvaluoEdificio() {
        return coefAvaluoEdificio;
    }

    public void setCoefAvaluoEdificio(float coefAvaluoEdificio) {
        this.coefAvaluoEdificio = coefAvaluoEdificio;
    }

    public float getTasa() {
        return tasa;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    public float valuar(Lote lote) {
        return lote.valuar();
    }

    public void emitirBoletos() {
        //recorro el array de lotes(inmueble) y muestro por pantalla los datos
        for (int i = 0; i < inmueble.size(); i++) {
            if (inmueble != null) {
                System.out.println("El padron del inmueble " + i + " es " + inmueble.get(i).idPadron);
                System.out.println("El domicilio del inmueble " + i + " es " + inmueble.get(i).getDomicilio());
                System.out.println("El avaluoxmt del inmueble " + i + " es " + inmueble.get(i).getAvaluoxmt());
                System.out.println("La superficie del inmueble " + i + " es " + inmueble.get(i).superficie);
                System.out.println("El avaluo del inmueble " + i + " es " + inmueble.get(i).valuar());
                System.out.println("--------------------------------------");
            }
        }
    }

    public Escritura registrar(Lote lote) {
        //agrego el lote al array
        inmueble.add(lote);
        //creo la escritura con los datos del lote 
        Escritura e = new Escritura(count, lote, this);
        count++;
        escrituras.add(e);
        return e;
    }

}
