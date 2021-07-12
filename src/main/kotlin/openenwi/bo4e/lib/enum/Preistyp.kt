package openenwi.bo4e.lib.enum

/**
 * Aufschlüsselung der Preistypen in Tarifen.
 *
 * veröffentlicht am 30. Mai 2018
 */
enum class Preistyp(val beschreibung: String) {
    GRUNDPREIS("Grundpreis"),
    ARBEITSPREIS_EINTARIF("Arbeitspreis_ET"),
    ARBEITSPREIS_HT("Arbeitspreis_HT"),
    ARBEITSPREIS_NT("Arbeitspreis_NT"),
    LEISTUNGSPREIS("Leistungspreis"),
    MESSPREIS("Messpreis"),
    ENTGELT_ABLESUNG("Entgelt fuer Ablesung"),
    ENTGELT_ABRECHNUNG("Entgelt fuer Abrechnung"),
    ENTGELT_MSB("Entgelt für MSB (Entgelt für Einbau, Betrieb und Wartung der Messtechnik)"),
    PROVISION("Provision"),
}
