package com.pawconnect.iterator;

import com.pawconnect.composite.ComponenteRefugio;
import com.pawconnect.model.Especie;


public class Catalogo {

    private final ComponenteRefugio alcance;

    public Catalogo(ComponenteRefugio alcance) {
        this.alcance = alcance;
    }


    public CatalogoIterator iteradorPorEspecie(Especie especie) {
        throw new UnsupportedOperationException("TODO");
    }


    public CatalogoIterator iteradorPorRangoEdad(int edadMin, int edadMax) {
        throw new UnsupportedOperationException("TODO");
    }


    public CatalogoIterator iteradorPorCompatibilidad(boolean ninos, boolean mascotas, boolean espacios) {
        throw new UnsupportedOperationException("TODO");
    }


    public CatalogoIterator iteradorCompleto() {
        throw new UnsupportedOperationException("TODO");
    }
}
