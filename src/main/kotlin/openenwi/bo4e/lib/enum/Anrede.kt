package openenwi.bo4e.lib.enum

/**
 * Übersicht möglicher Anreden, z.B. eines Geschäftspartners.
 *
 * veröffentlicht am 17. Januar 2018
 */
enum class Anrede(val beschreibung: String) {
    HERR("Herr"),
    FRAU("Frau"),
    EHELEUTE("Eheleute"),
    FIRMA("Firma"),
    INDIVIDUELL("Individuell festgelegt")
}
