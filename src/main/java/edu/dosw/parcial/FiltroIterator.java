package com.pawconnect.iterator;

import com.pawconnect.model.Mascota;

import java.util.List;
import java.util.function.Predicate;

public class FiltroIterator implements CatalogoIterator {

    private int posicion = 0;

    public FiltroIterator(List<Mascota> mascotas, Predicate<Mascota> criterio) {

    }

    @Override
    public boolean hasNext() {

        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public Mascota next() {

        throw new UnsupportedOperationException("TODO");
    }
}
