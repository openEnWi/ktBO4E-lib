package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.Preisgarantietyp

/**
 * Definition für eine Preisgarantie mit der Möglichkeit verschiedener Ausprägungen.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [COM Preisgarantie](https://www.bo4e.de/dokumentation/komponenten/com-preisgarantie)
 */
data class Preisgarantie(
    val beschreibung: String?,
    val preisgarantietyp: Preisgarantietyp,
    val zeitlicheGueltigkeit: Zeitraum
)
