package de.openenwi.bo4e.lib.com

import java.math.BigDecimal

/**
 * Diese Komponente liefert die Geokoordinaten für einen Ort.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [COM Geokoordinaten](https://www.bo4e.de/dokumentation/komponenten/com-geokoordinaten)
 */
data class Geokoordinaten(val breitengrad: BigDecimal, val laengengrad: BigDecimal)
