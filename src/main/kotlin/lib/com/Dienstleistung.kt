package de.progresslab.bo4e.lib.com

import de.progresslab.bo4e.lib.enum.Dienstleistungstyp

/**
 * Abbildung einer abrechenbaren Dienstleistung.
 *
 * veröffentlicht am 17. Januar 2018
 *
 * @see "https://www.bo4e.de/dokumentation/komponenten/com-dienstleistung"
 */
data class Dienstleistung(val dienstleistungstyp: Dienstleistungstyp, val bezeichnung: String)