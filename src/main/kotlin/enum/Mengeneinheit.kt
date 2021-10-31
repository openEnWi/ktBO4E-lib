package de.openenwi.bo4e.lib.enum

/**
 * Einheit: Messgrößen, die per Messung oder Vorgabe ermittelt werden können.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [ENUM Mengeneinheit](https://www.bo4e.de/dokumentation/enumerations/enum-mengeneinheit)
 */
enum class Mengeneinheit(val beschreibung: String) {
    W("Watt"),
    WH("Wattstunde"),
    KW("Kilowatt"),
    KWH("Kilowattstunde"),
    KVARH("Kilovarstunde"),
    MW("Megawatt"),
    MWH("Megawattstunde"),
    STUECK("Stückzahl"),
    KUBIKMETER("Kubikmeter (Gas)"),
    STUNDE("Stunde"),
    TAG("Tage"),
    MONAT("Monat"),
    JAHR("Jahr"),
    PROZENT("Prozent")
}
