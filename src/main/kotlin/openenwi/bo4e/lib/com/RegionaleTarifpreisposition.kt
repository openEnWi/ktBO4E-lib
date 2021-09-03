package openenwi.bo4e.lib.com

import openenwi.bo4e.lib.enum.Mengeneinheit
import openenwi.bo4e.lib.enum.Preistyp
import openenwi.bo4e.lib.enum.Waehrungseinheit

/**
 * Mit dieser Komponente können Tarifpreise verschiedener Typen
 * im Zusammenhang mit regionalen Gültigkeiten abgebildet werden.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [COM RegionaleTarifpreisposition](https://www.bo4e.de/dokumentation/komponenten/com-regionaletarifpreisposition)
 */
data class RegionaleTarifpreisposition(
    val preistyp: Preistyp,
    val einheit: Waehrungseinheit,
    val bezugseinheit: Mengeneinheit,
    val mengeneinheitstaffel: Mengeneinheit?,
    val preisstaffeln: Set<RegionalePreisstaffel>
)
