package openenwi.bo4e.lib.enum

/**
 * Der Preis, auf den sich ein Auf- oder Abschlag bezieht.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [ENUM AufAbschlagsziel](https://www.bo4e.de/dokumentation/enumerations/enum-aufabschlagsziel)
 */
enum class AufAbschlagsziel(val beschreibung: String) {
    ARBEITSPREIS_EINTARIF("Auf/Abschlag auf den Arbeitspreis Eintarif"),
    ARBEITSPREIS_HT("ARBEITSPREIS_HT Auf/Abschlag auf den Arbeitspreis HT"),
    ARBEITSPREIS_NT("Auf/Abschlag auf den Arbeitspreis NT"),
    ARBEITSPREIS_HT_NT("Auf/Abschlag auf den Arbeitspreis HT und NT"),
    GRUNDPREIS("Auf/Abschlag auf den Grundpreis"),
    GESAMTPREIS("Auf/Abschlag auf den Gesamtpreis")
}
