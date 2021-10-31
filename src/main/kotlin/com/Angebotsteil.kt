package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.bo.Marktlokation

/**
 * Mit dieser Komponente wird ein Teil einer Angebotsvariante abgebildet.
 *
 * Hier werden alle Angebotspositionen aggregiert. Angebotsteile werden im einfachsten Fall für eine Marktlokation oder
 * Lieferstellenadresse erzeugt. Hier werden die Mengen und Gesamtkosten aller Angebotspositionen zusammengefasst.
 * Eine Variante besteht mindestens aus einem Angebotsteil.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [COM Angebotsteil](https://www.bo4e.de/dokumentation/komponenten/com-angebotsteil)
 */
data class Angebotsteil(
    val anfrageSubreferenz: String?,
    val lieferstellenangebotsteil: Set<Marktlokation>,
    val gesamtmengeangebotsteil: Menge?,
    val gesamtkostenangebotsteil: Betrag?,
    val positionen: List<Angebotsposition>
)
