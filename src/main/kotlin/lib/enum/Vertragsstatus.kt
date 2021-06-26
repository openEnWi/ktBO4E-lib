package de.progresslab.bo4e.lib.enum

/**
 * Abbildung einer Statusinformation für Verträge.
 *
 * veröffentlicht am 05. September 2018
 */
enum class Vertragsstatus(val beschreibung: String) {
    IN_ARBEIT("in Arbeit"),
    UEBERMITTELT("übermittelt"),
    ANGENOMMEN("angenommen"),
    AKTIV("aktiv"),
    ABGELEHNT("abgelehnt"),
    WIDERRUFEN("widerrufen"),
    STORNIERT("storniert"),
    GEKUENDIGT("gekündigt"),
    BEENDET("beendet"),
}
