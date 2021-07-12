package openenwi.bo4e.lib.enum

/**
 * Die Tarifart wird verwendet zur Charakterisierung von Zählern und daraus resultierenden Tarifen.
 *
 * veröffentlicht am 17. Januar 2018
 */
enum class Tarifart(val beschreibung: String) {
    EINTARIF("Eintarif"),
    ZWEITARIF("Zweitarif"),
    MEHRTARIF("Mehrtarif"),
    SMART_METER("Smart Meter Tarif"),
    LEISTUNGSGEMESSEN("Leistungsgemessener Tarif"),
}
