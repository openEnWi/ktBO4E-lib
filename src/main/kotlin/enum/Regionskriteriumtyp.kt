package de.openenwi.bo4e.lib.enum

/**
 * Klassifizierung der Kriterien für eine regionale Eingrenzung.
 *
 * Version 1.1
 * veröffentlicht am 27. September 2021
 *
 * @see [ENUM Regionskriteriumtyp](https://www.bo4e.de/dokumentation/enumerations/enum-regionskriteriumtyp/27-9-2021)
 */
enum class Regionskriteriumtyp(val beschreibung: String) {
    BUNDESLANDKENNZIFFER("offizielle Bundeslandkennziffer"),
    BUNDESLAND_NAME("Bundesland Name"),
    MARKTGEBIET_NUMMER("offizielle Marktgebiet-Codenummer"),
    MARKTGEBIET_NAME("Marktgebiet Name"),
    REGELGEBIET_NUMMER("offizielle Regelgebiet Nummer"),
    REGELGEBIET_NAME("Regelgebiet Name"),
    NETZ_STROM("Identifikation des Netzes Strom"),
    NETZ_GAS("Identifikation des Netzes Gas"),
    NETZBETREIBER_NUMMER_STROM("offizielle Netzbetreiber-Codenummer Strom"),
    NETZBETREIBER_NUMMER_GAS("offizielle Netzbetreiber-Codenummer Gas"),
    NETZBETREIBER_NAME_STROM("Netzbetreiber Name Strom"),
    NETZBETREIBER_NAME_GAS("Netzbetreiber Name Gas"),
    BILANZIERUNGS_GEBIET_NUMMER("Strom: Bilanzierungsgebietsnummer, Gas: Netzkontonummer"),
    MSB_NUMMER("offizielle Messstellenbetreiber-Codenummer"),
    MSB_NAME("Name des MSB"),
    VERSORGER_NUMMER("offizielle Lieferanten-Codenummer eines Versorgers"),
    VERSORGER_NAME("Name eines Versorgers"),
    GRUNDVERSORGER_NUMMER_STROM("offizielle Lieferanten-Codenummer des Strom-Grundversorgers"),
    GRUNDVERSORGER_NAME_STROM("Name des Strom-Grundversorgers"),
    GRUNDVERSORGER_NUMMER_GAS("offizielle Lieferanten-Codenummer des Gas-Grundversorgers"),
    GRUNDVERSORGER_NAME_GAS("Name des Gas-Grundversorgers"),
    KREIS_NAME("Kreis"),
    KREISKENNZIFFER("offizielle Kreiskennziffer"),
    GEMEINDE_NAME("Gemeinde"),
    GEMEINDEKENNZIFFER("offizielle Gemeindekennziffer"),
    POSTLEITZAHL("Postleitzahl"),
    ORT("Ort"),
    POSTORT("Kriterium bestehend aus Postleitzahl und Ort"),
    EINWOHNERZAHL_GEMEINDE("Einwohnerzahl Gemeinde"),
    EINWOHNERZAHL_ORT("Einwohnerzahl Ort"),
    KM_UMKREIS("km Umkreis"),
    BUNDESWEIT("Bundesweite Betrachtung"),
    PLZ_BEREICH("Postleitzahlenbereich"),
}
