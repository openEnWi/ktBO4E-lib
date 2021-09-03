package openenwi.bo4e.lib.com

import openenwi.bo4e.lib.enum.Themengebiet

/**
 * Enthält die zeitliche Zuordnung eines Ansprechpartners zu Abteilungen und Zuständigkeiten.
 *
 * veröffentlicht am 31. Januar 2018
 *
 * @see [COM Zustaendigkeit](https://www.bo4e.de/dokumentation/komponenten/com-zustandigkeit)
 */
data class Zustaendigkeit(
    val jobtitel: String?,
    val abteilung: String?,
    val themengebiet: Themengebiet
)
