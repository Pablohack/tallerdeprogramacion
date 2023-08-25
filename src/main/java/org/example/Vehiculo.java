package org.example;

public class Vehiculo {
   public String marca;
   public int cantRuedas;
   private String patente;

   public Vehiculo(String marca, int cantRuedas){
       this.marca = marca;
       this.cantRuedas = cantRuedas;
   }


   public void MostrarInformacion(){
       System.out.println("Tengo " + this.cantRuedas + " ruedas" + " y mi marca es: " + this.marca);
   }


}
