package openenwi.bo4e.lib.bo

import openenwi.bo4e.lib.com.Zeitreihenwert
import openenwi.bo4e.lib.enum.BOTyp
import openenwi.bo4e.lib.enum.Mengeneinheit
import openenwi.bo4e.lib.enum.Sparte

/**
 * Modell zur Abbildung eines Lastganges.
 * In diesem Modell werden die Messwerte mit einem vollständigen Zeitintervall angegeben
 * und es bietet daher eine hohe Flexibilität in der Übertragung jeglicher zeitlich veränderlicher Messgrössen.
 *
 * veröffentlicht am 07. Oktober 2020
 *
 * @see [BO Lastgang](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-lastgang)
 */
data class Lastgang(
    val sparte: Sparte,
    val version: String?,
    val lokationsId: String,
    val obiskennzahl: String?,
    val messgroesse: Mengeneinheit,
    val werte: List<Zeitreihenwert>
) : Geschaeftsobjekt(boTyp = BOTyp.LASTGANG)
