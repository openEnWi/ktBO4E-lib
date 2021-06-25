package de.progresslab.bo4e.lib.enum

/**
 * Aufzählung für die Typisierung von Ausschreibungen.
 *
 * veröffentlicht am 28. Februar 2018
 */
enum class Ausschreibungstyp(val beschreibung: String) {
    PRIVATRECHTLICH("privat-rechtlich"),
    OEFFENTLICHRECHTLICH("öffentlich-rechtlich"),
    EUROPAWEIT("europaweit")
}