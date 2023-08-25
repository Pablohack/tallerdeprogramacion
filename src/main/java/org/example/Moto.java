package org.example;

import org.example.Interfaz.IVehiculo;

public class Moto implements IVehiculo {

    @Override
    public void ArrancaVehiculo() {
        System.out.println("Arranca la moto");
    }
}
