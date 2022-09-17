/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1relacionesasociacion;

import java.util.ArrayList;

/**
 *
 * @author mativ
 */
public class PH extends Edificio  {
    public byte cantPisos;
    public ArrayList<Departamento> unidad;    

    public PH(byte cantPisos, float avaluoXmtr,ArrayList<Departamento> unidad) {
        super(avaluoXmtr);
        this.cantPisos = cantPisos;
        this.unidad = unidad;
    }   
    
    
    @Override
    public float valuar(){
    return getAvaluoXmtr()* cantPisos;}
}
