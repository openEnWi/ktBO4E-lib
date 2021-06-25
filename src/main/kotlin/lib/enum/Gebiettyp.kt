package de.progresslab.bo4e.lib.enum

/**
 * Auflistung der möglichen Gebietstypen.
 *
 * veröffentlicht am 17. Januar 2018
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