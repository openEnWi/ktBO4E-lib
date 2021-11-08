package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Zaehlwerk
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
data class Zaehler(
    val zaehlernummer: String,
    val sparte: Sparte,
    val zaehlerauspraegung: Zaehlerauspraegung,
    val zaehlertyp: Zaehlertyp,
    val tarifart: Tarifart,
    val zaehlerkonstante: BigDecimal?,
    val eichungBis: ZonedDateTime?,
    val letzteEichung: ZonedDateTime?,
    val zaehlwerke: List<Zaehlwerk>,
    val zaehlerhersteller: Geschaeftspartner,
    private val geschaeftsobjekt: Geschaeftsobjekt,
) : Geschaeftsobjekt by geschaeftsobjekt
