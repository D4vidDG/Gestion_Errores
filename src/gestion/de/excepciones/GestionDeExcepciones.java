/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.excepciones;

/**
 *
 * @author jdiazga
 */
public class GestionDeExcepciones {

    
    public static void main(String[] args) {
        División d=new División();
      try{ 
    d.dividir(0);
      }catch(MyException error){
          System.out.println("Division por cero");
      }
        System.out.println("Termine");
    }
    
}
