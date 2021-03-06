package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.BDEWArtikelnummer
import de.openenwi.bo4e.lib.enum.Mengeneinheit
import java.math.BigDecimal
import java.time.LocalDate

/**
 * Abbildung einer Rechnungsposition.
 * Über Rechnungspositionen werden Rechnungen strukturiert.
 * In einem Rechnungsteil wird jeweils eine in sich geschlossene Leistung abgerechnet.
 *
 * veröffentlicht am 06. Juni 2018
 *
 * @see [COM Rechnungsposition](https://www.bo4e.de/dokumentation/komponenten/com-rechnungsposition)
 */
data class Rechnungsposition(
    val positionsnummer: BigDecimal,
    val lieferungVon: LocalDate,
    val lieferungBis: LocalDate,
    val positionstext: String,
    val zeiteinheit: Mengeneinheit?,
    val artikelnummer: BDEWArtikelnummer?,
    val lokationsId: String?,
    val positionsMenge: Menge?,
    val zeitbezogeneMenge: Menge?,
    val einzelpreis: Preis,
    val teilsummeNetto: Betrag?,
    val teilrabattNetto: Betrag?,
    val teilsummeSteuer: Steuerbetrag
)
