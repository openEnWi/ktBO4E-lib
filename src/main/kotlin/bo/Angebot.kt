package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Angebotsvariante
import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Sparte
import java.time.ZonedDateTime

/**
 * Mit diesem BO kann ein Versorgungsangebot zur Strom- oder Gasversorgung
 * oder die Teilnahme an einer Ausschreibung übertragen werden.
 * Es können verschiedene Varianten enthalten sein (z.B. ein- und mehrjährige Laufzeit).
 * Innerhalb jeder Variante können Teile enthalten sein,
 * die jeweils für eine oder mehrere Marktlokationen erstellt werden.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [BO Angebot](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-angebot)
 */
interface Angebot : Geschaeftsobjekt {
    val angebotsnummer: String
    val anfragereferenz: String?
    val angebotsdatum: ZonedDateTime
    val sparte: Sparte
    val bindefrist: ZonedDateTime?
    val angebotsgeber: Geschaeftspartner
    val angebotsnehmer: Geschaeftspartner
    val unterzeichnerAngebotsnehmer: Ansprechpartner?
    val unterzeichnerAngebotsgeber: Ansprechpartner?
    val varianten: Set<Angebotsvariante>
}

data class AngebotImpl(
    override val angebotsnummer: String,
    override val anfragereferenz: String? = null,
    override val angebotsdatum: ZonedDateTime,
    override val sparte: Sparte,
    override val bindefrist: ZonedDateTime? = null,
    override val angebotsgeber: Geschaeftspartner,
    override val angebotsnehmer: Geschaeftspartner,
    override val unterzeichnerAngebotsnehmer: Ansprechpartner? = null,
    override val unterzeichnerAngebotsgeber: Ansprechpartner? = null,
    override val varianten: Set<Angebotsvariante> = emptySet(),

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.ANGEBOT,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Angebot