package de.openenwi.bo4e.lib.enum

/**
 * Übersicht möglicher Anreden, z.B. eines Geschäftspartners.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [ENUM Anrede](https://www.bo4e.de/dokumentation/enumerations/enum-anrede)
 */
enum class Anrede(val beschreibung: String) {
    HERR("Herr"),
    FRAU("Frau"),
    EHELEUTE("Eheleute"),
    FIRMA("Firma"),
    INDIVIDUELL("Individuell festgelegt")
}
