package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.Messpreistyp
import de.openenwi.bo4e.lib.enum.Tarifkalkulationsmethode
import java.math.BigDecimal

/**
 * veröffentlicht am 30. Mai 2018
 *
 * @see [COM Tarifberechnungsparameter](https://www.bo4e.de/dokumentation/komponenten/com-tarifberechnungsparameter)
 */
data class Tarifberechnungsparameter(
    val berechnungsmethode: Tarifkalkulationsmethode?,
    val messpreisInGPEnthalten: Boolean?,
    val messpreistyp: Messpreistyp?,
    val kwInklusive: BigDecimal?,
    val kwWeitereMengen: BigDecimal?,
    val messpreisBeruecksichtigen: Boolean?,
    val hoechstpreisNT: Preis?,
    val hoechstpreisHT: Preis?,
    val mindestpreis: Preis?,
    val zusatzpreise: Set<Tarifpreis>
)
