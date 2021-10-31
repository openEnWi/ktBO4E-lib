package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.Landescode

/**
 * Enthält eine Adresse, die für die meisten Zwecke verwendbar ist.
 *
 * Version 2.0
 * veröffentlicht am 05. Oktober 2021
 *
 * @see [COM Adresse](https://www.bo4e.de/dokumentation/komponenten/com-adresse/5-10-2021)
 */
data class Adresse(
    val postleitzahl: String,
    val ort: String,
    val strasse: String?,
    val hausnummer: String?,
    val postfach: String?,
    val adresszusatz: String?,
    val coErgaenzung: String?,
    val landescode: Landescode?
)
