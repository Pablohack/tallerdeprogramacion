package org.example;

import org.example.Interfaz.IBencina;
import org.example.Interfaz.IVehiculo;

public class Camion implements IVehiculo, IBencina {

    @Override
    public void ArrancaVehiculo(){
        System.out.println("Arranca camion");
    }

    @Override
    public void CargarBencina() {

    }
}
