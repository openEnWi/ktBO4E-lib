package openenwi.bo4e.lib.com

import java.time.LocalDate

/**
 * Diese Komponente wird zur Übertagung der Details zu einer Kostenposition verwendet.
 *
 * veröffentlicht am 11. April 2018
 *
 * @see [COM Kostenposition](https://www.bo4e.de/dokumentation/komponenten/com-kostenposition)
 */
data class Kostenposition(
    val positionstitel: String,
    val von: LocalDate?,
    val bis: LocalDate?,
    val artikelbezeichnung: String,
    val artikeldetail: String?,
    val menge: Menge?,
    val zeitmenge: Menge?,
    val einzelpreis: Preis,
    val betragKostenposition: Betrag
)
