package openenwi.bo4e.lib.enum

/**
 * Angabe, wie eine Menge in Bezug auf einen Wert zu bilden ist.
 *
 * veröffentlicht am 22. August 2018
 *
 * @see [ENUM Mengenoperator](https://www.bo4e.de/dokumentation/enumerations/enum-mengenoperator)
 */
enum class Mengenoperator(val beschreibung: String) {
    KLEINER_ALS("Alle Objekte mit einem Wert kleiner als der Bezugswert"),
    GROESSER_ALS("Alle Objekte mit einem Wert größer als der Bezugswert"),
    GLEICH("Alle Objekte mit gleichem Wert")
}
