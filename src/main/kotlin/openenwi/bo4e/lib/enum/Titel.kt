package openenwi.bo4e.lib.enum

/**
 * Übersicht möglicher Titel, z.B. eines Geschäftspartners.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [ENUM Titel](https://www.bo4e.de/dokumentation/enumerations/enum-titel)
 */
enum class Titel(val beschreibung: String) {
    DR("Doktor"),
    PROF("Professor"),
    PROF_DR("Professor Dr.") // Abweichung von BO4E
}
