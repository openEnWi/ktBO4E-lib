package de.openenwi.bo4e.lib.enum

/**
 * Auflistung der Typen von Endkunden. Daraus kann das Verbrauchsprofil abgeleitet werden.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [ENUM Kundentyp](https://www.bo4e.de/dokumentation/enumerations/enum-kundentyp)
 */
enum class Kundentyp(val beschreibung: String) {
    GEWERBE("Gewerbekunden"),
    PRIVAT("Privatkunden"),
    LANDWIRT("Landwirte"),
    SONSTIGE("Sonstige Endkunden"),
    HAUSHALT("Haushaltskunden"),
    DIREKTHEIZUNG("Direktheizungen"),
    GEMEINSCHAFT_MFH("Gemeinschaftseinrichtungen von MFH"),
    KIRCHE("Kirchen und caritative Einrichtungen"),
    KWK("KWK-Anlagen"),
    LADESAEULE("Ladesäulen"),
    BELEUCHTUNG_OEFFENTLICH("Öffentliche Beleuchtungen"),
    BELEUCHTUNG_STRASSE("Straßenbeleuchtungen"),
    SPEICHERHEIZUNG("Speicherheizungen"),
    UNTERBR_EINRICHTUNG("Unterbrechbare Verbrauchseinrichtungen"),
    WAERMEPUMPE("Wärmepumpen")
}
