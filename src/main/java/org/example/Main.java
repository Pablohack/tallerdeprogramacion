package org.example;

public class Main {
    public static void main(String[] args) {

    //     Vehiculo auto = new Vehiculo("Toyota",4);
    //   auto.MostrarInformacion();
    // Vehiculo moto = new Vehiculo("Kia",2);

    Camion camion = new Camion();
    Moto moto = new Moto();

    camion.ArrancaVehiculo();
    moto.ArrancaVehiculo();


    }
}