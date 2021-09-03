package openenwi.bo4e.lib.enum

/**
 * Statusinformation für Preise
 *
 * veröffentlicht am 14. November 2018
 *
 * @see [ENUM Preisstatus](https://www.bo4e.de/dokumentation/enumerations/enum-preisstatus)
 */
enum class Preisstatus(val beschreibung: String) {
    VORLAEUFIG("vorläufig"),
    ENDGUELTIG("endgültig")
}
