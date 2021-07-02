package de.progresslab.bo4e.lib.com

import de.progresslab.bo4e.lib.enum.Tarifregionskriterium

/**
 * Mit dieser Komponente können Kriterien und deren Werte definiert werden.
 *
 * veröffentlicht am 29. August 2018
 *
 * @see "https://www.bo4e.de/dokumentation/komponenten/com-kriteriumwert"
 */
data class KriteriumWert(
    val kriterium: Tarifregionskriterium,
    val wert: String
)
