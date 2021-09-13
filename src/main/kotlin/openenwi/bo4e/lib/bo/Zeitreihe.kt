package openenwi.bo4e.lib.bo

import openenwi.bo4e.lib.com.Zeitreihenwert
import openenwi.bo4e.lib.enum.*

/**
 * Abbildung einer allgemeinen Zeitreihe mit einem Wertvektor.
 * Die Werte können mit wahlfreier zeitlicher Distanz im Vektor abgelegt sein.
 *
 * veröffentlicht am 07. Oktober 2020
 *
 * @see [BO Zeitreihe](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-zeitreihe)
 */
data class Zeitreihe(
    val geschaeftsobjekt: Geschaeftsobjekt = Geschaeftsobjekt(boTyp = BOTyp.ZEITREIHE),
    val bezeichnung: String,
    val beschreibung: String?,
    val version: String?,
    val messgroesse: Messgroesse,
    val messart: Messart,
    val medium: Medium,
    val einheit: Mengeneinheit,
    val wertherkunft: Wertermittlungsverfahren?,
    val werte: Set<Zeitreihenwert>
)