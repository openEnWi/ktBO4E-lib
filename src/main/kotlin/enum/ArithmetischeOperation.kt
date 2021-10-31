package de.openenwi.bo4e.lib.enum

/**
 * Mit dieser Aufzählung können arithmetische Operationen festgelegt werden.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [ENUM ArithmetischeOperation](https://www.bo4e.de/dokumentation/enumerations/enum-arithmetischeoperation)
 */
enum class ArithmetischeOperation(val beschreibung: String) {
    ADDITION("Es wird addiert"),
    SUBTRAKTION("Es wird subtrahiert"),
    MULTIPLIKATION("Es wird multipliziert"),
    DIVISION("Es wird dividiert")
}
