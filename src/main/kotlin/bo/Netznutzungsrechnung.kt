package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Betrag
import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Rechnungsposition
import de.openenwi.bo4e.lib.com.Steuerbetrag
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.BOTyp
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
interface Netznutzungsrechnung : Rechnung {
    val sparte: Sparte
    val absendercodenummer: String
    val empfaengercodenummer: String
    val nnrechnungsart: NNRechnungsart
    val nnrechnungstyp: NNRechnungstyp
    val original: Boolean
    val simuliert: Boolean
    val lokationsId: String?
}

data class NetznutzungsrechnungImpl(
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

    override val sparte: Sparte,
    override val absendercodenummer: String,
    override val empfaengercodenummer: String,
    override val nnrechnungsart: NNRechnungsart,
    override val nnrechnungstyp: NNRechnungstyp,
    override val original: Boolean,
    override val simuliert: Boolean,
    override val lokationsId: String?,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.NETZNUTZUNGSRECHNUNG,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Netznutzungsrechnung
