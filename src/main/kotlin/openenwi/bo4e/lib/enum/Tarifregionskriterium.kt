package openenwi.bo4e.lib.enum

/**
 * Mit diesen Kriterien können regionale Bereiche definiert werden.
 *
 * Version 1.1
 * veröffentlicht am 01. Oktober 2021
 *
 * @see [ENUM Tarifregionskriterium](https://www.bo4e.de/dokumentation/enumerations/enum-tarifregionskriterium)
 */
enum class Tarifregionskriterium(val beschreibung: String) {
    NETZ_NUMMER("Netznummer"),
    POSTLEITZAHL("Postleitzahl"),
    ORT("Ort"),
    GRUNDVERSORGER_NUMMER("Nummer des Grundversorgers"),
    REGION("Referenz auf ein BO Region (URL)")
}
