package com.pawconnect.composite;

import com.pawconnect.model.Mascota;
import java.util.List;

public interface ComponenteRefugio {

    String getNombre();

    List<Mascota> obtenerMascotas();
}
