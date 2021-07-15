package openenwi.bo4e.lib.com

import openenwi.bo4e.lib.enum.Energierichtung
import openenwi.bo4e.lib.enum.Mengeneinheit
import java.math.BigDecimal

/**
 * Mit dieser Komponente werden Zählwerke modelliert.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see "https://www.bo4e.de/dokumentation/komponenten/com-zahlwerk"
 */
data class Zaehlwerk(
    val zaehlwerkId: String,
    val bezeichnung: String,
    val richtung: Energierichtung,
    val obisKennzahl: String,
    val wandlerfaktor: BigDecimal,
    val einheit: Mengeneinheit
)
