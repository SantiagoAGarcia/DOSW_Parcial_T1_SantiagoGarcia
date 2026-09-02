package com.pawconnect.composite;

import com.pawconnect.model.Mascota;

import java.util.ArrayList;
import java.util.List;

public class Refugio implements ComponenteRefugio {

    private final String nombre;
    private final List<Mascota> mascotas = new ArrayList<>();

    public Refugio(String nombre) {
        this.nombre = nombre;
    }

    public void registrarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public List<Mascota> obtenerMascotas() {
        return mascotas;
    }
}
