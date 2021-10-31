package de.openenwi.bo4e.lib.com

import java.time.ZonedDateTime

/**
 * Abbildung für einen Vertragsteil.
 * Der Vertragsteil wird dazu verwendet,
 * eine vertragliche Leistung in Bezug zu einer Lokation (Markt- oder Messlokation) festzulegen.
 *
 * veröffentlicht am 05. September 2018
 *
 * @see [COM Vertragsteil](https://www.bo4e.de/dokumentation/komponenten/com-vertragsteil)
 */
data class Vertragsteil(
    val vertragsteilbeginn: ZonedDateTime,
    val vertragsteilende: ZonedDateTime,
    val lokation: String?,
    val vertraglichFixierteMenge: Menge?,
    val minimaleAbnahmemenge: Menge?,
    val maximaleAbnahmemenge: Menge?
)
