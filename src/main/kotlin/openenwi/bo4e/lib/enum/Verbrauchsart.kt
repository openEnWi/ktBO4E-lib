package openenwi.bo4e.lib.enum

/**
 * Verbrauchsart einer Marktlokation.
 *
 * veröffentlicht am 17. Januar 2018
 */
enum class Verbrauchsart(val beschreibung: String) {
    KL("Kraft/Licht"),
    KLW("Kraft/Licht/Wärme"),
    KLWS("Kraft/Licht/Wärme/Speicherheizung"),
    W("Wärme"),
    WS("Wärme/Speicherheizung"),
}
