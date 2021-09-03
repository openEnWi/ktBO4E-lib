package openenwi.bo4e.lib.com

import java.math.BigDecimal

/**
 * veröffentlicht am 11. April 2018
 *
 * @see [COM Sigmoidparameter](https://www.bo4e.de/dokumentation/komponenten/com-sigmoidparameter)
 *
 * @property A Briefmarke Ortsverteilnetz
 * @property B Wendepunkt für die bepreiste Menge
 * @property C Exponent
 * @property D Briefmarke Transportnetz
 */
data class Sigmoidparameter(val A: BigDecimal, val B: BigDecimal, val C: BigDecimal, val D: BigDecimal)
