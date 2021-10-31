package de.openenwi.bo4e.lib.enum

/**
 * Aufzählung für die Typisierung von Ausschreibungen.
 *
 * veröffentlicht am 28. Februar 2018
 *
 * @see [ENUM Ausschreibungstyp](https://www.bo4e.de/dokumentation/enumerations/enum-ausschreibungstyp)
 */
enum class Ausschreibungstyp(val beschreibung: String) {
    PRIVATRECHTLICH("privat-rechtlich"),
    OEFFENTLICHRECHTLICH("öffentlich-rechtlich"),
    EUROPAWEIT("europaweit")
}
