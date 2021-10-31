package de.openenwi.bo4e.lib.enum

/**
 * Aufzählung der Möglichkeiten zur Rechnungslegung in Ausschreibungen.
 *
 * veröffentlicht am 28. Februar 2018
 *
 * @see [ENUM Rechnungslegung](https://www.bo4e.de/dokumentation/enumerations/enum-rechnungslegung)
 */
enum class Rechnungslegung(val beschreibung: String) {
    MONATSRECHN("monatsscharfe Rechnung"),
    ABSCHL_MONATSRECHN("Abschlag mit Monatsrechnung"),
    ABSCHL_JAHRESRECHN("Abschlag mit Jahresrechnung"),
    MONATSRECHN_JAHRESRECHN("Monatsrechnung mit Jahresrechnung"),
    VORKASSE("Vorkasse"),
}
