package openenwi.bo4e.lib.enum

/**
 * veröffentlicht am 11. April 2018
 *
 * @see [ENUM BDEWArtikelnummer](https://www.bo4e.de/dokumentation/enumerations/enum-bdewartikelnummer)
 */
enum class BDEWArtikelnummer(val bdewArtikelnummer: String, val beschreibung: String) {
    LEISTUNG("9990001000053", "Leistung"),
    LEISTUNG_PAUSCHAL("9990001000079", "Leistung pauschal"),
    GRUNDPREIS("9990001000087", "Grundpreis"),
    REGELENERGIE_ARBEIT("9990001000128", "Regelenergie Arbeit"),
    REGELENERGIE_LEISTUNG("9990001000136", "Regelenergie Leistung"),
    NOTSTROMLIEFERUNG_ARBEIT("9990001000144", "Notstromlieferung Arbeit"),
    NOTSTROMLIEFERUNG_LEISTUNG("9990001000152", "Notstromlieferung Leistung"),
    RESERVENETZKAPAZITAET("9990001000160", "Reservenetzkapazität"),
    RESERVELEISTUNG("9990001000178", "Reserveleistung"),
    ZUSAETZLICHE_ABLESUNG("9990001000186", "Zusätzliche Ablesung"),
    PRUEFGEBUEHREN_AUSSERPLANMAESSIG("9990001000219", "Prüfgebühren (außerplanmäßig)"),
    WIRKARBEIT("9990001000269", "Wirkarbeit"),
    SINGULAER_GENUTZTE_BETRIEBSMITTEL(
        "9990001000285",
        "singulär genutzte Betriebsmittel (z. B. Trafomiete, Leitungen)"
    ),
    ABGABE_KWKG("9990001000334", "Abgabe KWKG"),
    ABSCHLAG("9990001000376", "Abschlag"),
    KONZESSIONSABGABE("9990001000417", "Konzessionsabgabe"),
    ENTGELT_FERNAUSLESUNG("9990001000433", "Entgelt für Fernauslesung"),
    UNTERMESSUNG("9990001000475", "Untermessung"),
    BLINDMEHRARBEIT("9990001000508", "Blindmehrarbeit"),
    ENTGELT_ABRECHNUNG("9990001000532", "Entgelt für Abrechnung"),
    SPERRKOSTEN("9990001000540", "Sperrkosten"),
    ENTSPERRKOSTEN("9990001000558", "Entsperrkosten"),
    MAHNKOSTEN("9990001000566", "Mahnkosten"),
    MEHR_MINDERMENGEN("9990001000574", "Mehr- und Mindermenge"),
    INKASSOKOSTEN("9990001000582", "Inkassokosten"),
    BLINDMEHRLEISTUNG("9990001000590", "Blindmehrleistung"),
    ENTGELT_MESSUNG_ABLESUNG("9990001000615", "Entgelt für Messung und Ablesung"),
    ENTGELT_EINBAU_BETRIEB_WARTUNG_MESSTECHNIK(
        "9990001000623",
        "Entgelt für Einbau, Betrieb und Wartung der Messtechnik"
    ),
    AUSGLEICHSENERGIE("9990001000631", "Ausgleichsenergie"),
    ZAEHLEINRICHTUNG("9990001000649", "Zähleinrichtung"),
    WANDLER_MENGENUMWERTER("9990001000657", "Wandler/Mengenumwerter"),
    KOMMUNIKATIONSEINRICHTUNG("9990001000665", "Kommunikationseinrichtung"),
    TECHNISCHE_STEUEREINRICHTUNG("9990001000673", "Technische Steuereinrichtung"),
    PARAGRAF_19_STROM_NEV_UMLAGE("9990001000681", "§ 19 StromNEV Umlage"),
    BEFESTIGUNGSEINRICHTUNG("9990001000699", "Befestigungseinrichtung (z. B. Zählertafel)"),
    OFFSHORE_HAFTUNGSUMLAGE("9990001000706", "Offshore-Haftungsumlage"),
    FIXE_ARBEITSENTGELTKOMPONENTE("9990001000714", "Fixe Arbeitsentgeltkomponente"),
    FIXE_LEISTUNGSENTGELTKOMPONENTE("9990001000722", "Fixe Leistungsentgeltkomponente"),
    UMLAGE_ABSCHALTBARE_LASTEN("9990001000730", "Umlage abschaltbare Lasten"),
    MEHRMENGE("9990001000748", "Mehrmenge"),
    MINDERMENGE("9990001000756", "Mindermenge"),
    ENERGIESTEUER("9990001000764", "Energiesteuer"),
    SMARTMETER_GATEWAY("9990001000772", "Smartmeter-Gateway"),
    STEUERBOX("9990001000780", "Steuerbox"),
    MSB_INKL_MESSUNG("9990001000798", "Messtellenbetrieb inklusive Messung"),
    AUSGLEICHSENERGIE_UNTERDECKUNG("9990001000805", "AusgleichsenergieUnterdeckung")
}
