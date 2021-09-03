package openenwi.bo4e.lib.enum

/**
 * Auflistung der Erzeugungsarten von Energie.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [ENUM Erzeugungsart](https://www.bo4e.de/dokumentation/enumerations/enum-erzeugungsart/enum-erzeugungsart-1)
 */
enum class Erzeugungsart(val beschreibung: String) {
    FOSSIL("Fossile Brennstoffe"),
    KWK("Kraft-Waerme-Koppelung"),
    WIND("Windkraft"),
    SOLAR("Solarenergie"),
    KERNKRAFT("Kernkraft"),
    WASSER("Wasserkraft"),
    GEOTHERMIE("Geothermie"),
    BIOMASSE("Biomasse"),
    KOHLE("Kohle"),
    GAS("Erdgas"),
    SONSTIGE("Sonstige"),
    SONSTIGE_EEG("Sonstige nach EEG")
}
