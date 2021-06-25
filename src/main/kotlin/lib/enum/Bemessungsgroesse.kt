package de.progresslab.bo4e.lib.enum

/**
 * Zur Abbildung von Messgrössen und zur Verwendung in energiewirtschaftlichen Berechnungen.
 *
 * veröffentlicht am 11. April 2018
 */
enum class Bemessungsgroesse(val beschreibung: String) {
    WIRKARBEIT_EL("elektrische Wirkarbeit"),
    LEISTUNG_EL("elektrische Leistung"),
    BLINDARBEIT_KAP("Blindarbeit kapazitiv"),
    BLINDARBEIT_IND("Blindarbeit induktiv"),
    BLINDLEISTUNG_KAP("Blindleistung kapazitiv"),
    BLINDLEISTUNG_IND("Blindleistung induktiv"),
    WIRKARBEIT_TH("thermische Wirkarbeit"),
    LEISTUNG_TH("thermische Leistung"),
    VOLUMEN("Volumen"),
    VOLUMENSTROM("Volumenstrom (Volumen/Zeit)"),
    BENUTZUNGSDAUER("Benutzungsdauer (Arbeit/Leistung)"),
    ANZAHL("Darstellung einer Stückzahl")
}