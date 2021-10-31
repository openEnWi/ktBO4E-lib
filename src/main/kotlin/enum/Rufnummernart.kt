package de.openenwi.bo4e.lib.enum

/**
 * Abbildung verschiedener Rufnummerntypen.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [ENUM Rufnummernart](https://www.bo4e.de/dokumentation/enumerations/enum-rufnummernart)
 */
enum class Rufnummernart(val beschreibung: String) {
    RUF_ZENTRALE("Rufnummer Zentrale"),
    FAX_ZENTRALE("Faxnummer Zentrale"),
    SAMMELRUF("Sammelrufnummer"),
    SAMMELFAX("Sammelfaxnummer"),
    ABTEILUNGRUF("Rufnummer Abteilung"),
    ABTEILUNGFAX("Faxnummer Abteilung"),
    RUF_DURCHWAHL("Rufnummer Durchwahl"),
    FAX_DURCHWAHL("Faxnummer Durchwahl"),
    MOBIL_NUMMER("Nummer des mobilen Telefons"),
}
