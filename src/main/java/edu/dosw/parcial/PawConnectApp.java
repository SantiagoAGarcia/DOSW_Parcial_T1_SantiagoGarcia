package com.pawconnect.app;

/**
 * Punto de entrada. Debe:
 *  1) Construir la jerarquía Composite: Red Nacional -> Ciudad -> Refugio -> Mascota,
 *     con las 12 mascotas de la tabla del enunciado.
 *  2) Ejecutar las 5 búsquedas de ejemplo (Escenarios #1 a #4/#5) usando
 *     Catalogo + los distintos CatalogoIterator, e imprimir "Total encontrados"
 *     y el detalle de cada mascota.
 */
public class PawConnectApp {

    public static void main(String[] args) {
        // TODO: construir Refugio Norte, Sur, Central, Oeste con sus mascotas

        // TODO: agrupar en GrupoRefugios por ciudad (Bogota, Medellin, Cali)
        //       y luego en un GrupoRefugios "Red Nacional"

        // TODO: Escenario #1 -> new Catalogo(redNacional).iteradorPorEspecie(Especie.PERRO)
        // TODO: Escenario #2 -> iteradorPorRangoEdad(12, 36)
        // TODO: Escenario #3 -> iteradorPorCompatibilidad(true, true, true)
        // TODO: Escenario #4 -> new Catalogo(refugioNorte).iteradorCompleto()
        // TODO: Escenario #5 -> new Catalogo(redNacional).iteradorCompleto()
    }
}
