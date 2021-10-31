package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.bo.Geschaeftsobjekt.Companion.typ
import de.openenwi.bo4e.lib.com.Energiemix
import de.openenwi.bo4e.lib.com.Vertragskonditionen
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.*
import de.openenwi.bo4e.lib.enum.BOTyp.TARIFINFO

/**
 * Das BO Tarifinfo liefert die Merkmale, die einen Endkundentarif identifizierbar machen.
 * Dieses BO dient als Basis für weitere BOs mit erweiterten Anwendungsmöglichkeiten.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [BO Tarifinfo](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-tarifinfo)
 */
data class Tarifinfo(
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
    val vertragskonditionen: Vertragskonditionen?,
    val geschaeftsobjekt: Geschaeftsobjekt = typ(TARIFINFO)
) : Geschaeftsobjekt by geschaeftsobjekt
