package de.progresslab.bo4e

import de.progresslab.bo4e.lib.bo.Marktteilnehmer
import de.progresslab.bo4e.lib.enum.Marktrolle
import de.progresslab.bo4e.lib.enum.Rollencodetyp
import de.progresslab.bo4e.lib.enum.Sparte
import de.progresslab.bo4e.lib.enum.Vertragsstatus

fun main() {
    println("Bekannte Sparten im Universum ${Sparte.values().size}")
    Sparte.values().forEach { println(it) }
    println()
    println("Vertragsstatus ${Vertragsstatus.values().size}")
    println(Vertragsstatus.values().joinToString(", "))
    println()
    val mp = Marktteilnehmer(Marktrolle.LF, "abc123", Rollencodetyp.BDEW, "Erste Strasse 123")
    println(mp)
}