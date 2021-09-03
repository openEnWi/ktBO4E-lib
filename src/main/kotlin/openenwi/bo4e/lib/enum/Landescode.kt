package openenwi.bo4e.lib.enum

/**
 * Der ISO-Landescode.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [ENUM Landescode](https://www.bo4e.de/dokumentation/enumerations/enum-landescode)
 */
enum class Landescode(val beschreibung: String, val alpha3Code: String, val countryCode: Int) {
    AT("Austria", "AUT", 40),
    DE("Germany", "DEU", 276),
    CH("Switzerland", "CHE", 756)
}
