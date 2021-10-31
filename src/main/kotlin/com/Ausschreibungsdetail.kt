package de.openenwi.bo4e.lib.com

import de.openenwi.bo4e.lib.enum.Netzebene
import de.openenwi.bo4e.lib.enum.Zaehlertyp

/**
 * Die Komponente Ausschreibungsdetail wird verwendet um die Informationen
 * zu einer Abnahmestelle innerhalb eines Ausschreibungsloses abzubilden.
 *
 * veröffentlicht am 13. März 2018
 *
 * @see [COM Ausschreibungsdetail](https://www.bo4e.de/dokumentation/komponenten/com-ausschreibungsdetail)
 */
data class Ausschreibungsdetail(
    val lokationsId: String,
    val lokationsbezeichung: String?,
    val netzebeneLieferung: Netzebene,
    val netzebeneMessung: Netzebene,
    val netzbetreiber: String?,
    val kunde: String?,
    val zaehlernummer: String?,
    val zaehlertechnik: Zaehlertyp?,
    val lastgangVorhanden: Boolean?,
    val lokationsadresse: Adresse?,
    val rechnungsadresse: Adresse?,
    val prognoseJahresarbeit: Menge?,
    val prognoseArbeitLieferzeitraum: Menge?,
    val prognoseLeistung: Menge?,
    val lieferzeitraum: Zeitraum
)
