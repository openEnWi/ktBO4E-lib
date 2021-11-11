package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Adresse
import de.openenwi.bo4e.lib.com.Dienstleistung
import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Geokoordinaten
import de.openenwi.bo4e.lib.com.Hardware
import de.openenwi.bo4e.lib.com.Katasteradresse
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Netzebene
import de.openenwi.bo4e.lib.enum.Sparte

/**
 * Objekt zur Aufnahme der Informationen zu einer Messlokation.
 *
 * Version 1.1
 * veröffentlicht am 01. Oktober 2021
 *
 * @see [BO Messlokation](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-messlokation/1-10-2021)
 */
interface Messlokation : Geschaeftsobjekt {
    val messlokationsId: String
    val sparte: Sparte
    val netzebeneMessung: Netzebene?
    val messgebietnr: String?
    val grundzustaendigerMSBCodenr: String?
    val grundzustaendigerMSBIMCodenr: String?
    val messlokationszaehler: Set<Zaehler>
    val messadresse: Adresse?
    val geoadresse: Geokoordinaten?
    val katasterinformation: Katasteradresse?
    val geraete: Set<Hardware>
    val messdienstleistung: Set<Dienstleistung>
}

data class MesslokationImpl(
    override val messlokationsId: String,
    override val sparte: Sparte,
    override val netzebeneMessung: Netzebene?,
    override val messgebietnr: String?,
    override val grundzustaendigerMSBCodenr: String?,
    override val grundzustaendigerMSBIMCodenr: String?,
    override val messlokationszaehler: Set<Zaehler>,
    override val messadresse: Adresse?,
    override val geoadresse: Geokoordinaten?,
    override val katasterinformation: Katasteradresse?,
    override val geraete: Set<Hardware>,
    override val messdienstleistung: Set<Dienstleistung>,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.MESSLOKATION,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Messlokation
