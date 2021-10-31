package de.openenwi.bo4e.lib.enum

/**
 * Abbildung verschiedener Zustände, die im Rahmen der Rechnungsbearbeitung durchlaufen werden.
 *
 * veröffentlicht am 06. Juni 2018
 *
 * @see [ENUM Rechnungsstatus](https://www.bo4e.de/dokumentation/enumerations/enum-rechnungsstatus)
 */
enum class Rechnungsstatus(val beschreibung: String) {
    UNGEPRUEFT("Eine Rechnung vom Lieferanten an einen Endkunden über die Lieferung von Energie."),
    GEPRUEFT_OK("Eine Rechnung vom Netzbetreiber an den Netznutzer. (i.d.R. der Lieferant) über die Netznutzung."),
    GEPRUEFT_FEHLERHAFT(
        "Eine Rechnung vom Netzbetreiber an den Netznutzer (i.d.R. der Lieferant) zur Abrechnung " +
                "von Mengen-Differenzen zwischen Bilanzierung und Messung."
    ),
    GEBUCHT("Rechnung eines Messstellenbetreibers an den Messkunden."),
    BEZAHLT("Rechnungen zwischen einem Händler und Einkäufer von Energie."),
}
