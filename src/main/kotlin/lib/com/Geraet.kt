package de.progresslab.bo4e.lib.com

/**
 * Mit dieser Komponente werden alle Geräte modelliert, die keine Zähler sind.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see "https://www.bo4e.de/dokumentation/komponenten/com-geraet"
 */
data class Geraet(
    val geraetenummer: String?,
    val geraeteeigenschaften: Set<Geraeteeigenschaften>
)
