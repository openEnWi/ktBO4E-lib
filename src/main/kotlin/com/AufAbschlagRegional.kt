package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.AufAbschlagstyp
import de.openenwi.bo4e.lib.enum.AufAbschlagsziel
import de.openenwi.bo4e.lib.enum.Waehrungseinheit

/**
 * Mit dieser Komponente können Auf- und Abschläge verschiedener Typen
 * im Zusammenhang mit regionalen Gültigkeiten abgebildet werden.
 *
 * Hier sind auch die Auswirkungen auf verschiedene Tarifparameter modelliert,
 * die sich durch die Auswahl eines Auf- oder Abschlags ergeben.
 *
 * veröffentlicht am 12. Dezember 2018
 *
 * @see [COM AufAbschlagRegional](https://www.bo4e.de/dokumentation/komponenten/com-aufabschlagregional)
 */
data class AufAbschlagRegional(
    val bezeichnung: String,
    val beschreibung: String?,
    val aufAbschlagstyp: AufAbschlagstyp?,
    val aufAbschlagsziel: AufAbschlagsziel?,
    val einheit: Waehrungseinheit?,
    val website: String?,
    val zusatzprodukte: List<String>,
    val voraussetzungen: List<String>,
    val gueltigkeitszeitraum: Zeitraum?,
    val tarifnamensaenderungen: String?,
    val energiemixaenderung: Energiemix?,
    val vertagskonditionsaenderung: Vertragskonditionen?,
    val garantieaenderung: Preisgarantie,
    val einschraenkungsaenderung: List<Tarifeinschraenkung>,
    val betraege: List<AufAbschlagProOrt>
)
