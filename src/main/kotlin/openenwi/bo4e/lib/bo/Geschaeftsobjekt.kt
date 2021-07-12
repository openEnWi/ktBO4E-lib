package openenwi.bo4e.lib.bo

import openenwi.bo4e.lib.com.ExterneReferenz
import openenwi.bo4e.lib.enum.BOTyp

/**
 * Das BO Geschäftsobjekt ist der Master für alle Geschäftsobjekte.
 * Alle Attribute, die hier in diesem BO enthalten sind, werden an alle BO`s vererbt.
 *
 * Version 1.1
 * veröffentlicht am 10. Oktober 2020
 */
abstract class Geschaeftsobjekt(
    val versionstruktur: Int = 11,
    val boTyp: BOTyp,
    val externeReferenzen: Set<ExterneReferenz> = setOf()
)
