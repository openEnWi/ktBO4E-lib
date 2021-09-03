package openenwi.bo4e.lib.com

/**
 * Mit dieser Komponente werden mehrere Kostenpositionen zusammengefasst.
 *
 * veröffentlicht am 11. April 2018
 *
 * @see [COM Kostenblock](https://www.bo4e.de/dokumentation/komponenten/com-kostenblock)
 */
data class Kostenblock(
    val kostenblockbezeichnung: String,
    val summeKostenblock: Betrag?,
    val kostenpositionen: List<Kostenposition>
)
