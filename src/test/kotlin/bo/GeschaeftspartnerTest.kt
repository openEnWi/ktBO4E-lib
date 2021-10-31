package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.Adresse
import kotlin.test.Test
import kotlin.test.assertEquals

internal class GeschaeftspartnerTest {

    @Test
    fun testConstruction() {
        val gp = Geschaeftspartner(
            name1 = NAME,
            partneradresse = Adresse(
                postleitzahl = "98765",
                ort = "Enerdorf"
            )
        )

        assertEquals(NAME, gp.name1)
    }

    companion object {
        const val NAME: String = "GP Name"
    }
}