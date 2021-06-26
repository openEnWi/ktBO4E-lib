package de.progresslab.bo4e.lib.enum

/**
 * Mit diesen Kriterien können regionale Bereiche definiert werden.
 *
 * veröffentlicht am 30. Mai 2018
 */
enum class Tarifregionskriterium(val beschreibung: String) {
    NETZ_NUMMER("Netznummer"),
    POSTLEITZAHL("Postleitzahl"),
    ORT("Ort"),
    GRUNDVERSORGER_NUMMER("Nummer des Grundversorgers"),
}
