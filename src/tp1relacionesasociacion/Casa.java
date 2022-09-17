/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1relacionesasociacion;

/**
 *
 * @author mativ
 */
public class Casa extends Edificio{
    protected boolean plantaAlta;
    protected int superficie;

    public Casa(boolean plantaAlta, int superficie, float avaluoXmtr) {
        super(avaluoXmtr);
        this.plantaAlta = plantaAlta;
        this.superficie = superficie;
    }

    public boolean isPlantaAlta() {
        return plantaAlta;
    }

    public void setPlantaAlta(boolean plantaAlta) {
        this.plantaAlta = plantaAlta;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public float getAvaluoXmtr() {
        return avaluoXmtr;
    }

    public void setAvaluoXmtr(float avaluoXmtr) {
        this.avaluoXmtr = avaluoXmtr;
    }
    
    @Override
    public float valuar(){
    return getAvaluoXmtr() * superficie;
    }
    
    
    
    
}
