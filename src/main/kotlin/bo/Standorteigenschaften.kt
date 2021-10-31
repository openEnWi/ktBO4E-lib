package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.bo.Geschaeftsobjekt.Companion.typ
import de.openenwi.bo4e.lib.com.StandorteigenschaftenAllgemein
import de.openenwi.bo4e.lib.com.StandorteigenschaftenGas
import de.openenwi.bo4e.lib.com.StandorteigenschaftenStrom
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.BOTyp.STANDORTEIGENSCHAFTEN

/**
 * In diesem BO werden die regionalen und spartenspezifischen Eigenschaften einer gegebenen Adresse modelliert.
 *
 * veröffentlicht am 03. Juli 2019
 *
 * @see [BO Standorteigenschaften](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-standorteigenschaften)
 */
data class Standorteigenschaften(
    val eigenschaftenAllgemein: StandorteigenschaftenAllgemein,
    val eigenschaftenStrom: Set<StandorteigenschaftenStrom>,
    val eigenschaftenGas: Set<StandorteigenschaftenGas>,
    val geschaeftsobjekt: Geschaeftsobjekt = typ(STANDORTEIGENSCHAFTEN)
) : Geschaeftsobjekt by geschaeftsobjekt