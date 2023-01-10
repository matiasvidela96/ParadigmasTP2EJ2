package tp1relacionesasociacion;

import exception.ErrorLote;
import java.util.ArrayList;

/**
 *
 * @author mativ
 */
public class TP1RelacionesAsociacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //crear registro
        Registro r1 = new Registro(2.7f, "capital", 5.1f);
        //ver datos registro
        System.out.println("Datos de registro");
        System.out.println("coefAvaluoEdificio: " + r1.getCoefAvaluoEdificio());
        System.out.println("municipio: " + r1.municipio);
        System.out.println("tasa: " + r1.getTasa());
        System.out.println("--------------------------------------");
        //crear lotes
        Lote l1 = new Lote("las heras 370", 4.5f, 100);
        Lote l2 = new Lote("3 acequias 850", 6.5f, 150);
        Lote l3 = new Lote("buenos aires 164", 7.5f, 120);       
        //avaluo lotes
        System.out.println("avaluo de lotes");
        System.out.println("avaluo lote " + l1.idPadron + " es :" + l1.valuar());
        System.out.println("avaluo lote " + l2.idPadron + " es :" + l2.valuar());
        System.out.println("avaluo lote " + l3.idPadron + " es :" + l3.valuar());
        System.out.println("--------------------------------------");        
        //registrar lotes
        r1.registrar(l1);
        r1.registrar(l2);
        r1.registrar(l3);   
        //ver datos de lotes        
        System.out.println("Datos de lotes");
        System.out.println("--------------------------------------");
        r1.emitirBoletos();
        //ver datos escritura
        System.out.println("Datos de escritura");
        System.out.println("--------------------------------------");
        for (Escritura esc : r1.escrituras) {
            System.out.println("Nro Escritura: " + esc.numero);
            System.out.println("Registro: " + esc.inscripto.municipio);
            System.out.println("Lote: " + esc.inmueble.idPadron);
            System.out.println("Valor: " + r1.valuar(esc.inmueble));
            System.out.println("Domicilio: " + esc.inmueble.getDomicilio());
            System.out.println("--------------------------------------");
        }
        
//        //creo edificio en lote
//        Edificio e1 = new Edificio(23.5f);
//        l1.setConstruccion(e1);
//        //demoler edificio
//        e1 = e1.demoler();
//        
       try{         
       Edificio e2 = l2.crearEdificio(new PH((byte)1,11f,new ArrayList<Departamento>()));
       e2 = e2.demoler();}
       catch(ErrorLote el){
           System.out.println(el.getMessage());
       }
    }
}
