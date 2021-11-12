package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.com.StandorteigenschaftenAllgemein
import de.openenwi.bo4e.lib.com.StandorteigenschaftenGas
import de.openenwi.bo4e.lib.com.StandorteigenschaftenStrom
import de.openenwi.bo4e.lib.enum.BOTyp

/**
 * In diesem BO werden die regionalen und spartenspezifischen Eigenschaften einer gegebenen Adresse modelliert.
 *
 * veröffentlicht am 03. Juli 2019
 *
 * @see [BO Standorteigenschaften](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-standorteigenschaften)
 */
interface Standorteigenschaften : Geschaeftsobjekt {
    val eigenschaftenAllgemein: StandorteigenschaftenAllgemein
    val eigenschaftenStrom: Set<StandorteigenschaftenStrom>
    val eigenschaftenGas: Set<StandorteigenschaftenGas>
}

data class StandorteigenschaftenImpl(
    override val eigenschaftenAllgemein: StandorteigenschaftenAllgemein,
    override val eigenschaftenStrom: Set<StandorteigenschaftenStrom>,
    override val eigenschaftenGas: Set<StandorteigenschaftenGas>,

    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp = BOTyp.STANDORTEIGENSCHAFTEN,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Standorteigenschaften
