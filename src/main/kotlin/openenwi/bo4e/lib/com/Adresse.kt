package openenwi.bo4e.lib.com

import openenwi.bo4e.lib.enum.Landescode

/**
 * Enthält eine Adresse, die für die meisten Zwecke verwendbar ist.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [COM Adresse](https://www.bo4e.de/dokumentation/komponenten/com-adresse)
 */
data class Adresse(
    val postleitzahl: Int,
    val ort: String,
    val strasse: String,
    val hausnummer: String,
    val postfach: String?,
    val adresszusatz: String?,
    val coErgaenzung: String?,
    val landescode: Landescode
)
