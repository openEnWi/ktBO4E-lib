package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Betrag
import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Preisposition
import de.openenwi.bo4e.lib.com.Rechnungsposition
import de.openenwi.bo4e.lib.com.Steuerbetrag
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Preisstatus
import de.openenwi.bo4e.lib.enum.Rechnungsstatus
import de.openenwi.bo4e.lib.enum.Rechnungstyp
import de.openenwi.bo4e.lib.enum.Sparte
import java.time.LocalDate

/**
 * Modell für die Abbildung von Rechnungen im Kontext der Energiewirtschaft.
 * Ausgehend von diesem Basismodell werden weitere spezifische Formen abgeleitet.
 *
 * veröffentlicht am 06. Juni 2018
 *
 * @see [BO Rechnung](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-rechnung)
 */
interface Rechnung : Geschaeftsobjekt {
    val rechnungstitel: String?
    val rechnungsstatus: Rechnungsstatus?
    val storno: Boolean
    val rechnungsnummer: String
    val rechnungsdatum: LocalDate
    val faelligkeitsdatum: LocalDate
    val rechnungsstyp: Rechnungstyp
    val originalRechnungsnummer: String?
    val rechnungsperiode: Zeitraum
    val rechnungsersteller: Geschaeftspartner
    val rechnungsempfaenger: Geschaeftspartner
    val gesamtnetto: Betrag
    val gesamtsteuer: Betrag
    val gesamtbrutto: Betrag
    val vorausgezahlt: Betrag?
    val rabattBrutto: Betrag?
    val zuzahlen: Betrag
    val steuerbetraege: Set<Steuerbetrag>
    val rechnungspositionen: List<Rechnungsposition>
}

data class RechnungImpl(
    override val rechnungstitel: String?,
    override val rechnungsstatus: Rechnungsstatus?,
    override val storno: Boolean,
    override val rechnungsnummer: String,
    override val rechnungsdatum: LocalDate,
    override val faelligkeitsdatum: LocalDate,
    override val rechnungsstyp: Rechnungstyp,
    override val originalRechnungsnummer: String?,
    override val rechnungsperiode: Zeitraum,
    override val rechnungsersteller: Geschaeftspartner,
    override val rechnungsempfaenger: Geschaeftspartner,
    override val gesamtnetto: Betrag,
    override val gesamtsteuer: Betrag,
    override val gesamtbrutto: Betrag,
    override val vorausgezahlt: Betrag?,
    override val rabattBrutto: Betrag?,
    override val zuzahlen: Betrag,
    override val steuerbetraege: Set<Steuerbetrag>,
    override val rechnungspositionen: List<Rechnungsposition>,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.RECHNUNG,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Rechnung
