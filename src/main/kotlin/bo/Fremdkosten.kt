package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Betrag
import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Fremdkostenblock
import de.openenwi.bo4e.lib.com.Zeitraum
import de.openenwi.bo4e.lib.enum.BOTyp

/**
 * Mit diesem BO werden die Fremdkosten, beispielsweise für eine Angebotserstellung
 * oder eine Rechnungsprüfung, übertragen.
 * Die Fremdkosten enthalten dabei alle Kostenblöcke, die von anderen Marktteilnehmern oder Instanzen erhoben werden.
 *
 * veröffentlicht am 03. Juli 2019
 *
 * @see [BO Fremdkosten](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-fremdkosten)
 */
interface Fremdkosten : Geschaeftsobjekt {
    val gueltigkeit: Zeitraum
    val summeKosten: Betrag?
    val kostenbloecke: List<Fremdkostenblock>
}

data class FremdkostenImpl(
    override val gueltigkeit: Zeitraum,
    override val summeKosten: Betrag? = null,
    override val kostenbloecke: List<Fremdkostenblock> = emptyList(),

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.FREMDKOSTEN,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Fremdkosten
