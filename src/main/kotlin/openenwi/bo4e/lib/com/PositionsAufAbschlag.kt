package openenwi.bo4e.lib.com

import openenwi.bo4e.lib.enum.AufAbschlagstyp
import openenwi.bo4e.lib.enum.Waehrungseinheit
import java.math.BigDecimal

/**
 * Differenzierung der zu betrachtenden Produkte
 * anhand der preiserhöhenden (Aufschlag) bzw. preisvermindernden (Abschlag) Zusatzvereinbarungen,
 * die individuell zu einem neuen oder bestehenden Liefervertrag abgeschlossen werden können.
 * Es können mehrere Auf-/Abschläge gleichzeitig ausgewählt werden.
 *
 * veröffentlicht am 11. April 2018
 *
 * @see "https://www.bo4e.de/dokumentation/komponenten/com-positionsaufabschlag"
 */
data class PositionsAufAbschlag(
    val bezeichnung: String,
    val beschreibung: String,
    val aufAbschlagstyp: AufAbschlagstyp,
    val aufAbschlagswert: BigDecimal,
    val aufAbschlagswaehrung: Waehrungseinheit
)
