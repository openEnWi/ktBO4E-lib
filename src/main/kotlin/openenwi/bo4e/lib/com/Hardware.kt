package openenwi.bo4e.lib.com

import openenwi.bo4e.lib.enum.Geraetetyp

/**
 * Abbildung einer abrechenbaren Hardware.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see "https://www.bo4e.de/dokumentation/komponenten/com-hardware"
 */
data class Hardware(
    val geraetetyp: Geraetetyp,
    val bezeichnung: String
)
