package openenwi.bo4e.lib.bo

import openenwi.bo4e.lib.com.Adresse
import openenwi.bo4e.lib.enum.Anrede
import openenwi.bo4e.lib.enum.BOTyp
import openenwi.bo4e.lib.enum.Geschaeftspartnerrolle
import openenwi.bo4e.lib.enum.Kontaktart

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
    val anrede: Anrede?,
    val name1: String,
    val name2: String?,
    val name3: String?,
    val gewerbekennzeichnung: Boolean,
    val hrnummer: String?,
    val amtsgericht: String?,
    val kontaktweg: List<Kontaktart>,
    val umsatzsteuerId: String?,
    val glaeubigerId: String?,
    val eMailAdresse: String?,
    val website: String?,
    val geschaeftspartnerrolle: Set<Geschaeftspartnerrolle>,
    val partneradresse: Adresse
): Geschaeftsobjekt(boTyp = BOTyp.GESCHAEFTSPARTNER)
