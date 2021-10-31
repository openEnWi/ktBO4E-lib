package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.Angebotsstatus
import java.time.LocalDate
import java.time.ZonedDateTime

/**
 * Führt die verschiedenen Ausprägungen der Angebotsberechnung auf.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [COM Angebotsvariante](https://www.bo4e.de/dokumentation/komponenten/com-angebotsvariante)
 */
data class Angebotsvariante(
    val angebotsstatus: Angebotsstatus,
    val beschreibung: String?,
    val erstelldatum: LocalDate,
    val bindefrist: ZonedDateTime,
    val gesamtmenge: Menge?,
    val gesamtkosten: Betrag?,
    val teile: List<Angebotsteil>
)
