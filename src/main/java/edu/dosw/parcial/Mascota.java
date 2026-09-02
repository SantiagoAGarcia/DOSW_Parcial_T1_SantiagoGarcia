package com.pawconnect.model;

public class Mascota {

    private final String id;
    private final String nombre;
    private final Especie especie;
    private final int edadMeses;
    private final Tamano tamano;
    private final boolean compatibleNinos;
    private final boolean compatibleMascotas;
    private final boolean compatibleEspaciosReducidos;
    private final String refugioOrigen;

    public Mascota(String id, String nombre, Especie especie, int edadMeses, Tamano tamano,
                    boolean compatibleNinos, boolean compatibleMascotas,
                    boolean compatibleEspaciosReducidos, String refugioOrigen) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edadMeses = edadMeses;
        this.tamano = tamano;
        this.compatibleNinos = compatibleNinos;
        this.compatibleMascotas = compatibleMascotas;
        this.compatibleEspaciosReducidos = compatibleEspaciosReducidos;
        this.refugioOrigen = refugioOrigen;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public Especie getEspecie() { return especie; }
    public int getEdadMeses() { return edadMeses; }
    public Tamano getTamano() { return tamano; }
    public boolean isCompatibleNinos() { return compatibleNinos; }
    public boolean isCompatibleMascotas() { return compatibleMascotas; }
    public boolean isCompatibleEspaciosReducidos() { return compatibleEspaciosReducidos; }
    public String getRefugioOrigen() { return refugioOrigen; }

    @Override
    public String toString() {
        return id + " " + nombre;
    }
}
