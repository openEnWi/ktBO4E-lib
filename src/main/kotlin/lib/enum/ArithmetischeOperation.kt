package de.progresslab.bo4e.lib.enum

/**
 * Mit dieser Aufzählung können arithmetische Operationen festgelegt werden.
 *
 * veröffentlicht am 17. Januar 2018
 */
enum class ArithmetischeOperation(val beschreibung: String) {
    ADDITION("Es wird addiert"),
    SUBTRAKTION("Es wird subtrahiert"),
    MULTIPLIKATION("Es wird multipliziert"),
    DIVISION("Es wird dividiert")
}
