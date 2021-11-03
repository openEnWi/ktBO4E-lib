package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Adresse
import de.openenwi.bo4e.lib.com.Unterschrift
import de.openenwi.bo4e.lib.com.Vertragskonditionen
import de.openenwi.bo4e.lib.com.Vertragsteil
import de.openenwi.bo4e.lib.enum.BOTyp.BUENDELVERTRAG
import de.openenwi.bo4e.lib.enum.Sparte
import de.openenwi.bo4e.lib.enum.Vertragsstatus
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertEquals

internal class BuendelvertragTest {

    @Test
    fun testConstruction() {
        val buendelvertrag = Buendelvertrag(
            VNR,
            BESCHREIBUNG,
            VERTRAGSTATUS,
            SPARTE,
            VERTRAGSBEGINN,
            VERTRAGSENDE,
            VERTRAGSPARTNER1,
            VERTRAGSPARTNER2,
            UNTERZEICHNERVP1,
            UNTERZEICHNERVP2,
            VERTRAGSKONDITIONEN,
            VERTRAGSTEILE,
            EINZELVERTRAEGE
        )

        assertEquals(VNR, buendelvertrag.vertragsnummer)
        assertEquals(BUENDELVERTRAG, buendelvertrag.boTyp)
        println(buendelvertrag)
    }

    companion object {
        val ADRESSE = Adresse("98765", "Enerdorf")
        val UNTERSCHRIFT = Unterschrift(name = "R. Lerdorf")
        val VNR = "abc123"
        val BESCHREIBUNG = "desc"
        val VERTRAGSTATUS = Vertragsstatus.AKTIV
        val SPARTE = Sparte.STROM
        val VERTRAGSBEGINN = LocalDateTime.of(2021, 10, 31, 21, 36, 12)
        val VERTRAGSENDE = LocalDateTime.of(2022, 12, 31, 23, 59, 59)
        val VERTRAGSPARTNER1 = Geschaeftspartner(name1 = "vp1", partneradresse = ADRESSE)
        val VERTRAGSPARTNER2 = Geschaeftspartner(name1 = "vp2", partneradresse = ADRESSE)
        val UNTERZEICHNERVP1 = UNTERSCHRIFT
        val UNTERZEICHNERVP2 = UNTERSCHRIFT
        val VERTRAGSKONDITIONEN = emptySet<Vertragskonditionen>()
        val VERTRAGSTEILE = emptyList<Vertragsteil>()
        val EINZELVERTRAEGE = emptyList<Vertrag>()
    }
}