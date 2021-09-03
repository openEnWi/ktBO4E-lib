package openenwi.bo4e.lib.bo

import openenwi.bo4e.lib.com.Adresse
import openenwi.bo4e.lib.com.Rufnummer
import openenwi.bo4e.lib.com.Zustaendigkeit
import openenwi.bo4e.lib.enum.Anrede
import openenwi.bo4e.lib.enum.BOTyp
import openenwi.bo4e.lib.enum.Titel

/**
 * Modellierung eines Ansprechpartners für einen bestimmten Geschäftspartner.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [BO Ansprechpartner](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-ansprechpartner)
 */
data class Ansprechpartner(
    val anrede: Anrede?,
    val individuelleAnrede: String?,
    val titel: Titel?,
    val vorname: String?,
    val nachname: String,
    val eMailAdresse: String?,
    val kommentar: String?,
    val geschaeftspartner: Geschaeftspartner,
    val adresse: Adresse?,
    val rufnummer: Rufnummer?,
    val zustaendigkeit: Zustaendigkeit?
): Geschaeftsobjekt(boTyp = BOTyp.ANSPRECHPARTNER)