package de.openenwi.bo4e.lib.enum

/**
 * Festlegung, ob der Auf- oder Abschlag mit relativen oder absoluten Werten erfolgt.
 *
 * veröffentlicht am 11. April 2018
 *
 * @see [ENUM AufAbschlagstyp](https://www.bo4e.de/dokumentation/enumerations/enum-aufabschlagstyp)
 */
enum class AufAbschlagstyp(val beschreibung: String) {
    RELATIV("Prozentualer AufAbschlag"),
    ABSOLUT("Absoluter AufAbschlag")
}
