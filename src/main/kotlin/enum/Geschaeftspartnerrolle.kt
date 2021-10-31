package de.openenwi.bo4e.lib.enum

/**
 * Diese Rollen kann ein Geschäftspartner einnehmen.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [ENUM Geschaeftspartnerrolle](https://www.bo4e.de/dokumentation/enumerations/enum-geschaftspartnerrolle)
 */
enum class Geschaeftspartnerrolle(val beschreibung: String) {
    LIEFERANT("Lieferant"),
    DIENSTLEISTER("Dienstleister"),
    KUNDE("Kunde"),
    INTERESSENT("Interessent"),
    MARKTPARTNER("Marktpartner")
}
