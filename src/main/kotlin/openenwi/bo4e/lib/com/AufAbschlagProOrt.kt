package openenwi.bo4e.lib.com

/**
 * Mit dieser Komponente können Auf- und Abschläge verschiedener Typen
 * im Zusammenhang mit örtlichen Gültigkeiten abgebildet werden.
 *
 * Version 2.0
 * veröffentlicht am 05. Oktober 2021
 *
 * @see [COM AufAbschlagProOrt](https://www.bo4e.de/dokumentation/komponenten/com-aufabschlagproort/5-10-2021)
 *
 * @property postleitzahl Die Postleitzahl des Ortes für den der Aufschlag gilt.
 * @property ort Der Ort für den der Aufschlag gilt.
 * @property netznr Die ene't-Netznummer des Netzes in dem der Aufschlag gilt.
 * @property staffeln Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung.
 */
data class AufAbschlagProOrt(
    val postleitzahl: String,
    val ort: String,
    val netznr: String,
    val staffeln: Set<AufAbschlagstaffelProOrt>
)
