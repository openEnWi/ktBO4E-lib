package openenwi.bo4e.lib.enum

/**
 * Auflistung der möglichen Gebietstypen.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [ENUM Gebiettyp](https://www.bo4e.de/dokumentation/enumerations/enum-gebiettyp)
 */
enum class Gebiettyp(val beschreibung: String) {
    REGELZONE("Regelzone"),
    MARKTGEBIET("Marktgebiet"),
    BILANZIERUNGSGEBIET("Bilanzierungsgebiet"),
    VERTEILNETZ("Verteilnetz"),
    TRANSPORTNETZ("Transportnetz"),
    REGIONALNETZ("Regionalnetz"),
    AREALNETZ("Arealnetz"),
    GRUNDVERSORGUNGSGEBIET("Grundversorgungsgebiet"),
    VERSORGUNGSGEBIET("Versorgungsgebiet")
}
