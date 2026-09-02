package com.pawconnect.composite;

import com.pawconnect.model.Mascota;

import java.util.ArrayList;
import java.util.List;


public class GrupoRefugios implements ComponenteRefugio {

    private final String nombre;
    private final List<ComponenteRefugio> hijos = new ArrayList<>();

    public GrupoRefugios(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ComponenteRefugio componente) {
        // TODO: agregar 'componente' a 'hijos'
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public List<Mascota> obtenerMascotas() {

        throw new UnsupportedOperationException("TODO");
    }
}
