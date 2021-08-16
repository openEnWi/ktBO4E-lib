package openenwi.bo4e.lib.bo

import openenwi.bo4e.lib.com.Preisposition
import openenwi.bo4e.lib.com.Zeitraum
import openenwi.bo4e.lib.enum.Preisstatus
import openenwi.bo4e.lib.enum.Sparte

/**
 * Das allgemeine Modell zur Abbildung von Preisen.
 * Davon abgeleitet können, über die Zuordnung identifizierender Merkmale,
 * spezielle Preisblatt-Varianten modelliert werden.
 *
 * veröffentlicht am 11. April 2018
 *
 * @see "https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-preisblatt"
 */
data class Preisblatt(
    val bezeichnung: String,
    val sparte: Sparte,
    val preisstatus: Preisstatus,
    val herausgeber: Marktteilnehmer?,
    val gueltigkeit: Zeitraum,
    val preispositionen: Set<Preisposition>
)
