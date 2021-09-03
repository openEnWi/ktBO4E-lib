package openenwi.bo4e.lib.com

/**
 * Mit dieser Komponente können Tarifpreise verschiedener Typen abgebildet werden.
 *
 * veröffentlicht am 12. Dezember 2018
 *
 * @see [COM TarifpreispositionProOrt](https://www.bo4e.de/dokumentation/komponenten/com-tarifpreispositionproort)
 */
data class TarifpreispositionProOrt(
    val plz:Int,
    val ort: String,
    val netznr: String,
    val preisstaffeln: List<TarifpreisstaffelProOrt>
)
