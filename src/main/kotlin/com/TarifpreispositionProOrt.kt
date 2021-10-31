package de.openenwi.bo4e.lib.com

/**
 * Mit dieser Komponente können Tarifpreise verschiedener Typen abgebildet werden.
 *
 * Version 2.0
 * veröffentlicht am 05. Oktober 2021
 *
 * @see [COM TarifpreispositionProOrt](https://www.bo4e.de/dokumentation/komponenten/com-tarifpreispositionproort)
 *
 * @property postleitzahl Postleitzahl des Ortes für den der Preis gilt.
 * @property ort Ort für den der Preis gilt.
 * @property netznr ene't-Netznummer des Netzes in dem der Preis gilt.
 * @property preisstaffeln Hier sind die Staffeln mit ihren Preisenangaben definiert. Siehe COM TarifpreisstaffelProOrt
 */
data class TarifpreispositionProOrt(
    val postleitzahl:String,
    val ort: String,
    val netznr: String,
    val preisstaffeln: List<TarifpreisstaffelProOrt>
)
