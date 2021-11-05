package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Betrag
import de.openenwi.bo4e.lib.com.Rechnungsposition
import de.openenwi.bo4e.lib.com.Steuerbetrag
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.NNRechnungsart
import de.openenwi.bo4e.lib.enum.NNRechnungstyp
import de.openenwi.bo4e.lib.enum.Rechnungsstatus
import de.openenwi.bo4e.lib.enum.Rechnungstyp
import de.openenwi.bo4e.lib.enum.Sparte
import java.time.LocalDate

/**
 * veröffentlicht am 06. Juni 2018
 *
 * @see [BO Netznutzungsrechnung](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-netznutzungsrechnung)
 */
data class Netznutzungsrechnung(
    val sparte: Sparte,
    val absendercodenummer: String,
    val empfaengercodenummer: String,
    val nnrechnungsart: NNRechnungsart,
    val nnrechnungstyp: NNRechnungstyp,
    val original: Boolean,
    val simuliert: Boolean,
    val lokationsId: String?,
    private val rechnung: Rechnung,
) : Rechnung by rechnung {
    constructor(
        rechnungstitel: String?,
        rechnungsstatus: Rechnungsstatus?,
        storno: Boolean,
        rechnungsnummer: String,
        rechnungsdatum: LocalDate,
        faelligkeitsdatum: LocalDate,
        rechnungsstyp: Rechnungstyp,
        originalRechnungsnummer: String?,
        rechnungsperiode: Zeitraum,
        rechnungsersteller: Geschaeftspartner,
        rechnungsempfaenger: Geschaeftspartner,
        gesamtnetto: Betrag,
        gesamtsteuer: Betrag,
        gesamtbrutto: Betrag,
        vorausgezahlt: Betrag?,
        rabattBrutto: Betrag?,
        zuzahlen: Betrag,
        steuerbetraege: Set<Steuerbetrag>,
        rechnungspositionen: List<Rechnungsposition>,
        sparte: Sparte,
        absendercodenummer: String,
        empfaengercodenummer: String,
        nnrechnungsart: NNRechnungsart,
        nnrechnungstyp: NNRechnungstyp,
        original: Boolean,
        simuliert: Boolean,
        lokationsId: String?,
    ) : this(
        sparte,
        absendercodenummer,
        empfaengercodenummer,
        nnrechnungsart,
        nnrechnungstyp,
        original,
        simuliert,
        lokationsId,
        RechnungImpl(
            rechnungstitel,
            rechnungsstatus,
            storno,
            rechnungsnummer,
            rechnungsdatum,
            faelligkeitsdatum,
            rechnungsstyp,
            originalRechnungsnummer,
            rechnungsperiode,
            rechnungsersteller,
            rechnungsempfaenger,
            gesamtnetto,
            gesamtsteuer,
            gesamtbrutto,
            vorausgezahlt,
            rabattBrutto,
            zuzahlen,
            steuerbetraege,
            rechnungspositionen,
        )
    )
}
