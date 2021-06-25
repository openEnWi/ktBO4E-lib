package de.progresslab.bo4e.lib.enum

/**
 * Gibt den Status eines Angebotes an.
 *
 * veröffentlicht am 17. Januar 2018
 */
enum class Angebotsstatus(val beschreibung: String) {
    KONZEPTION("Konzeption"),
    UNVERBINDLICH("unverbindlich"),
    VERBINDLICH("verbindlich"),
    BEAUFTRAGT("beauftragt"),
    UNGUELTIG("ungültig"),
    ABGELEHNT("abgelehnt"),
    NACHGEFASST("nachgefasst"),
    AUSSTEHEND("ausstehend"),
    ERLEDIGT("erledigt")
}