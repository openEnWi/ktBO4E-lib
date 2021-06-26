package de.progresslab.bo4e.lib.enum

/**
 * Aufzählung der Möglichkeiten für die Vergabe von Preisgarantien
 *
 * veröffentlicht am 30. Mai 2018
 */
enum class Preisgarantietyp(val beschreibung: String) {
    ALLE_PREISBESTANDTEILE_BRUTTO("Der Versorger gewährt eine Preisgarantie auf alle Preisbestandteile"),
    ALLE_PREISBESTANDTEILE_NETTO("Der Versorger gewährt eine Preisgarantie auf alle Preisbestandteile ohne die Umsatzsteuer"),
    PREISBESTANDTEILE_OHNE_ABGABEN("Der Versorger gewährt eine Preisgarantie auf alle Preisbestandteile ohne Abgaben (Energiesteuern, Umlagen, Abgaben)"),
    NUR_ENERGIEPREIS("Der Versorger garantiert ausschließlich den Energiepreis")
}
