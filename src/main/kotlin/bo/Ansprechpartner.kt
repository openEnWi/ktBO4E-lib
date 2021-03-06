package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Adresse
import de.openenwi.bo4e.lib.com.ExterneReferenz
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
interface Ansprechpartner: Geschaeftsobjekt {
    val anrede: Anrede?
    val individuelleAnrede: String?
    val titel: Titel?
    val vorname: String?
    val nachname: String
    val eMailAdresse: String?
    val kommentar: String?
    val geschaeftspartner: Geschaeftspartner
    val adresse: Adresse?
    val rufnummer: Rufnummer?
    val zustaendigkeit: Zustaendigkeit?
}

data class AnsprechpartnerImpl(
    override val anrede: Anrede?,
    override val individuelleAnrede: String?,
    override val titel: Titel?,
    override val vorname: String?,
    override val nachname: String,
    override val eMailAdresse: String?,
    override val kommentar: String?,
    override val geschaeftspartner: Geschaeftspartner,
    override val adresse: Adresse?,
    override val rufnummer: Rufnummer?,
    override val zustaendigkeit: Zustaendigkeit?,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.ANSPRECHPARTNER,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Ansprechpartner
