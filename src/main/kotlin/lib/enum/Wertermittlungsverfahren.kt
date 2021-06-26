package de.progresslab.bo4e.lib.enum

/**
 * Gibt an, ob es sich um eine Prognose oder eine Messung handelt, beispielsweise bei der Abbildung eines Verbrauchs.
 *
 * veröffentlicht am 17. Januar 2018
 */
enum class Wertermittlungsverfahren(val beschreibung: String) {
    PROGNOSE("Prognose"),
    MESSUNG("Messung"),
}
