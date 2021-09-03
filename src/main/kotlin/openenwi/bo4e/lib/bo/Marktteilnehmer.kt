package openenwi.bo4e.lib.bo

import openenwi.bo4e.lib.enum.BOTyp
import openenwi.bo4e.lib.enum.Marktrolle
import openenwi.bo4e.lib.enum.Rollencodetyp

/**
 * Objekt zur Kommunikation von Marktteilnehmern jeglicher Art.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [BO Marktteilnehmer](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-marktteilnehmer)
 */
data class Marktteilnehmer(
    val marktrolle: Marktrolle,
    val rollencodenummer: String,
    val rollencodetyp: Rollencodetyp,
    val makoadresse: String
) : Geschaeftsobjekt(1, BOTyp.MARKTTEILNEHMER)
