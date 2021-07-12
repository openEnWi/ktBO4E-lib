package openenwi.bo4e.lib.bo

import openenwi.bo4e.lib.enum.BOTyp
import openenwi.bo4e.lib.enum.Marktrolle
import openenwi.bo4e.lib.enum.Rollencodetyp

data class Marktteilnehmer(
    val marktrolle: Marktrolle,
    val rollencodenummer: String,
    val rollencodetyp: Rollencodetyp,
    val makoadresse: String
) : Geschaeftsobjekt(1, BOTyp.MARKTTEILNEHMER)
