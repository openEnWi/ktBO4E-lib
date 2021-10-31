package de.openenwi.bo4e.lib.enum

/**
 * Gibt an, ob es sich um eine Prognose oder eine Messung handelt, beispielsweise bei der Abbildung eines Verbrauchs.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [ENUM Wertermittlungsverfahren](https://www.bo4e.de/dokumentation/enumerations/enum-mengenverwendung)
 */
enum class Wertermittlungsverfahren(val beschreibung: String) {
    PROGNOSE("Prognose"),
    MESSUNG("Messung"),
}
