package com.pawconnect.iterator;

import com.pawconnect.model.Mascota;

public interface CatalogoIterator {
    boolean hasNext();
    Mascota next();
}
