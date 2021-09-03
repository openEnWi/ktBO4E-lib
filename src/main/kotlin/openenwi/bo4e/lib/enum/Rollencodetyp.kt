package openenwi.bo4e.lib.enum

/**
 * Gibt den Codetyp einer Rolle, beispielsweise einer Marktrolle, an.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [ENUM Rollencodetyp](https://www.bo4e.de/dokumentation/enumerations/enum-rollencodetyp)
 */
enum class Rollencodetyp(val beschreibung: String) {
    BDEW("Bundesverband der Energie- u. Wasserwirtschaft"),
    DVGW("Deutscher Verein des Gas- und Wasserfaches"),
    GLN("Global Location Number")
}
