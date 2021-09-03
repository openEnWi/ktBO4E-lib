package openenwi.bo4e.lib.com

import openenwi.bo4e.lib.enum.Erzeugungsart
import java.math.BigDecimal

/**
 * veröffentlicht am 30. Mai 2018
 *
 * @see [COM Energieherkunft(https://www.bo4e.de/dokumentation/komponenten/com-energieherkunft)
 *
 * @property erzeugungsart Art der Erzeugung der Energie.
 * @property anteilProzent Prozentualer Anteil der jeweiligen Erzeugungsart.
 */
data class Energieherkunft(val erzeugungsart: Erzeugungsart, val anteilProzent: BigDecimal)
