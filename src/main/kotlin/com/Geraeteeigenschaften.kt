package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.Geraetemerkmal
import de.openenwi.bo4e.lib.enum.Geraetetyp

/**
 * Mit dieser Komponente werden die Eigenschaften eines Gerätes in Bezug auf den Typ und weitere Merkmale modelliert.
 *
 * veröffentlicht am 18. April 2018
 *
 * @see [COM Geraeteeigenschaften](https://www.bo4e.de/dokumentation/komponenten/com-geraeteeigenschaften)
 */
data class Geraeteeigenschaften(val geraetetyp: Geraetetyp, val geraetemerkmal: Geraetemerkmal)
