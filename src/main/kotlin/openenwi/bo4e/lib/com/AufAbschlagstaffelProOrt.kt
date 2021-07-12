package openenwi.bo4e.lib.com

import java.math.BigDecimal

/**
 * Gibt den Wert eines Auf- oder Abschlags und dessen Staffelgrenzen an.
 *
 * veröffentlicht am 12. Dezember 2018
 *
 * @see "https://www.bo4e.de/dokumentation/komponenten/com-aufabschlagstaffelproort"
 *
 * @property wert Der Wert für den Auf- oder Abschlag.
 * @property staffelgrenzeVon Unterer Wert, ab dem die Staffel gilt.
 * @property staffelgrenzeBis Oberer Wert, bis zu dem die Staffel gilt.
 */
data class AufAbschlagstaffelProOrt(
    val wert: BigDecimal,
    val staffelgrenzeVon: BigDecimal,
    val staffelgrenzeBis: BigDecimal
)
