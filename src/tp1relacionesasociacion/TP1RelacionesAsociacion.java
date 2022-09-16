package tp1relacionesasociacion;

/**
 *
 * @author mativ
 */
public class TP1RelacionesAsociacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        //crear registro
        Registro r1 = new Registro(2.7f, "capital", 5.1f);
        //ver datos registro
        System.out.println("Datos de registro");
        System.out.println("coefAvaluoEdificio: " + r1.coefAvaluoEdificio);
        System.out.println("municipio: " + r1.municipio);
        System.out.println("tasa: " + r1.getTasa());
        System.out.println("--------------------------------------");
        //registrar lotes
        Escritura e1 = r1.registrar(l1);
        Escritura e2 = r1.registrar(l2);
        Escritura e3 = r1.registrar(l3);        
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
        //ver datos de lotes        
        System.out.println("Datos de lotes");
        System.out.println("--------------------------------------");
        r1.emitirBoletos();
    }
}
