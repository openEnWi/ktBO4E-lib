package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.ArithmetischeOperation
import java.time.ZonedDateTime

/**
 * Mit dieser Komponente werden Messlokationen zu Marktlokationen zugeordnet.
 *
 * Dabei kann eine arithmetische Operation (Addition, Subtraktion) angegeben werden,
 * mit der die Messlokation zum Verbrauch der Marklokation beiträgt.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [COM Messlokationszuordnung](https://www.bo4e.de/dokumentation/komponenten/com-messlokationszuordnung)
 */
data class Messlokationszuordnung(
    val messlokationsId: String,
    val arithmetik: ArithmetischeOperation,
    val gueltigSeit: ZonedDateTime?,
    val gueltigBis: ZonedDateTime?
)
