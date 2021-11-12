package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Zaehlwerk
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Sparte
import de.openenwi.bo4e.lib.enum.Tarifart
import de.openenwi.bo4e.lib.enum.Zaehlerauspraegung
import de.openenwi.bo4e.lib.enum.Zaehlertyp
import java.math.BigDecimal
import java.time.ZonedDateTime

/**
 * Mit diesem Geschäftsobjekt wird die Information zu einem Zähler abgebildet.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [BO Zaehler](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-zahler)
 */
interface Zaehler : Geschaeftsobjekt {
    val zaehlernummer: String
    val sparte: Sparte
    val zaehlerauspraegung: Zaehlerauspraegung
    val zaehlertyp: Zaehlertyp
    val tarifart: Tarifart
    val zaehlerkonstante: BigDecimal?
    val eichungBis: ZonedDateTime?
    val letzteEichung: ZonedDateTime?
    val zaehlwerke: List<Zaehlwerk>
    val zaehlerhersteller: Geschaeftspartner
}

data class ZaehlerImpl(
    override val zaehlernummer: String,
    override val sparte: Sparte,
    override val zaehlerauspraegung: Zaehlerauspraegung,
    override val zaehlertyp: Zaehlertyp,
    override val tarifart: Tarifart,
    override val zaehlerkonstante: BigDecimal?,
    override val eichungBis: ZonedDateTime?,
    override val letzteEichung: ZonedDateTime?,
    override val zaehlwerke: List<Zaehlwerk>,
    override val zaehlerhersteller: Geschaeftspartner,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.ZAEHLER,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Zaehler
