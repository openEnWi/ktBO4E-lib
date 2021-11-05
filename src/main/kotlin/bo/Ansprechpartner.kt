package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Adresse
import de.openenwi.bo4e.lib.com.Rufnummer
import de.openenwi.bo4e.lib.com.Zustaendigkeit
import de.openenwi.bo4e.lib.enum.Anrede
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Titel

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
    val zustaendigkeit: Zustaendigkeit?,
    val geschaeftsobjekt: Geschaeftsobjekt = Geschaeftsobjekt.typ(BOTyp.ANSPRECHPARTNER)
) : Geschaeftsobjekt by geschaeftsobjekt
