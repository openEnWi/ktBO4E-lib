package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Adresse
import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.enum.Anrede
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Geschaeftspartnerrolle
import de.openenwi.bo4e.lib.enum.Kontaktart

/**
 * Mit diesem Objekt können Geschäftspartner übertragen werden.
 *
 * Sowohl Unternehmen, als auch Privatpersonen können Geschäftspartner sein.
 *
 * Hinweis: Marktteilnehmer haben ein eigenes BO, welches sich von diesem BO ableitet.
 * Hier sollte daher keine Zuordnung zu Marktrollen erfolgen.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [BO Geschaeftspartner](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-geschaftspartner)
 */
interface Geschaeftspartner : Geschaeftsobjekt {
    val anrede: Anrede?
    val name1: String
    val name2: String?
    val name3: String?
    val gewerbekennzeichnung: Boolean
    val hrnummer: String?
    val amtsgericht: String?
    val kontaktweg: List<Kontaktart>
    val umsatzsteuerId: String?
    val glaeubigerId: String?
    val eMailAdresse: String?
    val website: String?
    val geschaeftspartnerrolle: Set<Geschaeftspartnerrolle>
    val partneradresse: Adresse
}

data class GeschaeftspartnerImpl(
    override val anrede: Anrede? = null,
    override val name1: String,
    override val name2: String? = null,
    override val name3: String? = null,
    override val gewerbekennzeichnung: Boolean = false,
    override val hrnummer: String? = null,
    override val amtsgericht: String? = null,
    override val kontaktweg: List<Kontaktart> = emptyList(),
    override val umsatzsteuerId: String? = null,
    override val glaeubigerId: String? = null,
    override val eMailAdresse: String? = null,
    override val website: String? = null,
    override val geschaeftspartnerrolle: Set<Geschaeftspartnerrolle> = emptySet(),
    override val partneradresse: Adresse,
    private val geschaeftsobjekt: Geschaeftsobjekt,
) : Geschaeftsobjekt by geschaeftsobjekt, Geschaeftspartner {
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
    ) : this(
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
        GeschaeftsobjektImpl(versionstruktur, boTyp, externeReferenzen))

    constructor(
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
        externeReferenzen: Set<ExterneReferenz> = emptySet(),
    ) : this(
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
        GeschaeftsobjektImpl(1, BOTyp.GESCHAEFTSPARTNER, externeReferenzen))
}
