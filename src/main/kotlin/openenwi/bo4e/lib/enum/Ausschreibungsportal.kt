package openenwi.bo4e.lib.enum

/**
 * Aufzählung der unterstützten Ausschreibungsportale.
 *
 * veröffentlicht am 28. Februar 2018
 */
enum class Ausschreibungsportal(val beschreibung: String) {
    ENPORTAL("enPORTAL"),
    ENERGIE_AGENTUR("EnergieAgentur.NRW"),
    BMWI("BMWI-Ausschreibungen"),
    ENERGIE_HANDELSPLATZ("energie-handelsplatz.de"),
    BUND("BUND.DE"),
    VERA_ONLINE("vera_online.de"),
    ISPEX("ispex.de"),
    ENERGIEMARKTPLATZ("energiemarktplatz.de"),
    EVERGABE("evergabe.de"),
    DTAD("dtad.de")
}