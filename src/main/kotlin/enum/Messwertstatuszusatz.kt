package de.openenwi.bo4e.lib.enum

/**
 * Aufzählung von zusätzlichen Informationen zum Status, beispielsweise in Lastgängen oder Zählwerkständen.
 *
 * veröffentlicht am 07. Oktober 2020
 *
 * @see [ENUM Messwertstatuszusatz](https://www.bo4e.de/dokumentation/enumerations/enum-messwertstatuszusatz)
 */
enum class Messwertstatuszusatz(val beschreibung: String) {
    Z84_LEERSTAND("Leerstand"),
    Z85_REALERZAEHLERUEBERLAUFGEPRUEFT("Realer Zaehlerüberlauf geprueft"),
    Z86_PLAUSIBELWGKONTROLLABLESUNG("Plausibel wg. Kontrollablesung"),
    Z87_PLAUSIBELWGKUNDENHINWEIS("Plausibel wg. Kundenhinweis"),
    ZC3_AUSTAUSCHDESERSATZWERTES("Austausch des Ersatzwertes"),
    Z88_VERGLEICHSMESSUNG_GEEICHT("Vergleichsmessung (geeicht)"), // Abweichung von BO4E
    Z89_VERGLEICHSMESSUNG_NICHTGEEICHT("Vergleichsmessung (nicht geeicht)"), // Abweichung von BO4E
    Z90_MESSWERTNACHBILDUNGAUSGEEICHTENWERTEN("Messwertnachbildung aus geeichten Werten"),
    Z91_MESSWERTNACHBILDUNGAUSNICHTGEEICHTENWERTEN("Messwertnachbildung aus nicht geeichten Werten"),
    Z92_INTERPOLATION("Interpolation"),
    Z93_HALTEWERT("Haltewert"),
    Z94_BILANZIERUNGNETZABSCHNITT("Bilanzierung Netzabschnitt"),
    Z95_HISTORISCHEMESSWERTE("Historische Messwerte"),
    ZJ2_STATISTISCHEMETHODE("Statistische Methode"),
    Z74_KEINZUGANG("kein Zugang"),
    Z75_KOMMUNIKATIONSSTOERUNG("Kommunikationsstörung"),
    Z76_NETZAUSFALL("Netzausfall"),
    Z77_SPANNUNGSAUSFALL("Spannungsausfall"),
    Z78_GERAETEWECHSEL("Gerätewechsel"),
    Z79_KALIBRIERUNG("Kalibrierung"),
    Z80_GERAETARBEITETAUSSERHALBDERBETRIEBSBEDINGUNGEN("Gerät arbeitet ausserhalb der Betriebsbedingungen"),
    Z81_MESSEINRICHTUNGGESTOERT_DEFEKT("Messeinrichtung gestört/defekt"),
    Z82_UNSICHERHEITMESSUNG("Unsicherheit Messung"),
    Z98_BERUECKSICHTIGUNGSTOERMENGENZAEHLWERK("Berücksichtigung Störmengenzählwerk"),
    Z99_MENGENUMWERTUNGUNVOLLSTAENDIG("Mengenumwertung unvollständig"),
    ZA0_UHRZEITGESTELLT_SYNCHRONISATION("Uhrzeit gestellt /Synchronisation"),
    ZA1_MESSWERTUNPLAUSIBEL("Messwert unplausibel"),
    ZC2_TARIFSCHALTGERAETDEFEKT("Tarifschaltgeraet defekt"),
    ZC4_IMPULSWERTIGKEITNICHTAUSREICHEND("Impulswertigkeit nicht ausreichend"),
    ZA3_FALSCHERWANDLERFAKTOR("Falscher Wandlerfaktor"),
    ZA4_FEHLERHAFTEABLESUNG("Fehlerhafte Ablesung"),
    ZA5_AENDERUNGDERBERECHNUNG("Änderung der Berechnung"),
    ZA6_UMBAUDERMESSLOKATION("Umbau der Messlokation"),	
    ZA7_DATENBEARBEITUNGSFEHLER("Datenbearbeitungsfehler"),
    ZA8_BRENNWERTKORREKTUR("Brennwertkorrektur"),
    ZA9_Z_ZAHL_KORREKTUR("Z-Zahl-Korrektur"), // Abweichung von BO4E
    ZB0_STOERUNG_DEFEKTMESSEINRICHTUNG("Störung / Defekt Messeinrichtung"),
    ZB9_AENDERUNGTARIFSCHALTZEITEN("Änderung Tarifschaltzeiten"),
    ZG3_UMSTELLUNGGASQUALITAET("Umstellung Gasqualität"),
}
