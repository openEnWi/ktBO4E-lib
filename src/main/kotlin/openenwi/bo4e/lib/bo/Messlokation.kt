package openenwi.bo4e.lib.bo

import openenwi.bo4e.lib.com.*
import openenwi.bo4e.lib.enum.BOTyp
import openenwi.bo4e.lib.enum.Netzebene
import openenwi.bo4e.lib.enum.Sparte

/**
 * Objekt zur Aufnahme der Informationen zu einer Messlokation.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [BO Messlokation](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-messlokation)
 */
data class Messlokation(
    val geschaeftsobjekt: Geschaeftsobjekt = Geschaeftsobjekt(boTyp = BOTyp.MESSLOKATION),
    val messlokationsId: String,
    val sparte: Sparte,
    val netzebeneMessung: Netzebene?,
    val messgebietnr: String?,
    val grundzustaendigerMSBCodenr: String?,
    val grundzustaendigerMSBIMCodenr: String?,
    val grundzustaendigerMDLCodenr: String?,
    val messlokationszaehler: Set<Zaehler>,
    val messadresse: Adresse?,
    val geoadresse: Geokoordinaten?,
    val katasterinformation: Katasteradresse?,
    val geraete: Set<Hardware>,
    val messdienstleistung: Set<Dienstleistung>
)
