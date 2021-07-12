package openenwi.bo4e.lib.enum

/**
 * Abbildung verschiedener in der INVOIC angegebenen Rechnungsarten.
 *
 * veröffentlicht am 06. Juni 2018
 */
enum class NNRechnungsart(val beschreibung: String) {
    HANDELSRECHNUNG("Handelsrechnung"),
    SELBSTAUSGESTELLT("Selbst ausgestellte Rechnung, z.B. für Einspeiserechnungen.")
}
