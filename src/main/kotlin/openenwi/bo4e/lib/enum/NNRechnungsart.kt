package openenwi.bo4e.lib.enum

/**
 * Abbildung verschiedener in der INVOIC angegebenen Rechnungsarten.
 *
 * veröffentlicht am 06. Juni 2018
 *
 * @see [ENUM NNRechnungsart](https://www.bo4e.de/dokumentation/enumerations/enum-nnrechnungsart)
 */
enum class NNRechnungsart(val beschreibung: String) {
    HANDELSRECHNUNG("Handelsrechnung"),
    SELBSTAUSGESTELLT("Selbst ausgestellte Rechnung, z.B. für Einspeiserechnungen.")
}
