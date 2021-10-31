package de.openenwi.bo4e.lib.enum

import de.openenwi.bo4e.lib.enum.Sparte.GAS
import de.openenwi.bo4e.lib.enum.Sparte.STROM

/**
 * Eine Aufzählung zur Einordnung für die Höhe der Konzessionsabgabe.
 *
 * veröffentlicht am 08. Mai 2018
 *
 * @see [ENUM KundengruppeKA](https://www.bo4e.de/dokumentation/enumerations/enum-kundengruppeka)
 */
enum class KundengruppeKA(val beschreibung: String, val sparten: Set<Sparte>) {
    S_SCHWACHLAST("Schwachlast-Kunde", setOf(STROM)),
    S_TARIF_25000("Strom Tarifkunde Gemeindegröße bis 25000 Einwohner", setOf(STROM)),
    S_TARIF_100000("Strom Tarifkunde Gemeindegröße bis 100000 Einwohner", setOf(STROM)),
    S_TARIF_500000("Strom Tarifkunde Gemeindegröße bis 500000 Einwohner", setOf(STROM)),
    S_TARIF_G_500000("Strom Tarifkunde Gemeindegröße größer 500000 Einwohner", setOf(STROM)),
    S_SONDERKUNDE("Strom Sonderkunde", setOf(STROM)),
    G_KOWA_25000("Gas Kochen und Wasser Tarifkunde Gemeindegröße bis 25000 Einwohner", setOf(GAS)),
    G_KOWA_100000("Gas Kochen und Wasser Tarifkunde Gemeindegröße bis 100000 Einwohner", setOf(GAS)),
    G_KOWA_500000("Gas Kochen und Wasser Tarifkunde Gemeindegröße bis 500000 Einwohner", setOf(GAS)),
    G_KOWA_G_500000("Gas Kochen und Wasser Tarifkunde Gemeindegröße größer 500000 Einwohner", setOf(GAS)),
    G_TARIF_25000("GasTarifkunde Gemeindegröße bis 25000 Einwohner", setOf(GAS)),
    G_TARIF_100000("GasTarifkunde Gemeindegröße bis 100000 Einwohner", setOf(GAS)),
    G_TARIF_500000("GasTarifkunde Gemeindegröße bis 500000 Einwohner", setOf(GAS)),
    G_TARIF_G_500000("GasTarifkunde Gemeindegröße größer 500000 Einwohner", setOf(GAS)),
    G_SONDERKUNDE("Gas Sonderkunde", setOf(GAS)),
    SONDER_KAS("Sonderegelung, keine Systematik der KAV", setOf(STROM, GAS)),
    SONDER_SAS("Sondervertragskunde abweichender Preis", setOf(STROM, GAS)),
    SONDER_TAS("Tarifkunden abweichender Preis", setOf(STROM, GAS)),
    SONDER_TKS("Kochen Warmwassererzeugung abweichender Preis", setOf(GAS)),
    SONDER_TSS("Strom mit Schwachlast (NT) abweichender Preis", setOf(STROM)),
}
