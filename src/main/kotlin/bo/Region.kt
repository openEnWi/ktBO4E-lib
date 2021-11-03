package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.bo.Geschaeftsobjekt.Companion.typ
import de.openenwi.bo4e.lib.com.Regionskriterium
import de.openenwi.bo4e.lib.enum.BOTyp.REGION

/**
 * Modellierung einer Region als Menge von Kriterien, die eine Region beschreiben.
 *
 * veröffentlicht am 22. August 2018
 *
 * @see [BO Region](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-region)
 */
data class Region(
    val bezeichnung: String,
    val positivListe: List<Regionskriterium>,
    val negativListe: List<Regionskriterium>,
    val geschaeftsobjekt: Geschaeftsobjekt = typ(REGION)
) : Geschaeftsobjekt by geschaeftsobjekt