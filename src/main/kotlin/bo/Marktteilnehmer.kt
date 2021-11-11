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

    override val marktrolle: Marktrolle,
    override val rollencodenummer: String,
    override val rollencodetyp: Rollencodetyp,
    override val makoadresse: String,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.MARKTTEILNEHMER,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Marktteilnehmer
