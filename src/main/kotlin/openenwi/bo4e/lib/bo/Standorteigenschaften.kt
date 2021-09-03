package openenwi.bo4e.lib.bo

import openenwi.bo4e.lib.com.StandorteigenschaftenAllgemein
import openenwi.bo4e.lib.com.StandorteigenschaftenGas
import openenwi.bo4e.lib.com.StandorteigenschaftenStrom
import openenwi.bo4e.lib.enum.BOTyp

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
    val eigenschaftenGas: Set<StandorteigenschaftenGas>
) : Geschaeftsobjekt(boTyp = BOTyp.STANDORTEIGENSCHAFTEN)
