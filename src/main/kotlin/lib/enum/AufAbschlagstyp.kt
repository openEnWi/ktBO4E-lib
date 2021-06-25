package de.progresslab.bo4e.lib.enum

/**
 * Festlegung, ob der Auf- oder Abschlag mit relativen oder absoluten Werten erfolgt.
 *
 * veröffentlicht am 11. April 2018
 */
enum class AufAbschlagstyp(val beschreibung: String) {
    RELATIV("Prozentualer AufAbschlag"),
    ABSOLUT("Absoluter AufAbschlag")
}