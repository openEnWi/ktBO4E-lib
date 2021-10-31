package bo

import de.openenwi.bo4e.lib.bo.Angebot
import de.openenwi.bo4e.lib.bo.Ansprechpartner
import de.openenwi.bo4e.lib.bo.Geschaeftspartner
import de.openenwi.bo4e.lib.bo.Marktlokation
import de.openenwi.bo4e.lib.com.Angebotsteil
import de.openenwi.bo4e.lib.com.Angebotsvariante
import de.openenwi.bo4e.lib.com.Betrag
import de.openenwi.bo4e.lib.com.Menge
import de.openenwi.bo4e.lib.enum.Angebotsstatus
import de.openenwi.bo4e.lib.enum.Mengeneinheit
import de.openenwi.bo4e.lib.enum.Sparte
import de.openenwi.bo4e.lib.enum.Waehrungscode
import java.math.BigDecimal
import java.time.LocalDate
import java.time.ZoneId
import java.time.ZonedDateTime
import kotlin.test.Test
import kotlin.test.assertEquals

internal class AngebotTest {

    @Test
    fun testConstructor() {
        /*
        val dateTime = ZonedDateTime.of(2021, 10, 31, 15, 35, 7, 0, ZoneId.of("+1"))
        val full: Angebot = Angebot(
            "abc123",
            "abc",
            dateTime,
            Sparte.GAS,
            dateTime,
            Geschaeftspartner(

            ),
            Geschaeftspartner(

            ),
            Ansprechpartner(

            ),
            Ansprechpartner(

            ),
            setOf(
                Angebotsvariante(
                    Angebotsstatus.AUSSTEHEND,
                    "Super Angebot",
                    LocalDate.of("2021", 10, 24),
                    dateTime,
                    Menge(BigDecimal.TEN, Mengeneinheit.MW),
                    Betrag(BigDecimal.ONE, Waehrungscode.EUR),
                    listOf(
                        Angebotsteil(
                            "Super Subreferenz",
                            setOf(
                                Marktlokation()
                            )
                        )
                    )
                )
            )
        )
         */
    }
}