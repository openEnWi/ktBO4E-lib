package openenwi.bo4e.lib.enum

import openenwi.bo4e.lib.enum.Sparte.STROM
import openenwi.bo4e.lib.enum.Sparte.GAS

/**
 * Auflistung möglicher Netzebenen innerhalb der Energiearten Strom und Gas.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [ENUM Netzebene](https://www.bo4e.de/dokumentation/enumerations/enum-netzebene)
 */
enum class Netzebene(val beschreibung: String, val sparte: Sparte) {
    NSP("Niederspannung", STROM),
    MSP("Mittelspannung", STROM),
    HSP("Hochspannung", STROM),
    HSS("Hoechstspannung", STROM),
    MSP_NSP_UMSP("MS/NS Umspannung", STROM),
    HSP_MSP_UMSP("HS/MS Umspannung", STROM),
    HSS_HSP_UMSP("HOES/HS Umspannung", STROM),
    HD("Hochdruck", GAS),
    MD("Mitteldruck", GAS),
    ND("Niederdruck", GAS),
}
