package de.progresslab.bo4e.lib.com

/**
 * Mit dieser Komponente können Auf- und Abschläge verschiedener Typen
 * im Zusammenhang mit örtlichen Gültigkeiten abgebildet werden.
 *
 * eröffentlicht am 12. Dezember 2018
 *
 * @see "https://www.bo4e.de/dokumentation/komponenten/com-aufabschlagproort"
 *
 * @property plz Die Postleitzahl des Ortes für den der Aufschlag gilt.
 * @property ort Der Ort für den der Aufschlag gilt.
 * @property netznr Die ene't-Netznummer des Netzes in dem der Aufschlag gilt.
 * @property staffeln Werte für die gestaffelten Auf/Abschläge mit regionaler Eingrenzung.
 */
data class AufAbschlagProOrt(
    val plz: Int,
    val ort: String,
    val netznr: String,
    val staffeln: Set<AufAbschlagstaffelProOrt>
)
