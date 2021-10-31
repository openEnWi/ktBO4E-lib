package de.openenwi.bo4e.lib.bo

import de.openenwi.bo4e.lib.LibBO4E.Companion.VERSION
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
 * @property versionstruktur Version der BO-Struktur.
 * @property boTyp Der Typ des Geschäftsobjektes. Details siehe ENUM BoTyp
 * @property externeReferenzen Hier können IDs anderer Systeme hinterlegt werden (z.B. eine SAP-GP-Nummer)
 */
/*
open class Geschaeftsobjekt(
    val versionstruktur: Int,
    val boTyp: BOTyp,
    val externeReferenzen: Set<ExterneReferenz>
) {
    constructor(boTyp: BOTyp, externeReferenzen: Set<ExterneReferenz>) : this(VERSION, boTyp, externeReferenzen)
    constructor(boTyp: BOTyp)  : this(VERSION, boTyp, emptySet())
}
*/

interface Geschaeftsobjekt {
    val versionstruktur: Int
    val boTyp: BOTyp
    val externeReferenzen: Set<ExterneReferenz>

    companion object {
        fun typ(boTyp: BOTyp): Geschaeftsobjekt = GeschaeftsobjektImpl(boTyp)
    }
}

data class GeschaeftsobjektImpl(
    override val versionstruktur: Int = VERSION,
    override val boTyp: BOTyp,
    override val externeReferenzen: Set<ExterneReferenz>
) : Geschaeftsobjekt {
    constructor(boTyp: BOTyp, externeReferenzen: Set<ExterneReferenz>) : this(VERSION, boTyp, externeReferenzen)
    constructor(boTyp: BOTyp) : this(VERSION, boTyp, emptySet())
}
