package openenwi.bo4e.lib.com

import openenwi.bo4e.lib.enum.Preismodell
import openenwi.bo4e.lib.enum.Rechnungslegung
import openenwi.bo4e.lib.enum.Sparte
import openenwi.bo4e.lib.enum.Vertragsform

/**
 * Eine Komponente zur Abbildung einzelner Lose einer Ausschreibung.
 *
 * veröffentlicht am 28. Februar 2018
 *
 * @see "https://www.bo4e.de/dokumentation/komponenten/com-ausschreibungslos"
 */
data class Ausschreibungslos(
    val losnummer: String,
    val bezeichnung: String,
    val bemerkung: String?,
    val preismodell: Preismodell,
    val energieart: Sparte,
    val wunschRechnungslegung: Rechnungslegung,
    val wunschVertragsform: Vertragsform,
    val betreutDurch: String,
    val anzahlLieferstellen: Int,
    val lieferstellen: List<Ausschreibungsdetail>,
    val gesamtmenge: Menge?,
    val wunschMindestmenge: Menge?,
    val wunschMaximalmenge: Menge?,
    val lieferzeitraum: Zeitraum,
    val wunschKuendingungsfrist: Zeitraum,
    val wunschZahlungsziel: Zeitraum
)
