package openenwi.bo4e.lib.enum

/**
 * Zur Kennzeichnung verschiedener Tarifzeiten, beispielsweise zur Bepreisung oder zur Verbrauchsermittlung.
 *
 * veröffentlicht am 11. April 2018
 */
enum class Tarifzeit(val beschreibung: String) {
    TZ_STANDARD("Tarifzeit Standard für Eintarif-Konfigurationen"),
    TZ_HT("Tarifzeit für Hochtarif bei Mehrtarif-Konfigurationen"),
    TZ_NT("Tarifzeit für Niedrigtarif bei Mehrtarif-Konfigurationen"),
}
