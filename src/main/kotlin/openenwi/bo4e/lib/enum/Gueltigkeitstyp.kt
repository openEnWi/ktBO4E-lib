package openenwi.bo4e.lib.enum

/**
 * Übersicht der verschiedenen Gültigkeiten zur Umsetzung von Positiv- bzw. Negativlisten.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [ENUM Gueltigkeitstyp](https://www.bo4e.de/dokumentation/enumerations/enum-gueltigkeitstyp)
 */
enum class Gueltigkeitstyp(val beschreibung: String) {
    NUR_IN("Ein so eingeschränktes Merkmal gilt nur mit den angebenen Werten"),
    NICHT_IN("Ein so eingeschränktes Merkmal gilt nicht mit den angebenen Werten"),
    NUR_IN_KOMBINATION_MIT("Die Kriterien mit diesem Gültigkeitstyp werden miteinander kombiniert")
}
