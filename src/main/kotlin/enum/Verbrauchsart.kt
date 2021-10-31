package de.openenwi.bo4e.lib.enum

/**
 * Verbrauchsart einer Marktlokation.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [ENUM Verbrauchsart](https://www.bo4e.de/dokumentation/enumerations/enum-verbrauchsart)
 */
enum class Verbrauchsart(val beschreibung: String) {
    KL("Kraft/Licht"),
    KLW("Kraft/Licht/Wärme"),
    KLWS("Kraft/Licht/Wärme/Speicherheizung"),
    W("Wärme"),
    WS("Wärme/Speicherheizung"),
}
