package de.openenwi.bo4e.lib.com

/**
 * Komponente zur Abbildung eines Kostenblocks in den Fremdkosten
 *
 * veröffentlicht am 03. Juli 2019
 *
 * @see [COM Fremdkostenblock](https://www.bo4e.de/dokumentation/komponenten/com-fremdkostenblock)
 */
data class Fremdkostenblock(
    val kostenblockbezeichnung: String,
    val summeKostenblock: Betrag?,
    val kostenpositionen: List<Fremdkostenposition>
)
