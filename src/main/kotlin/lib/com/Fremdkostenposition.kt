package de.progresslab.bo4e.lib.com

import java.time.LocalDate

/**
 * Eine Kostenposition im Bereich der Fremdkosten
 *
 * veröffentlicht am 03. Juli 2019
 *
 * @see "https://www.bo4e.de/dokumentation/komponenten/com-fremdkostenposition"
 */
data class Fremdkostenposition(
    val positionstitel: String,
    val von: LocalDate,
    val bis: LocalDate,
    val artikelbezeichnung: String,
    val artikeldetail: String?,
    val menge: Menge?,
    val zeitmenge: Menge?,
    val einzelpreis: Preis,
    val betragKostenposition: Betrag,
    val marktpartnername: String?,
    val marktpartnercode: String?,
    val gebietcodeEIC: String?,
    val linkPreisblatt: String?
)
