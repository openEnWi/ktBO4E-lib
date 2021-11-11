package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Adresse
import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.Geokoordinaten
import de.openenwi.bo4e.lib.com.Katasteradresse
import de.openenwi.bo4e.lib.com.Messlokationszuordnung
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Bilanzierungsmethode
import de.openenwi.bo4e.lib.enum.Energierichtung
import de.openenwi.bo4e.lib.enum.Gasqualitaet
import de.openenwi.bo4e.lib.enum.Gebiettyp
import de.openenwi.bo4e.lib.enum.Netzebene
import de.openenwi.bo4e.lib.enum.Sparte
import de.openenwi.bo4e.lib.enum.Verbrauchsart

/**
 * Objekt zur Aufnahme der Informationen zu einer Marktlokation
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [BO Marktlokation](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-marktlokation)
 */
interface Marktlokation : Geschaeftsobjekt {
    val marktlokationsId: String
    val sparte: Sparte
    val energierichtung: Energierichtung
    val bilanzierungsmethode: Bilanzierungsmethode
    val verbrauchsart: Verbrauchsart?
    val unterbrechbar: Boolean?
    val netzebene: Netzebene
    val netzbetreibercodenr: String?
    val gebiettyp: Gebiettyp?
    val netzgebietnr: String?
    val bilanzierungsgebiet: String?
    val grundversorgercodenr: String?
    val gasqualitaet: Gasqualitaet?
    val endkunde: Geschaeftspartner?
    val lokationsadresse: Adresse?
    val geoadresse: Geokoordinaten?
    val katasterinformation: Katasteradresse?
    val zugehoerigeMesslokationen: Set<Messlokationszuordnung>
}

data class MarktlokationImpl(
    override val marktlokationsId: String,
    override val sparte: Sparte,
    override val energierichtung: Energierichtung,
    override val bilanzierungsmethode: Bilanzierungsmethode,
    override val verbrauchsart: Verbrauchsart?,
    override val unterbrechbar: Boolean?,
    override val netzebene: Netzebene,
    override val netzbetreibercodenr: String?,
    override val gebiettyp: Gebiettyp?,
    override val netzgebietnr: String?,
    override val bilanzierungsgebiet: String?,
    override val grundversorgercodenr: String?,
    override val gasqualitaet: Gasqualitaet?,
    override val endkunde: Geschaeftspartner?,
    override val lokationsadresse: Adresse?,
    override val geoadresse: Geokoordinaten?,
    override val katasterinformation: Katasteradresse?,
    override val zugehoerigeMesslokationen: Set<Messlokationszuordnung>,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.MARKTLOKATION,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Marktlokation
