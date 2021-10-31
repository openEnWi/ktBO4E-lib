package de.openenwi.bo4e.lib.com

/**
 * Standorteigenschaften der Sparte Gas
 *
 * veröffentlicht am 03. Juli 2019
 *
 * @see [COM StandorteigenschaftenGas](https://www.bo4e.de/dokumentation/komponenten/com-standorteigenschaftengas)
 */
data class StandorteigenschaftenGas(
    val netzkontonummern: Set<String>,
    val marktgebiete: Marktgebietinfo
)
