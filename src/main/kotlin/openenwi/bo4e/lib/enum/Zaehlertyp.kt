package openenwi.bo4e.lib.enum

/**
 * Bei diesem Enum handelt es sich die Abbildung von Zählertypen der Sparten Strom und Gas.
 *
 * Version 1.2
 * veröffentlicht am 31. Mai 2021
 */
enum class Zaehlertyp(val beschreibung: String) {
    DREHSTROMZAEHLER("Drehstromzähler"),
    BALGENGASZAEHLER("Balgengaszähler"),
    DREHKOLBENZAEHLER("Drehkolbengaszähler"),
    SMARTMETER("Smart Meter Zähler"),
    LEISTUNGSZAEHLER("leistungsmessender Zähler"),
    MAXIMUMZAEHLER("Maximumzähler"),
    TURBINENRADGASZAEHLER("Turbinenradgaszähler"),
    ULTRASCHALLGASZAEHLER("Ultraschallgaszähler"),
    WECHSELSTROMZAEHLER("Wechselstromzähler"),
    BALGENGASZAEHLER_EDL_21("Balgengaszähler EDL 21"),
    BALGENGASZAEHLER_EDL_40("Balgengaszähler EDL 40"),
}
