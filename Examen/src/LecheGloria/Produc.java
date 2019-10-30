package LecheGloria;

public class Produc {
    
    public static void main(String[] args) {
        Producmpl pa = new Producmpl();
        productoGloria pe = new productoGloria();
        pe.setNombreProducto("LECHE GLORIA");
        pe.setPrecio(3.5);
        pe.setFechaCaducidad(pa.fecha("07-12-2019"));
        
        
        pa.agregarProducto(pe);
        pa.Listaproductos();
        
        System.out.println("");
        System.out.println("El producto no esta vencido ");
    }
}
