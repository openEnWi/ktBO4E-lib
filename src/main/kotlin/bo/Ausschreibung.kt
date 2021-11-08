package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Ausschreibungslos
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.Ausschreibungsportal
import de.openenwi.bo4e.lib.enum.Ausschreibungsstatus
import de.openenwi.bo4e.lib.enum.Ausschreibungstyp
import java.time.ZonedDateTime

/**
 * Das BO Ausschreibung dient zur detaillierten Darstellung
 * von ausgeschriebenen Energiemengen in der Energiewirtschaft.
 *
 * veröffentlicht am 27. Juni 2018
 *
 * @see [BO Ausschreibung](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-ausschreibung)
 */
data class Ausschreibung(
    val ausschreibungsnummer: String,
    val ausschreibungstyp: Ausschreibungstyp,
    val ausschreibungsstatus: Ausschreibungsstatus,
    val ausschreibungportal: Ausschreibungsportal?,
    val kostenpflichtig: Boolean,
    val veroeffentlichungszeitpunkt: ZonedDateTime,
    val webseite: String?,
    val ausschreibender: Geschaeftspartner,
    val abgabefrist: Zeitraum,
    val bindefrist: Zeitraum,
    val lose: Set<Ausschreibungslos>,
    private val geschaeftsobjekt: Geschaeftsobjekt
) : Geschaeftsobjekt by geschaeftsobjekt
