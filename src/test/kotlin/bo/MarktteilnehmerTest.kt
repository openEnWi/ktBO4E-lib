package bo

import de.openenwi.bo4e.lib.LibBO4E.Companion.VERSION
import de.openenwi.bo4e.lib.bo.Marktteilnehmer
import de.openenwi.bo4e.lib.enum.BOTyp
import de.openenwi.bo4e.lib.enum.Marktrolle
import de.openenwi.bo4e.lib.enum.Rollencodetyp
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

internal class MarktteilnehmerTest {

    private val marktteilnehmer: Marktteilnehmer = Marktteilnehmer(
        marktrolle,
        rollencodenummer,
        rollencodetyp,
        makoadresse
    )

    @Test
    fun testGetters() {
        assertEquals(marktrolle, marktteilnehmer.marktrolle)
        assertEquals(rollencodenummer, marktteilnehmer.rollencodenummer)
        assertEquals(rollencodetyp, marktteilnehmer.rollencodetyp)
        assertEquals(makoadresse, marktteilnehmer.makoadresse)
    }

    @Test
    fun testToString() {
        assertFalse { marktteilnehmer.toString().isEmpty() }
    }

    @Test
    fun getBoTyp() {
        assertEquals(BOTyp.MARKTTEILNEHMER, marktteilnehmer.boTyp)
    }

    @Test
    fun getExterneReferenzen() {
        assertEquals(emptySet(), marktteilnehmer.externeReferenzen)
    }

    @Test
    fun getVersionstruktur() {
        assertEquals(VERSION, marktteilnehmer.versionstruktur)
    }

    companion object {
        private val marktrolle: Marktrolle = Marktrolle.LF
        private const val rollencodenummer = "code123"
        private val rollencodetyp: Rollencodetyp = Rollencodetyp.BDEW
        private const val makoadresse = "Mako Adresse"
    }
}
