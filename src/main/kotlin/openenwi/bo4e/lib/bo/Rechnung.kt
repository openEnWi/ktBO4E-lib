package openenwi.bo4e.lib.bo

import openenwi.bo4e.lib.com.Betrag
import openenwi.bo4e.lib.com.Rechnungsposition
import openenwi.bo4e.lib.com.Steuerbetrag
import openenwi.bo4e.lib.com.Zeitraum
import openenwi.bo4e.lib.enum.BOTyp
import openenwi.bo4e.lib.enum.Rechnungsstatus
import openenwi.bo4e.lib.enum.Rechnungstyp
import java.time.LocalDate

/**
 * Modell für die Abbildung von Rechnungen im Kontext der Energiewirtschaft.
 * Ausgehend von diesem Basismodell werden weitere spezifische Formen abgeleitet.
 *
 * veröffentlicht am 06. Juni 2018
 *
 * @see [BO Rechnung](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-rechnung)
 */
data class Rechnung(
    val rechnungstitel: String?,
    val rechnungsstatus: Rechnungsstatus?,
    val storno: Boolean,
    val rechnungsnummer: String,
    val rechnungsdatum: LocalDate,
    val faelligkeitsdatum: LocalDate,
    val rechnungsstyp: Rechnungstyp,
    val originalRechnungsnummer: String?,
    val rechnungsperiode: Zeitraum,
    val rechnungsersteller: Geschaeftspartner,
    val rechnungsempfaenger: Geschaeftspartner,
    val gesamtnetto: Betrag,
    val gesamtsteuer: Betrag,
    val gesamtbrutto: Betrag,
    val vorausgezahlt: Betrag?,
    val rabattBrutto: Betrag?,
    val zuzahlen: Betrag,
    val steuerbetraege: Set<Steuerbetrag>,
    val rechnungspositionen: List<Rechnungsposition>
) : Geschaeftsobjekt(boTyp = BOTyp.RECHNUNG)
