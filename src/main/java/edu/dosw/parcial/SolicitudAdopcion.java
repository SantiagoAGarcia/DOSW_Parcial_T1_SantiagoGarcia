package com.pawconnect.model;

public class SolicitudAdopcion {

    private final String id;
    private final Mascota mascota;
    private EstadoSolicitud estado;

    public SolicitudAdopcion(String id, Mascota mascota) {
        this.id = id;
        this.mascota = mascota;

    }

    public void avanzarA(EstadoSolicitud nuevoEstado) {
        throw new UnsupportedOperationException("TODO");
    }

    public String getId() { return id; }
    public Mascota getMascota() { return mascota; }
    public EstadoSolicitud getEstado() { return estado; }
}
