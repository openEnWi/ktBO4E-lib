package openenwi.bo4e.lib.bo

import openenwi.bo4e.lib.com.Energiemix
import openenwi.bo4e.lib.com.Vertragskonditionen
import openenwi.bo4e.lib.com.Zeitraum
import openenwi.bo4e.lib.enum.*

/**
 * Das BO Tarifinfo liefert die Merkmale, die einen Endkundentarif identifizierbar machen.
 * Dieses BO dient als Basis für weitere BOs mit erweiterten Anwendungsmöglichkeiten.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [BO Tarifinfo](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-tarifinfo)
 */
data class Tarifinfo(
    val geschaeftsobjekt: Geschaeftsobjekt = Geschaeftsobjekt(boTyp = BOTyp.TARIFINFO),
    val bezeichnung: String,
    val anbietername: String,
    val sparte: Sparte,
    val kundentyp: Kundentyp,
    val tarifart: Tarifart,
    val tariftyp: Tariftyp,
    val tarifmerkmal: Tarifmerkmal,
    val website: String?,
    val anbieter: Marktteilnehmer,
    val zeitlicheGueltigkeit: Zeitraum?,
    val energiemix: Energiemix?,
    val vertragskonditionen: Vertragskonditionen?
)
