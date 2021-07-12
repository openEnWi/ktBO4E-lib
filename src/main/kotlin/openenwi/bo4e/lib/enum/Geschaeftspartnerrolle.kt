package openenwi.bo4e.lib.enum

/**
 * Diese Rollen kann ein Geschäftspartner einnehmen.
 *
 * veröffentlicht am 17. Januar 2018
 */
enum class Geschaeftspartnerrolle(val beschreibung: String) {
    LIEFERANT("Lieferant"),
    DIENSTLEISTER("Dienstleister"),
    KUNDE("Kunde"),
    INTERESSENT("Interessent"),
    MARKTPARTNER("Marktpartner")
}
