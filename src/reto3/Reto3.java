
package reto3;

import java.util.Scanner;

public class Reto3 {
   private final Scanner sc = new Scanner(System.in);
   
   public String read(){
       return sc.nextLine();
   }
    public void run(){
        BaseDatos listaProductos = new BaseDatos();
        
         String operacion = read();
         String[] datos = read().split(" ");
         
         Producto p = new Producto(Integer.parseInt(datos[0]), datos[1], Double.parseDouble(datos[2]), Integer.parseInt(datos[3]));
         
      if(operacion.equals("AGREGAR") && !listaProductos.verificarExistencia(p)){
         listaProductos.agregar(p);
         listaProductos.generarInforme();
      }else if(operacion.equals("ACTUALIZAR") && listaProductos.verificarExistencia(p)){
               listaProductos.actualizar(p);
               listaProductos.generarInforme();
      }else if(operacion.equals("BORRAR") && listaProductos.verificarExistencia(p)){
               listaProductos.borrar(p);
               listaProductos.generarInforme();
      }else{
          System.out.println("ERROR");
      }
    }
}