package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.bo.Geschaeftsobjekt.Companion.typ
import de.openenwi.bo4e.lib.com.Zeitreihenwert
import de.openenwi.bo4e.lib.enum.*
import de.openenwi.bo4e.lib.enum.BOTyp.ZEITREIHE

/**
 * Abbildung einer allgemeinen Zeitreihe mit einem Wertvektor.
 * Die Werte können mit wahlfreier zeitlicher Distanz im Vektor abgelegt sein.
 *
 * veröffentlicht am 07. Oktober 2020
 *
 * @see [BO Zeitreihe](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-zeitreihe)
 */
data class Zeitreihe(
    val bezeichnung: String,
    val beschreibung: String?,
    val version: String?,
    val messgroesse: Messgroesse,
    val messart: Messart,
    val medium: Medium,
    val einheit: Mengeneinheit,
    val wertherkunft: Wertermittlungsverfahren?,
    val werte: Set<Zeitreihenwert>,
    val geschaeftsobjekt: Geschaeftsobjekt = typ(ZEITREIHE)
) : Geschaeftsobjekt by geschaeftsobjekt