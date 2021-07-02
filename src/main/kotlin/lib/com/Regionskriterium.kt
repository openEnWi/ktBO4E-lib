package de.progresslab.bo4e.lib.com

import de.progresslab.bo4e.lib.enum.Gueltigkeitstyp
import de.progresslab.bo4e.lib.enum.Regionskriteriumtyp

/**
 * Komponente zur Abbildung eines Regionskriteriums.
 *
 * veröffentlicht am 22. August 2018
 *
 * @see "https://www.bo4e.de/dokumentation/komponenten/com-regionskriterium"
 */
data class Regionskriterium(
    val gueltigkeitstyp: Gueltigkeitstyp,
    val regionskriteriumtyp: Regionskriteriumtyp,
    val wert: String
)
