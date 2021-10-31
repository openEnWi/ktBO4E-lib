package de.openenwi.bo4e.lib.com

/**
 * Dient der Adressierung über die Liegenschafts-Information.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [COM Katasteradresse](https://www.bo4e.de/dokumentation/komponenten/com-katasteradresse)
 */
data class Katasteradresse(val gemarkung_flur: String, val flurstueck: String)
