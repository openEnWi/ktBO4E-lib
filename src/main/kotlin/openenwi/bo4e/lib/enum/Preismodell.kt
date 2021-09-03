package openenwi.bo4e.lib.enum

/**
 * Bezeichnung der Preismodelle in Ausschreibungen für die Energielieferung.
 *
 * veröffentlicht am 28. Februar 2018
 *
 * @see [ENUM Preismodell](https://www.bo4e.de/dokumentation/enumerations/enum-preismodell)
 */
enum class Preismodell(val beschreibung: String) {
    FESTPREIS("Festpreis"),
    TRANCHE("Tranche"),
}
