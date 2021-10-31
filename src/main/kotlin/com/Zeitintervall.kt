package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.Zeiteinheit

/**
 * Die Abbildung eines Zeitintervalls.
 * Z.B. zur Anwendung als Raster in äquidistanten Zeitreihen/Lastgängen, beispielsweise 15 Minuten.
 *
 * veröffentlicht am 07. Oktober 2020
 *
 * @see [COM Zeitintervall](https://www.bo4e.de/dokumentation/komponenten/com-zeitintervall)
 */
data class Zeitintervall(
    val wert: Int,
    val zeiteinheit: Zeiteinheit
)
