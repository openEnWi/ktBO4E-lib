package de.progresslab.bo4e.lib.com

import de.progresslab.bo4e.lib.enum.Preisgarantietyp

/**
 * Definition für eine Preisgarantie mit der Möglichkeit verschiedener Ausprägungen.
 *
 * veröffentlicht am 30. Mai 2018
 */
data class Preisgarantie(
    val beschreibung: String?,
    val preisgarantietyp: Preisgarantietyp,
    val zeitlicheGueltigkeit: Zeitraum
)
