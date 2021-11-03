package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.bo.Geschaeftsobjekt.Companion.typ
import de.openenwi.bo4e.lib.com.Adresse
import de.openenwi.bo4e.lib.enum.Anrede
import de.openenwi.bo4e.lib.enum.BOTyp.GESCHAEFTSPARTNER
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
data class Geschaeftspartner(
    val anrede: Anrede? = null,
    val name1: String,
    val name2: String? = null,
    val name3: String? = null,
    val gewerbekennzeichnung: Boolean = false,
    val hrnummer: String? = null,
    val amtsgericht: String? = null,
    val kontaktweg: List<Kontaktart> = emptyList(),
    val umsatzsteuerId: String? = null,
    val glaeubigerId: String? = null,
    val eMailAdresse: String? = null,
    val website: String? = null,
    val geschaeftspartnerrolle: Set<Geschaeftspartnerrolle> = emptySet(),
    val partneradresse: Adresse,
    val geschaeftsobjekt: Geschaeftsobjekt = typ(GESCHAEFTSPARTNER)
) : Geschaeftsobjekt by geschaeftsobjekt
