package openenwi.bo4e.lib.enum

/**
 * Auflistung möglicher Einheiten zur Verwendung in zeitbezogenen Angaben.
 *
 * veröffentlicht am 28. Februar 2018
 */
enum class Zeiteinheit(val beschreibung: String) {
    SEKUNDE("Sekunde"),
    MINUTE("Minute"),
    STUNDE("Stunde"),
    VIERTEL_STUNDE("Viertelstunde"),
    TAG("Tag"),
    WOCHE("Woche"),
    MONAT("Monat"),
    QUARTAL("Quartal"),
    HALBJAHR("Halbjahr"),
    JAHR("Jahr"),
}
