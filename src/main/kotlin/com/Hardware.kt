package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.Geraetetyp

/**
 * Abbildung einer abrechenbaren Hardware.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [COM Hardware]https://www.bo4e.de/dokumentation/komponenten/com-hardware)
 */
data class Hardware(
    val geraetetyp: Geraetetyp,
    val bezeichnung: String
)
