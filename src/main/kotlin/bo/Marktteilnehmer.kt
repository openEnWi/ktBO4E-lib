package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.bo.Geschaeftsobjekt.Companion.typ
import de.openenwi.bo4e.lib.enum.BOTyp.MARKTTEILNEHMER
import de.openenwi.bo4e.lib.enum.Marktrolle
import de.openenwi.bo4e.lib.enum.Rollencodetyp

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
    val makoadresse: String,
    val geschaeftsobjekt: Geschaeftsobjekt = typ(MARKTTEILNEHMER)
) : Geschaeftsobjekt by geschaeftsobjekt
