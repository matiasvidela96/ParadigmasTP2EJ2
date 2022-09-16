/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1relacionesasociacion;

/**
 *
 * @author mativ
 */
public class Departamento {
    public byte piso;
    public char dpto;
    public int superficie;

    public Departamento(byte piso, char dpto, int superficie) {
        this.piso = piso;
        this.dpto = dpto;
        this.superficie = superficie;
    }

    public byte getPiso() {
        return piso;
    }

    public void setPiso(byte piso) {
        this.piso = piso;
    }

    public char getDpto() {
        return dpto;
    }

    public void setDpto(char dpto) {
        this.dpto = dpto;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
    
    
}
