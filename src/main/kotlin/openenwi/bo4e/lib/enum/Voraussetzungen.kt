package openenwi.bo4e.lib.enum

/**
 * Voraussetzungen, die erfüllt sein müssen, damit dieser Tarif zur Anwendung kommen kann.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [ENUM Voraussetzungen](https://www.bo4e.de/dokumentation/enumerations/enum-voraussetzungen)
 */
enum class Voraussetzungen(val beschreibung: String) {
    EINZUGSERMAECHTIGUNG("Einzugsermaechtigung"), // 3
    ZEITPUNKT("Vertrag muss zu einem bestimmten Zeitpunkt noch bestehen"), // 3
    LIEFERANBINDUNG_EINE("Lieferantenbindung für diese Energieart"), // 3
    LIEFERANBINDUNG_ALLE("Lieferantenbindung für alle Energiearten, die der Versorger anbietet"), // 3
    GEWERBE("Gewerbenachweis"), // 3
    LASTPROFIL("Kunde muss einem bestimmten Lastprofil zuzuordnen sein"), // 3
    ZAEHLERTYP_GROESSE("bestimmter Zaehlertyp oder Zaehlergroeße"), // 3
    AUSSCHLUSS_GROSSVERBRAUCHER("Ausschluss von Großverbrauchern wie Industriekunden oder produzierendes Gewerbe"), // 3
    NEUKUNDE("Neukunden ohne bisherige Lieferanbindung"), // 3
    BESTIMMTE_VERTRAGSFORMALITAETEN("bestimmte Vertragsformalitaeten wie z.B. Anmeldeformular muss an bestimmte Adresse versandt werden"), // 3
    SELBSTABLESUNG("Selbstablesung durch den Kunden"), // 3
    ONLINEVORAUSSETZUNG("Onlinevoraussetzung"), // 3
    MINDESTUMSATZ("Mindestumsatz in einer bestimmten Zeiteinheit wie z.B. Mindestjahresumsatz 2500 EURO"), // 3
    ZUSATZPRODUKT("Zusatzprodukt zu bereits bestehendem Lieferverhaeltnis beim Versorger in dieser Energieart"), // 3
    NEUKUNDE_MIT_VORAUSSETZUNGEN("geworbener Neukunde muss bestimmte Voraussetzungen erfüllen"), // 3
    DIREKTVERTRIEB("Kunde wird durch Direktvertrieb gewonnen"), // 3
    ANSCHLUSSART("Anlage mit bestimmter Anschlussart wie z.B. Festanschluss"), // 3
    ANSCHLUSSWERT("bestimmte Anschlusswerte wie z. B. mindestens 30 kW"), // 3
    ALTER_KUNDENANLAGE("Alter einer Kundenanlage (z.B. Anlage wurde nach dem 01.01.2005 installiert)"), // 3
    ANLAGEBESCHAFFENHEIT("bestimmte Anlagebeschaffenheit, wie bivalente Energieversorgung, Geräte o.ä."), // 3
    BETRIEBSSTUNDENBEGRENZUNG("Betriebsstundenbegrenzung z.B. max 1500h/a oder mindestens 1000h/a"), // 3
    FREIGABEZEITEN("vorgeschriebene Freigabezeiten"), // 3
    FAMILIENSTRUKTUR("Familienstruktur wie z.B. bestimmte Anzahl Kinder oder Personen im Haushalt oder Eheleute"), // 3
    MITGLIEDSCHAFT("Mitgliedschaft in bestimmten Vereinen oder Verbaenden"), // 3
    STAATLICHE_FOERDERUNG("staatliche Foerderung wie z.B. Sozialtarif oder Studentenausweis"), // 3
    BESONDERE_VERBRAUCHSSTELLE("besondere Verbrauchsstellen wie Kirchen, Vereinsgebaeude usw."), // 3
    NIEDRIGENERGIE("Niedrigenergieaustattung des Hauses"), // 3
    ORTSTEILE_LIEFERGEBIET("nur für bestimmte Ortsteile in diesem Liefergebiet"), // 3
    WAERMEBEDARF_ERDGAS("Waermebedarf wird nur oder überwiegend mit Erdgas gedeckt"), // 2
    MAX_ZAEHLER_LIEFERSTELLEN("beschraenkt auf max. Anzahl Zaehler oder Abnahmestellen"), // 3
    LIEFERUNGSBESCHRAENKUNG_GASART("Lieferungsbeschraenkung auf bestimmte Gasart, wie H-Gas oder L-Gas"), // 2
    KOMBI_BONI("Kombination von Boni, von denen mindestens einer sehr unwahrscheinlich zu erreichen ist"), // 3
    ALTVERTRAG("nur für Altvertraege, die weiterhin gueltig sind"), // 3
    VORGESCHRIEBENE_ZUSATZANLAGE("vorgeschriebene Zusatzanlage wie z.B. Solaranlage etc."), // 2
    MEHRERE_ZAEHLER_ABNAHMESTELLEN("mehr als 1 Zaehler oder 1 Abnahmestelle"), // 3
    BESTIMMTER_ABNAHMEFALL("bestimmter Abnahmefall wie z.B. nur Gemeinschaftsheizungen o.ae."), // 2
    ZUSATZMODALITAET("Zahlungsmodalitaet wie z.B. halbjaehrliche Zahlungsweise"), // 3
    NACHWEIS_ZAHLUNGSFAEHIGKEIT("Nachweis der Zahlungsfaehigkeit wie z.B. Bonitaetsprüfung"), // 3
    UMSTELLUNG_ENERGIEART("Umstellung der Energieart"), // 3
}
