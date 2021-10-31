package de.openenwi.bo4e.lib.com

import java.time.ZonedDateTime

/**
 * Modellierung einer Unterschrift, z.B. für Verträge, Angebote etc.
 *
 * veröffentlicht am 05. September 2018
 *
 * @see [COM Unterschrift](https://www.bo4e.de/dokumentation/komponenten/com-unterschrift)
 */
data class Unterschrift(
    val ort: String? = null,
    val datum: ZonedDateTime? = null,
    val name: String
)
