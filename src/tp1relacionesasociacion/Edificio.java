package tp1relacionesasociacion;

/**
 *
 * @author mativ
 */
public abstract class Edificio {
    protected float avaluoXmtr;    

    public Edificio(float avaluoXmtr) {
        this.avaluoXmtr = avaluoXmtr;
    }

    public float getAvaluoXmtr() {
        return avaluoXmtr;
    }

    public void setAvaluoXmtr(float avaluoXmtr) {
        this.avaluoXmtr = avaluoXmtr;
    }
    
    public abstract float valuar();
    
    public Edificio demoler(){
        System.out.println("Edificio Demolido");
    //No es un null especifico para edificio, puede ser para cualquier objeto
        return null;       
    //Eliminar Edificios. Asignar un null para perder la refeerencia al objeto
    }
    
    
}
