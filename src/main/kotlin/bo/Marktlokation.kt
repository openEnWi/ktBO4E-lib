package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.bo.Geschaeftsobjekt.Companion.typ
import de.openenwi.bo4e.lib.com.Adresse
import de.openenwi.bo4e.lib.com.Geokoordinaten
import de.openenwi.bo4e.lib.com.Katasteradresse
import de.openenwi.bo4e.lib.com.Messlokationszuordnung
import de.openenwi.bo4e.lib.enum.*
import de.openenwi.bo4e.lib.enum.BOTyp.MARKTLOKATION

/**
 * Objekt zur Aufnahme der Informationen zu einer Marktlokation
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [BO Marktlokation](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-marktlokation)
 */
data class Marktlokation(
    val marktlokationsId: String,
    val sparte: Sparte,
    val energierichtung: Energierichtung,
    val bilanzierungsmethode: Bilanzierungsmethode,
    val verbrauchsart: Verbrauchsart?,
    val unterbrechbar: Boolean?,
    val netzebene: Netzebene,
    val netzbetreibercodenr: String?,
    val gebiettyp: Gebiettyp?,
    val netzgebietnr: String?,
    val bilanzierungsgebiet: String?,
    val grundversorgercodenr: String?,
    val gasqualitaet: Gasqualitaet?,
    val endkunde: Geschaeftspartner?,
    val lokationsadresse: Adresse?,
    val geoadresse: Geokoordinaten?,
    val katasterinformation: Katasteradresse?,
    val zugehoerigeMesslokationen: Set<Messlokationszuordnung>,
    val geschaeftsobjekt: Geschaeftsobjekt = typ(MARKTLOKATION)
) : Geschaeftsobjekt by geschaeftsobjekt
