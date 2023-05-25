package reto3;

import java.util.HashMap;

public class BaseDatos {
private HashMap<Integer, Producto> listaProductos = new HashMap<>();
    
    public BaseDatos(){
        listaProductos.put(1, new Producto(1, "Manzanas", 5000.0, 25));
        listaProductos.put(2, new Producto(2, "Limones", 2300.0, 15));
        listaProductos.put(3, new Producto(3, "Peras", 2700.0, 33));
        listaProductos.put(4, new Producto(4, "Arandanos", 9300.0, 5));
        listaProductos.put(5, new Producto(5, "Tomates", 2100.0, 42));
        listaProductos.put(6, new Producto(6, "Fresas", 4100.0, 3));
        listaProductos.put(7, new Producto(7, "Helado", 4500.0, 41));
        listaProductos.put(8, new Producto(8, "Galletas", 500.0, 8));
        listaProductos.put(9, new Producto(9, "Chocolates", 3500.0, 80));
        listaProductos.put(10, new Producto(10, "Jamon", 15000.0, 10));
    }
    public void agregar(Producto p){
       listaProductos.put(p.getCodigo(), p);
   }     
    public void actualizar(Producto p){
       listaProductos.replace(p.getCodigo(), p);
    }
     public void borrar(Producto p){
       listaProductos.remove(p.getCodigo());
     }
    public boolean verificarExistencia(Producto p){
       return listaProductos.containsKey(p.getCodigo());  
    }
public String precioMenor(){
     String nombre = ((Producto) listaProductos.values().toArray()[0]).getNombre();
         double precio = ((Producto) listaProductos.values().toArray()[0]).getPrecio();
         for(Producto p: listaProductos.values()){
             if(p.getPrecio() < precio){
                 precio = p.getPrecio();
                 nombre =p.getNombre();
             }
         }   
         return nombre;
}
     
public String precioMayor(){
         String nombre = ((Producto) listaProductos.values().toArray()[0]).getNombre();
         double precio = ((Producto) listaProductos.values().toArray()[0]).getPrecio();
         for(Producto p: listaProductos.values()){
             if(p.getPrecio() > precio){
                 precio = p.getPrecio();
                 nombre =p.getNombre();
             }       
         }
         return nombre;
     }
       public double promedio(){
        double suma_acu = 0;
        for (Producto p: listaProductos.values()){
            suma_acu+=p.getPrecio();
        }
        return suma_acu/listaProductos.size();
     }
    public void generarInforme(){
        System.out.println(precioMayor()+" "+precioMenor()+" "+String.format("%.1f", promedio()));
    }
    }
    

