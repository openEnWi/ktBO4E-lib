package openenwi.bo4e.lib.enum

/**
 * Aufzählung der Labels für Öko-Strom von verschiedenen Herausgebern.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [ENUM Oekolabel](https://www.bo4e.de/dokumentation/enumerations/enum-oekolabel)
 */
enum class Oekolabel(val beschreibung: String) {
    ENERGREEN("energreen"),
    GASGREEN_GRUENER_STROM("energreen (durch Gruener Strom Label)"),
    GASGREEN("gasgreen"),   
    GRUENER_STROM_GOLD("Gruener Strom Label Gold"),
    GRUENER_STROM_SILBER("Gruener Strom Label Silber"),
    GRUENER_STROM("Gruener Strom Label"),
    GRUENES_GAS("Gruenes Gas Label"),
    NATURWATT_STROM("NaturWatt Strom"),
    OK_POWER("ok-Power"),
    RENEWABLE_PLUS("RenewablePLUS"),
    WATERGREEN("Watergreen"),
    WATERGREEN_PLUS("Watergreen+"),
}
