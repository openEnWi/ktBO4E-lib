package openenwi.bo4e.lib.com

import openenwi.bo4e.lib.enum.AufAbschlagstyp
import openenwi.bo4e.lib.enum.AufAbschlagsziel
import openenwi.bo4e.lib.enum.Waehrungseinheit

/**
 * Modell für die preiserhöhenden (Aufschlag) bzw. preisvermindernden (Abschlag) Zusatzvereinbarungen,
 * die individuell zu einem neuen oder bestehenden Liefervertrag abgeschlossen wurden.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [COM AufAbschlag](https://www.bo4e.de/dokumentation/komponenten/com-aufabschlag)
 */
data class AufAbschlag(
    val bezeichnung: String,
    val beschreibung: String?,
    val aufAbschlagstyp: AufAbschlagstyp?,
    val aufAbschlagsziel: AufAbschlagsziel?,
    val einheit: Waehrungseinheit,
    val website: String?,
    val gueltigkeitszeitraum: Zeitraum?,
    val staffeln: Set<Preisstaffel>
)
