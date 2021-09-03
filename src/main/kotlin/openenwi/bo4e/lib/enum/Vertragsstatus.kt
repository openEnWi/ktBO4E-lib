package openenwi.bo4e.lib.enum

/**
 * Abbildung einer Statusinformation für Verträge.
 *
 * veröffentlicht am 05. September 2018
 *
 * @see [ENUM Vertragsstatus](https://www.bo4e.de/dokumentation/enumerations/enum-vertragsstatus)
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
