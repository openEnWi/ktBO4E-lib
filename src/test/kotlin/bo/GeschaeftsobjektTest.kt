package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.LibBO4E.VERSION
import de.openenwi.bo4e.lib.enum.BOTyp.VERTRAG
import kotlin.test.Test
import kotlin.test.assertEquals

internal class GeschaeftsobjektTest {
    data class Vertrag(
        val unterzeichner: String,
        val geschaeftsobjekt: Geschaeftsobjekt = GeschaeftsobjektImpl(VERSION, VERTRAG),
    ) : Geschaeftsobjekt by geschaeftsobjekt

    private val vertrag: Vertrag = Vertrag(NAME)

    @Test
    fun testGetters() {
        assertEquals(NAME, vertrag.unterzeichner)
        assertEquals(VERSION, vertrag.versionStruktur)
        assertEquals(VERTRAG, vertrag.boTyp)
        assertEquals(emptySet(), vertrag.externeReferenzen)
    }

    companion object {
        const val NAME = "Hans Frick"
    }
}
