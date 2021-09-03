package openenwi.bo4e.lib.bo

import openenwi.bo4e.lib.com.Tagesvektor
import openenwi.bo4e.lib.com.Zeitintervall
import openenwi.bo4e.lib.enum.*

/**
 * Modell zur Abbildung eines kompakten Lastganges.
 * In diesem Modell werden die Messwerte in Form von Tagesvektoren mit fester Anzahl von Werten übertragen.
 * Daher ist dieses BO nur zur Übertragung von äquidistanten Messwertverläufen geeignet.
 *
 * veröffentlicht am 07. Oktober 2020
 *
 * @see [BO Lastgangkompakt](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-lastgangkompakt")
 */
data class Lastgangkompakt(
    val sparte: Sparte,
    val version: String?,
    val lokationsId: String?,
    val lokationstyp: Lokationstyp,
    val obiskennzahl: String?,
    val messgroesse: Mengeneinheit,
    val zeitintervall: Zeitintervall,
    val tagesvektoren: List<Tagesvektor>
) : Geschaeftsobjekt(boTyp = BOTyp.LASTGANGKOMPAKT)
