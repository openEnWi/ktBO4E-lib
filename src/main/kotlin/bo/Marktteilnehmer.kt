package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Adresse
import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.enum.Anrede
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Geschaeftspartnerrolle
import de.openenwi.bo4e.lib.enum.Kontaktart
import de.openenwi.bo4e.lib.enum.Marktrolle
import de.openenwi.bo4e.lib.enum.Rollencodetyp

/**
 * Objekt zur Kommunikation von Marktteilnehmern jeglicher Art.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [BO Marktteilnehmer](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-marktteilnehmer)
 */
interface Marktteilnehmer : Geschaeftspartner {
    val marktrolle: Marktrolle
    val rollencodenummer: String
    val rollencodetyp: Rollencodetyp
    val makoadresse: String
}

data class MarktteilnehmerImpl(
    override val marktrolle: Marktrolle,
    override val rollencodenummer: String,
    override val rollencodetyp: Rollencodetyp,
    override val makoadresse: String,
    private val geschaeftspartner: Geschaeftspartner,
) : Geschaeftspartner by geschaeftspartner, Marktteilnehmer {
    constructor(
        versionstruktur: Int,
        boTyp: BOTyp,
        externeReferenzen: Set<ExterneReferenz>,

        anrede: Anrede?,
        name1: String,
        name2: String?,
        name3: String?,
        gewerbekennzeichnung: Boolean,
        hrnummer: String?,
        amtsgericht: String?,
        kontaktweg: List<Kontaktart>,
        umsatzsteuerId: String?,
        glaeubigerId: String?,
        eMailAdresse: String?,
        website: String?,
        geschaeftspartnerrolle: Set<Geschaeftspartnerrolle>,
        partneradresse: Adresse,

        marktrolle: Marktrolle,
        rollencodenummer: String,
        rollencodetyp: Rollencodetyp,
        makoadresse: String,
    ) : this(
        marktrolle, rollencodenummer, rollencodetyp, makoadresse,
        GeschaeftspartnerImpl(
            versionstruktur,
            boTyp,
            externeReferenzen,

            anrede,
            name1,
            name2,
            name3,
            gewerbekennzeichnung,
            hrnummer,
            amtsgericht,
            kontaktweg,
            umsatzsteuerId,
            glaeubigerId,
            eMailAdresse,
            website,
            geschaeftspartnerrolle,
            partneradresse,
        )
    )
}
