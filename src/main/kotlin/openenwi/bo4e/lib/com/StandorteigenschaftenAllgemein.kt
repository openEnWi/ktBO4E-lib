package openenwi.bo4e.lib.com

/**
 * Allgemeine Standorteigenschaften
 *
 * veröffentlicht am 03. Juli 2019
 *
 * @see [COM StandorteigenschaftenAllgemein](https://www.bo4e.de/dokumentation/komponenten/comndorteigenschaftenallgemein)
 */
data class StandorteigenschaftenAllgemein(
    val postleitzahl: String,
    val ort: String,
    val kreisname: String,
    val gemeindename: String,
    val gemeindekennziffer: String,
    val gemeindeeinwohner: Int,
    val bundesland: String
)
