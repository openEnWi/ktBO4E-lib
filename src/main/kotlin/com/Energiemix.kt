package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.Oekolabel
import de.openenwi.bo4e.lib.enum.Oekozertifikat
import de.openenwi.bo4e.lib.enum.Sparte
import java.math.BigDecimal

/**
 * Zusammensetzung der gelieferten Energie aus den verschiedenen Primärenergieformen.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see [COM Energiemix](https://www.bo4e.de/dokumentation/komponenten/com-energiemix)
 */
data class Energiemix(
    val energiemixnummer: Int,
    val energieart: Sparte,
    val bezeichnung: String,
    val bemerkung: String?,
    val gueltigkeitsjahr: Int,
    val cO2Emission: BigDecimal?,
    val atommuell: BigDecimal?,
    val oekozertifikat: Set<Oekozertifikat>,
    val oekolabel: Set<Oekolabel>,
    val oekoTopTen: Boolean?,
    val website: String?,
    val anteil: List<Energieherkunft>
)
