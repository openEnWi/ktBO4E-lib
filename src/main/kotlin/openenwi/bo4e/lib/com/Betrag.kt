package openenwi.bo4e.lib.com

import openenwi.bo4e.lib.enum.Waehrungscode
import java.math.BigDecimal

/**
 * Die Komponente wird dazu verwendet,
 * Summebeträge - beispielsweise in Angeboten und Rechnungen - als Geldbeträge abzubilden.
 * Die Einheit ist dabei immer die Hauptwährung also Euro, Dollar etc..
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see [COM Betrag](https://www.bo4e.de/dokumentation/komponenten/com-betrag)
 */
data class Betrag(val wert: BigDecimal, val waehrung: Waehrungscode)
