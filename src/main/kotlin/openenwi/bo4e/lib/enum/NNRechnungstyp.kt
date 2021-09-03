package openenwi.bo4e.lib.enum

/**
 * Abbildung verschiedener in der INVOIC angegebenen Rechnungstypen.
 *
 * veröffentlicht am 06. Juni 2018
 *
 * @see [ENUM NNRechnungstyp](https://www.bo4e.de/dokumentation/enumerations/enum-nnrechnungstyp)
 */
enum class NNRechnungstyp(val beschreibung: String) {
    ABSCHLUSSRECHNUNG("Abschlussrechnung"),
    ABSCHLAGSRECHNUNG("Abschlagsrechnung"),
    TURNUSRECHNUNG("Turnusrechnung"),
    MONATSRECHNUNG("Monatsrechnung"),
    WIMRECHNUNG("Rechnung für WiM"),
    ZWISCHENRECHNUNG("Zwischenrechnung"),
    INTEGRIERTE_13TE_RECHNUNG("Integrierte 13. Rechnung"),
    ZUSAETZLICHE_13TE_RECHNUNG("13. Rechnung"),
    MEHRMINDERMENGENRECHNUNG("Mehr/Mindermengenabrechnung"),
}
