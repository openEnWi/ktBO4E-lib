package openenwi.bo4e.lib.bo

import openenwi.bo4e.lib.com.Angebotsvariante
import openenwi.bo4e.lib.enum.BOTyp
import openenwi.bo4e.lib.enum.Sparte
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
 * @see "https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-angebot"
 */
data class Angebot(
    val angebotsnummer: String,
    val anfragereferenz: String?,
    val angebotsdatum: ZonedDateTime,
    val sparte: Sparte,
    val bindefrist: ZonedDateTime?,
    val angebotsgeber: Geschaeftspartner,
    val angebotsnehmer: Geschaeftspartner,
    val unterzeichnerAngebotsnehmer: Ansprechpartner?,
    val unterzeichnerAngebotsgeber: Ansprechpartner?,
    val varianten: Set<Angebotsvariante>
) : Geschaeftsobjekt(boTyp = BOTyp.ANGEBOT)
