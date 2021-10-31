package de.openenwi.bo4e.lib.enum

/**
 * Leistungstyp
 *
 * Version 1.1
 * veröffentlicht am 31. Mai 2021
 *
 * @see [ENUM Leistungstyp](https://www.bo4e.de/dokumentation/enumerations/enum-leistungstyp/31-05-2021)
 */
enum class Leistungstyp(val beschreibung: String) {
    ARBEITSPREIS_WIRKARBEIT("Arbeitspreis zur Abrechnung der Wirkarbeit"),
    LEISTUNGSPREIS_WIRKLEISTUNG("Leistungspreis zur Abrechnung der Wirkleistung"),
    ARBEITSPREIS_BLINDARBEIT_IND("Arbeitspreis zur Abrechnung der Blindarbeit induktiv"),
    ARBEITSPREIS_BLINDARBEIT_KAP("Arbeitspreis zur Abrechnung der Blindarbeit kapazitiv"),
    GRUNDPREIS("Grundpreis (pro Zeiteinheit)"),
    GRUNDPREIS_ARBEIT("Grundpreis, der auf die Arbeit berechnet wird (bei RLM)"),
    GRUNDPREIS_LEISTUNG("Grundpreis, der auf die Leistung berechnet wird (bei RLM)"),
    MEHRMINDERMENGE("Mehr- oder Mindermenge"),
    MESSSTELLENBETRIEB("Preis pro Zeiteinheit"),
    MESSDIENSTLEISTUNG("Preis pro Zeiteinheit"),
    MESSDIENSTLEISTUNG_INKL_MESSUNG("MDL inklusive der Messung (ab 2017), Preis pro Zeiteinheit"),
    ABRECHNUNG("Preis pro Zeiteinheit"),
    KONZESSIONS_ABGABE("Konzessionsabgabe"),
    KWK_UMLAGE("KWK-Umlage"),
    OFFSHORE_UMLAGE("Offshore-Haftungsumlage"),
    ABLAV_UMLAGE("Umlage für abschaltbare Lasten"),
    SONDERKUNDEN_UMLAGE("§19 StromNEV Umlage"),
    REGELENERGIE_UMLAGE("Regelenergieumlage"),
    BILANZIERUNG_UMLAGE("Bilanzierungsumlage"),
    AUSLESUNG_ZUSAETZLICH("Zusätzliche Auslesung (pro Vorgang)"),
    ABLESUNG_ZUSAETZLICH("Zusätzliche Ablesung (pro Vorgang)"),
    ABRECHNUNG_ZUSAETZLICH("Zusätzliche Abresung (pro Vorgang)"),
    SPERRUNG("Sperrung einer Abnahmestelle"),
    ENTSPERRUNG("Entsperrung einer Abnahmestelle"),
    MAHNKOSTEN("Mahnkosten"),
    INKASSOKOSTEN("Inkassokosten"),
    EEG_UMLAGE("EEG-Umlage"),
    ENERGIESTEUER("Strom- oder Erdgassteuer"),
    NETZPREIS("Netzpreis"),
    MESSPREIS("Messpreis"),
    SONSTIGER_PREIS("Sonstiger_Preis")
}
