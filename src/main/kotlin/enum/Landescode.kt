package de.openenwi.bo4e.lib.enum

/**
 * Der ISO-Landescode.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [ENUM Landescode](https://www.bo4e.de/dokumentation/enumerations/enum-landescode)
 */
enum class Landescode(val beschreibung: String, val alpha3Code: String, val countryCode: Int) {
    AT("Austria", "AUT", Landescode.AUT_COUNTRY_CODE),
    DE("Germany", "DEU", Landescode.DEU_COUNTRY_CODE),
    CH("Switzerland", "CHE", Landescode.CHE_COUNTRY_CODE);

    companion object {
        const val AUT_COUNTRY_CODE = 40
        const val DEU_COUNTRY_CODE = 276
        const val CHE_COUNTRY_CODE = 756
    }
}
