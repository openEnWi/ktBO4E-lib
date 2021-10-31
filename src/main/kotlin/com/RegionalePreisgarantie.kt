package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.Preisgarantietyp

/**
 * Abbildung einer Preisgarantie mit regionaler Abgrenzung.
 *
 * veröffentlicht am 20. Juni 2018
 *
 * @see [COM RegionalePreisgarantie](https://www.bo4e.de/dokumentation/komponenten/com-regionalepreisgarantie)
 *
 * @see Preisgarantie
 */
data class RegionalePreisgarantie(
    val beschreibung: String?,
    val preisgarantietyp: Preisgarantietyp,
    val zeitlicheGueltigkeit: Zeitraum,
    val regionaleGueltigkeit: RegionaleGueltigkeit
)
