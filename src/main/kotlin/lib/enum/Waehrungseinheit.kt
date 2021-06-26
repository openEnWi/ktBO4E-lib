package de.progresslab.bo4e.lib.enum

/**
 * In diesem Enum werden die Währungen und ihre Untereinheiten definiert, beispielsweise für die Verwendung in Preisen.
 *
 * Z.B. 23 ct / kWh oder 50 EUR / Jahr
 *
 * veröffentlicht am 17. Januar 2018
 */
enum class Waehrungseinheit(val beschreibung: String) {
    EUR("Euro"),
    CT("Eurocent"),
}
