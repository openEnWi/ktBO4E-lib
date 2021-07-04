package de.progresslab.bo4e.lib.com

import de.progresslab.bo4e.lib.enum.Preisgarantietyp

/**
 * Abbildung einer Preisgarantie mit regionaler Abgrenzung.
 *
 * veröffentlicht am 20. Juni 2018
 *
 * @see "https://www.bo4e.de/dokumentation/komponenten/com-regionalepreisgarantie"
 *
 * @see de.progresslab.bo4e.lib.com.Preisgarantie
 */
data class RegionalePreisgarantie(
    val beschreibung: String?,
    val preisgarantietyp: Preisgarantietyp,
    val zeitlicheGueltigkeit: Zeitraum,
    val regionaleGueltigkeit: RegionaleGueltigkeit
)
