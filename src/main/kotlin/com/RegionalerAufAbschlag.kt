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
 * veröffentlicht am 30. Mai 2018
 *
 * @see [COM RegionalerAufAbschlag](https://www.bo4e.de/dokumentation/komponenten/com-regionaleraufabschlag)
 */
data class RegionalerAufAbschlag(
    val bezeichnung: String,
    val beschreibung: String?,
    val aufAbschlagstyp: AufAbschlagstyp?,
    val aufAbschlagsziel: AufAbschlagsziel?,
    val einheit: Waehrungseinheit?,
    val website: String?,
    val zusatzprodukte: Set<String>,
    val voraussetzungen: Set<String>,
    val gueltigkeitszeitraum: Zeitraum,
    val tarifnamensaenderungen: Set<String>,
    val energiemixaenderung: Energiemix?,
    val vertagskonditionsaenderung: Vertragskonditionen?,
    val garantieaenderung: Preisgarantie?,
    val einschraenkungsaenderung: Tarifeinschraenkung,
    val staffeln: Set<RegionalePreisstaffel>
)
