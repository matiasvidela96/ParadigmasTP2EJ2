package tp1relacionesasociacion;


import java.io.*;
/**
 *
 * @author mativ
 */
public class Escritura implements Serializable{
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
    
    public Escritura(Integer numero, int superficie, String domicilio){
      this.numero=numero;
      this.superficie=superficie;
      this.domicilio=domicilio;      
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
   
//    public void guardar() {
//        try {
//            String Destino = "d:\\Facultad\\Escritura_"+getNumero()+".txt";
//            FileOutputStream outputStream = new FileOutputStream(Destino);
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//            objectOutputStream.writeObject(this);            
//            objectOutputStream.close();
//        } catch (IOException ex) {
//             System.out.println("Imposible guardar Escritura: "+ex.getMessage()); 
//        }
//    }
    
     public void guardar(){
    try {
      ObjectOutputStream Archivo; 
      String Destino = "d:\\Facultad\\Escritura_"+getNumero()+".txt";
      Archivo = new ObjectOutputStream(new FileOutputStream(Destino));
      Archivo.writeObject(this);
      Archivo.close();           
    }
    catch (IOException e) {
      System.out.println("Imposible guardar Escritura: "+e.getMessage()); 
    }  
  }
    
    public Escritura recuperar(){
    Escritura E=null;
    try {
      String Origen = "d:\\Facultad\\Escritura_"+numero+".txt";    
      ObjectInputStream Archivo;
      Archivo=new ObjectInputStream(new FileInputStream(Origen));
      E =(Escritura) Archivo.readObject();
      Archivo.close();        
    }
    catch (ClassNotFoundException e) {
      System.out.println("Imposible recuperar Escritura: "+e.getMessage()); 
    }
    catch (IOException e) {
      System.out.println("Imposible recuperar Escritura: "+e.getMessage()); 
    } 
    catch (Exception e) {
        System.out.println("Ha ocurrido un error inesperado:"); 
        e.printStackTrace(); 
      }
    
    return E;
  }
    
    public void mostrar(){
    System.out.println("Datos escritura Nº "+numero+":");
    System.out.println("   Superficie: "+superficie); 
    System.out.println("   Domicilio: "+domicilio); 
  }

}
