package de.progresslab.bo4e.lib.enum

/**
 * Gibt an, ob es sich um einen Einrichtungs- oder Zweirichtungszähler handelt.
 *
 * veröffentlicht am 17. Januar 2018
 */
enum class Zaehlerauspraegung(val beschreibung: String) {
    EINRICHTUNGSZAEHLER("Einrichtungszaehler"),
    ZWEIRICHTUNGSZAEHLER("Zweirichtungszaehler"),
}
