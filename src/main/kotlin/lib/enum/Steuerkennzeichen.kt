package de.progresslab.bo4e.lib.enum

/**
 * Zur Kennzeichnung verschiedener Steuersätze und Verfahren.
 *
 * veröffentlicht am 06. Juni 2018
 */
enum class Steuerkennzeichen(val beschreibung: String) {
    UST_0("Keine Umsatzsteuer, bzw. nicht steuerbar."),
    UST_19 ("Umsatzsteuer 19%"),
    UST_7("Umsatzsteuer 7%"),
    VST_0("Keine Vorsteuer, bzw. nicht steuerbar."),
    VST_19("Vorsteuer 19%"),
    VST_7("Vorsteuer 7%"),
    RCV("Reverse Charge Verfahren (Umkehrung der Steuerpflicht)"),
}
