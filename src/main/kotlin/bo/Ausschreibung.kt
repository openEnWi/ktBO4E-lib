package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Ausschreibungslos
import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.Ausschreibungsportal
import de.openenwi.bo4e.lib.enum.Ausschreibungsstatus
import de.openenwi.bo4e.lib.enum.Ausschreibungstyp
import de.openenwi.bo4e.lib.enum.BOTyp
import java.time.ZonedDateTime

/**
 * Das BO Ausschreibung dient zur detaillierten Darstellung
 * von ausgeschriebenen Energiemengen in der Energiewirtschaft.
 *
 * veröffentlicht am 27. Juni 2018
 *
 * @see [BO Ausschreibung](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-ausschreibung)
 */
interface Ausschreibung : Geschaeftsobjekt{
    val ausschreibungsnummer: String
    val ausschreibungstyp: Ausschreibungstyp
    val ausschreibungsstatus: Ausschreibungsstatus
    val ausschreibungportal: Ausschreibungsportal?
    val kostenpflichtig: Boolean
    val veroeffentlichungszeitpunkt: ZonedDateTime
    val webseite: String?
    val ausschreibender: Geschaeftspartner
    val abgabefrist: Zeitraum
    val bindefrist: Zeitraum
    val lose: Set<Ausschreibungslos>
}

data class AusschreibungImpl(
    override val ausschreibungsnummer: String,
    override val ausschreibungstyp: Ausschreibungstyp,
    override val ausschreibungsstatus: Ausschreibungsstatus,
    override val ausschreibungportal: Ausschreibungsportal?,
    override val kostenpflichtig: Boolean,
    override val veroeffentlichungszeitpunkt: ZonedDateTime,
    override val webseite: String?,
    override val ausschreibender: Geschaeftspartner,
    override val abgabefrist: Zeitraum,
    override val bindefrist: Zeitraum,
    override val lose: Set<Ausschreibungslos>,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.AUSSCHREIBUNG,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Ausschreibung
