package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.Gueltigkeitstyp

/**
 * Mit dieser Komponente können regionale Gültigkeiten,
 * z.B. für Tarife, Zu- und Abschläge und Preise definiert werden.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [COM RegionaleGueltigkeit](https://www.bo4e.de/dokumentation/komponenten/com-regionalegueltigkeit)
 */
data class RegionaleGueltigkeit(
    val gueltigkeitstyp: Gueltigkeitstyp,
    val kriteriumsWerte: Set<KriteriumWert>
)
