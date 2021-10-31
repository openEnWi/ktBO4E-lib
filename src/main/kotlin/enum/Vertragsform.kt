package de.openenwi.bo4e.lib.enum

/**
 * Aufzählung der Möglichkeiten zu Vertragsformen in Ausschreibungen.
 *
 * veröffentlicht am 28. Februar 2018
 *
 * @see [ENUM Vertragsform](https://www.bo4e.de/dokumentation/enumerations/enum-vertragsform)
 */
enum class Vertragsform(val beschreibung: String) {
    ONLINE("Online"),
    DIREKT("Direkt"),
    FAX("Auftragsfax"),
}
