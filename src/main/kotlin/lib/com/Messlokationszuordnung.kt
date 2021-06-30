package de.progresslab.bo4e.lib.com

import de.progresslab.bo4e.lib.enum.ArithmetischeOperation
import java.time.ZonedDateTime

/**
 * Mit dieser Komponente werden Messlokationen zu Marktlokationen zugeordnet.
 *
 * Dabei kann eine arithmetische Operation (Addition, Subtraktion) angegeben werden,
 * mit der die Messlokation zum Verbrauch der Marklokation beiträgt.
 *
 * veröffentlicht am 17. Januar 2018
 */
data class Messlokationszuordnung(
    val messlokationsId: String,
    val arithmetik: ArithmetischeOperation,
    val gueltigSeit: ZonedDateTime?,
    val gueltigBis: ZonedDateTime?
)