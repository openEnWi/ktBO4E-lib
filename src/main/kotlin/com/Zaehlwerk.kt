package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.Energierichtung
import de.openenwi.bo4e.lib.enum.Mengeneinheit
import java.math.BigDecimal

/**
 * Mit dieser Komponente werden Zählwerke modelliert.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [COM Zaehlwerk](https://www.bo4e.de/dokumentation/komponenten/com-zahlwerk)
 */
data class Zaehlwerk(
    val zaehlwerkId: String,
    val bezeichnung: String,
    val richtung: Energierichtung,
    val obisKennzahl: String,
    val wandlerfaktor: BigDecimal,
    val einheit: Mengeneinheit
)
