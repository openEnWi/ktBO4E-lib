package de.openenwi.bo4e.lib.enum

import de.openenwi.bo4e.lib.enum.Medium.GAS
import de.openenwi.bo4e.lib.enum.Medium.STROM

/**
 * Festlegung, welcher Typ von Messung mit einem Preis belegt wird.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [ENUM Messpreistyp](https://www.bo4e.de/dokumentation/enumerations/enum-messpreistyp)
 */
enum class Messpreistyp(val beschreibung: String, val medium: Medium) {
    MESSPREIS_G2_5("Messpreis_G2,5", GAS),
    MESSPREIS_G4("Messpreis_G4", GAS),
    MESSPREIS_G6("Messpreis_G6", GAS),
    MESSPREIS_G10("Messpreis_G10", GAS),
    MESSPREIS_G16("Messpreis_G16", GAS),
    MESSPREIS_G25("Messpreis_G25", GAS),
    MESSPREIS_G40("Messpreis_G40", GAS),
    ELEKTRONISCHER_AUFSATZ("elektronischer_Aufsatz", GAS),
    SMART_METER_MESSPREIS_G2_5("Smart_Meter_Messpreis_G2,5", GAS),
    SMART_METER_MESSPREIS_G4("Smart_Meter_Messpreis_G4", GAS),
    SMART_METER_MESSPREIS_G6("Smart_Meter_Messpreis_G6", GAS),
    SMART_METER_MESSPREIS_G10("Smart_Meter_Messpreis_G10", GAS),
    SMART_METER_MESSPREIS_G16("Smart_Meter_Messpreis_G16", GAS),
    SMART_METER_MESSPREIS_G25("Smart_Meter_Messpreis_G25", GAS),
    SMART_METER_MESSPREIS_G40("Smart_Meter_Messpreis_G40", GAS),
    VERRECHNUNGSPREIS_ET_WECHSEL("Verrechnungspreis_ET_Wechsel", STROM),
    VERRECHNUNGSPREIS_ET_DREH("Verrechnungspreis_ET_Dreh", STROM),
    VERRECHNUNGSPREIS_ZT_WECHSEL("Verrechnungspreis_ZT_Wechsel", STROM),
    VERRECHNUNGSPREIS_ZT_DREH("Verrechnungspreis_ZT_Dreh", STROM),
    VERRECHNUNGSPREIS_L_ET("Verrechnungspreis_L_ET", STROM),
    VERRECHNUNGSPREIS_L_ZT("Verrechnungspreis_L_ZT", STROM),
    VERRECHNUNGSPREIS_SM("Verrechnungspreis_SM", STROM),
    AUFSCHLAG_WANDLER("AufschlagWandler", STROM),
    AUFSCHLAG_TARIFSCHALTUNG("AufschlagTarifschaltung", STROM)
}
