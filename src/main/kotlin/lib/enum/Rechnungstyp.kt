package de.progresslab.bo4e.lib.enum

/**
 * Abbildung verschiedener Rechnungstypen zur Kennzeichnung von Rechnungen
 * 
 * veröffentlicht am 06. Juni 2018
 */
enum class Rechnungstyp(val beschreibung: String) {
    ENDKUNDENRECHNUNG("Eine Rechnung vom Lieferanten an einen Endkunden über die Lieferung von Energie."),	
    NETZNUTZUNGSRECHNUNG(
        "Eine Rechnung vom Netzbetreiber an den Netznutzer. (i.d.R. der Lieferant) über die Netznutzung."
    ),
    MEHRMINDERMENGENRECHNUNG(
        "Eine Rechnung vom Netzbetreiber an den Netznutzer. (i.d.R. der Lieferant) " +
                "zur Abrechnung von Mengen-Differenzen zwischen Bilanzierung und Messung."
    ),
    MESSSTELLENBETRIEBSRECHNUNG("Rechnung eines Messstellenbetreibers an den Messkunden."),	
    BESCHAFFUNGSRECHNUNG("Rechnungen zwischen einem Händler und Einkäufer von Energie."),	
    AUSGLEICHSENERGIERECHNUNG("Rechnung an den Verursacher von Ausgleichsenergie."),	
}
