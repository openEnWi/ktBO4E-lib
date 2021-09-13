package openenwi.bo4e.lib.bo

import openenwi.bo4e.lib.com.Regionskriterium
import openenwi.bo4e.lib.enum.BOTyp

/**
 * Modellierung einer Region als Menge von Kriterien, die eine Region beschreiben.
 *
 * veröffentlicht am 22. August 2018
 *
 * @see [BO Region](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-region)
 */
data class Region(
    val geschaeftsobjekt: Geschaeftsobjekt = Geschaeftsobjekt(boTyp = BOTyp.REGION),
    val bezeichnung: String,
    val positivListe: List<Regionskriterium>,
    val negativListe: List<Regionskriterium>
)
