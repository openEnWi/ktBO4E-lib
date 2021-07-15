package openenwi.bo4e.lib.com

/**
 * Standorteigenschaften der Sparte Strom
 *
 * veröffentlicht am 03. Juli 2019
 *
 * @see "https://www.bo4e.de/dokumentation/komponenten/com-standorteigenschaften-strom"
 */
data class StandorteigenschaftenStrom(
    val bilanzierungsgebiet_EIC: String,
    val regelzone: String,
    val regelzone_EIC: String
)
