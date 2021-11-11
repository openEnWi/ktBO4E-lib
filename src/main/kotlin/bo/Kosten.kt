package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Betrag
import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Kostenblock
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Kostenklasse

/**
 * Dieses BO wird zur Übertagung von hierarchischen Kostenstrukturen verwendet.
 * Die Kosten werden dabei in Kostenblöcke und diese wiederum in Kostenpositionen strukturiert
 *
 * veröffentlicht am 28. Februar 2018
 *
 * @see [BO Kosten](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-kosten)
 */
interface Kosten : Geschaeftsobjekt {
    val kostenklasse: Kostenklasse
    val gueltigkeit: Zeitraum
    val summeKosten: Betrag?
    val kostenbloecke: List<Kostenblock>
}

data class KostenImpl(
    override val kostenklasse: Kostenklasse,
    override val gueltigkeit: Zeitraum,
    override val summeKosten: Betrag?,
    override val kostenbloecke: List<Kostenblock>,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.KOSTEN,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Kosten
