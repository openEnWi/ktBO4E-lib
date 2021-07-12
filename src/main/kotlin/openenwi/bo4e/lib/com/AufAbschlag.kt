package openenwi.bo4e.lib.com

import openenwi.bo4e.lib.enum.AufAbschlagstyp
import openenwi.bo4e.lib.enum.AufAbschlagsziel
import openenwi.bo4e.lib.enum.Waehrungseinheit

data class AufAbschlag(
    val bezeichnung: String,
    val beschreibung: String?,
    val aufAbschlagstyp: AufAbschlagstyp?,
    val aufAbschlagsziel: AufAbschlagsziel?,
    val einheit: Waehrungseinheit,
    val website: String?,
    val gueltigkeitszeitraum: Zeitraum?,
    val staffeln: Set<Preisstaffel>
)
