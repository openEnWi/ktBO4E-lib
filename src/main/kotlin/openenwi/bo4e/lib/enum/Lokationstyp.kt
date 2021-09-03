package openenwi.bo4e.lib.enum

/**
 * Gibt an, ob es sich um eine Markt- oder Messlokation handelt.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [ENUM Lokationstyp](https://www.bo4e.de/dokumentation/enumerations/enum-lokationstyp)
 */
enum class Lokationstyp(val beschreibung: String) {
    MaLo("Marktlokation"),
    MeLo("Messlokation")
}
