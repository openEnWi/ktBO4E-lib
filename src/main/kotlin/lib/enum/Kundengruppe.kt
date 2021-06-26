package de.progresslab.bo4e.lib.enum

import de.progresslab.bo4e.lib.enum.Sparte.GAS
import de.progresslab.bo4e.lib.enum.Sparte.STROM

/**
 * Kundengruppe für eine Marktlokation (orientiert sich an den Standard-Lastprofilen).
 *
 * veröffentlicht am 11. April 2018
 */
enum class Kundengruppe(val beschreibung: String, val sparten: Set<Sparte>) {
    RLM("Kunde mit registrierender Leistungsmessung (kein SLP)", setOf(STROM, GAS)),
    RLM_KOMMUNAL("Kommunale Abnahmestelle leistungsgemessen", setOf(STROM, GAS)),
    SLP_KOMMUNAL("Kommunale Abnahmestelle nicht leistungsgemessen", setOf(STROM, GAS)),
    SLP_S_G0("Gewerbe allgemein", setOf(STROM)),
    SLP_S_G1("Werktags", setOf(STROM)),
    SLP_S_G2("Verbrauch in Abendstunden", setOf(STROM)),
    SLP_S_G3("Gewerbe durchlaufend", setOf(STROM)),
    SLP_S_G4("Laden, Friseur", setOf(STROM)),
    SLP_S_G5("Bäckerei mit Backstube", setOf(STROM)),
    SLP_S_G6("Wochenendbetrieb", setOf(STROM)),
    SLP_S_G7("Mobilfunksendestation", setOf(STROM)),
    SLP_S_L0("Landwirtschaft allgemein", setOf(STROM)),
    SLP_S_L1("Landwirtschaft mit Milchwirtschaft/Nebenerwerbs-Tierzucht", setOf(STROM)),
    SLP_S_L2("Übrige Landwirtschaftsbetriebe", setOf(STROM)),
    SLP_S_H0("Haushalt allgemein", setOf(STROM)),
    SLP_S_SB("Straßenbeleuchtung", setOf(STROM)),
    SLP_S_HZ("Nachtspeicherheizung", setOf(STROM)),
    SLP_S_WP("Wärmepumpe", setOf(STROM)),
    SLP_S_EM("Elektromobilität", setOf(STROM)),
    SLP_S_HZ_GEM("Nachtspeicherheizung gemeinsame Messung", setOf(STROM)),
    SLP_G_GKO("Gebietskörpersch., Kreditinst. u. Versich., Org. o. Erwerbszw. & öff. Einr.", setOf(GAS)),
    SLP_G_STANDARD("Standardkundengruppe für Gas", setOf(GAS)),
    SLP_G_GHA("Einzelhandel, Großhandel", setOf(GAS)),
    SLP_G_GMK("Metall, Kfz", setOf(GAS)),
    SLP_G_GBD("sonst. betr. Dienstleistungen", setOf(GAS)),
    SLP_G_GGA("Beherbergung", setOf(GAS)),
    SLP_G_GBH("Gaststätten", setOf(GAS)),
    SLP_G_GBA("Bäckereien", setOf(GAS)),
    SLP_G_GWA("Wäschereien", setOf(GAS)),
    SLP_G_GGB("Gartenbau", setOf(GAS)),
    SLP_G_GPD("Papier und Druck", setOf(GAS)),
    SLP_G_GMF("haushaltsähnliche Gewerbebetriebe", setOf(GAS)),
    SLP_G_HEF("Einfamilienhaushalt", setOf(GAS)),
    SLP_G_HMF("Mehrfamilienhaushalt Gas", setOf(GAS)),
    SLP_G_HKO("Kochgas", setOf(GAS))
}
