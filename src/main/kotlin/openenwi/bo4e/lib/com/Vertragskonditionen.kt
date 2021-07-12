package openenwi.bo4e.lib.com

import java.math.BigDecimal

/**
 * Abbildung für Vertragskonditionen. Die Komponente wird sowohl im Vertrag als auch im Tarif verwendet.
 *
 * veröffentlicht am 30. Mai 2018
 *
 * @see "https://www.bo4e.de/dokumentation/komponenten/com-vertragskonditionen"
 */
data class Vertragskonditionen(
    val beschreibung: String?,
    val anzahlAbschlaege: BigDecimal?,
    val vertragslaufzeit: Zeitraum?,
    val kuendigungsfrist: Zeitraum?,
    val vertragsverlaengerung: Zeitraum?,
    val abschlagszyklus: Zeitraum?
)
