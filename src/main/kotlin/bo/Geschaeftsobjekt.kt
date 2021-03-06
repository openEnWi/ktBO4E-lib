package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.com.ExterneReferenz
import de.openenwi.bo4e.lib.enum.BOTyp

/**
 * Das BO Geschäftsobjekt ist der Master für alle Geschäftsobjekte.
 * Alle Attribute, die hier in diesem BO enthalten sind, werden an alle BOs vererbt.
 *
 * Version 1.1
 * veröffentlicht am 10. Oktober 2020
 *
 * @see [BO Geschaeftsobjekt](https://www.bo4e.de/dokumentation/geschaeftsobjekte/bo-geschaftsobjekt/10-10-2020)
 *
 * @property versionStruktur Version der BO-Struktur.
 * @property boTyp Der Typ des Geschäftsobjektes. Details siehe ENUM BoTyp
 * @property externeReferenzen Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer)
 */

interface Geschaeftsobjekt {
    val versionStruktur: Int
    val boTyp: BOTyp
    val externeReferenzen: Set<ExterneReferenz>
}

data class GeschaeftsobjektImpl(
    override val versionStruktur: Int = 1,
    override val boTyp: BOTyp,
    override val externeReferenzen: Set<ExterneReferenz> = emptySet(),
) : Geschaeftsobjekt
