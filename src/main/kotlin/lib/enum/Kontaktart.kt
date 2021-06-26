package de.progresslab.bo4e.lib.enum

/**
 * Art des Kontaktes zwischen Geschäftspartnern.
 *
 * veröffentlicht am 17. Januar 2018
 */
enum class Kontaktart(val beschreibung: String) {
    ANSCHREIBEN("Anschreiben"),
    TELEFONAT("Telefonat"),
    FAX("Fax"),
    E_MAIL("E-Mail"),
    SMS("SMS")
}
