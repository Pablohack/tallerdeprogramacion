package org.example;

public class Excepciones {

    public void LanzarErrores(){
        try {
            System.out.println("Ingresando al primer try");
            double cociente = 10000/100; // Se lanza una excepción

            System.out.println("Después de la división correcta");
        } catch (ArithmeticException e) {

            System.out.println("Error División por cero" + e.getMessage());
        } finally {
            System.out.println("Ingresando al primer finally");
        }
        try {
            System.out.println("Ingresando al segundo try");
            Object objeto = null;
            objeto.toString();

            System.out.println("Imprimiendo objeto");
        } catch (ArithmeticException e) {

            System.out.println("División por cero");
        } catch (Exception e) {
            System.out.println("Ocurrió una excepción" + e.getMessage());
        } finally {
            System.out.println("Ingresando al segundo finally");
        }
    }
}
