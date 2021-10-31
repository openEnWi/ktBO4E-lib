package de.openenwi.bo4e.lib.enum

/**
 * Kostenklassen bilden die oberste Ebene der verschiedenen Kosten.
 * In der Regel werden die Gesamtkosten einer Kostenklasse in einer App berechnet.
 *
 * veröffentlicht am 28. Februar 2018
 *
 * @see [ENUM Kostenklasse](https://www.bo4e.de/dokumentation/enumerations/enum-kostenklasse)
 */
enum class Kostenklasse(val beschreibung: String) {
    FREMDKOSTEN("Fremdkosten"),
    BESCHAFFUNG("Beschaffung"),
    SELBSTKOSTEN("Selbstkosten"),
    MARGEN("Margen"),
    ENERGIEVERSORGUNGSKOSTEN("Energieversorgungskosten")
}
