package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.Mengeneinheit
import de.openenwi.bo4e.lib.enum.Preistyp
import de.openenwi.bo4e.lib.enum.Waehrungseinheit

/**
 * Mit dieser Komponente können Tarifpreise verschiedener Typen abgebildet werden.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [COM Tarifpreisposition](https://www.bo4e.de/dokumentation/komponenten/com-tarifpreisposition)
 */
data class Tarifpreisposition(
    val preistyp: Preistyp,
    val einheit: Waehrungseinheit,
    val bezugseinheit: Mengeneinheit,
    val mengeneinheitstaffel: Mengeneinheit?,
    val preisstaffeln: List<Preisstaffel>
)
