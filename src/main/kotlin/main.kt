package de.progresslab.bo4e.lib

import de.progresslab.bo4e.lib.enum.Sparte
import de.progresslab.bo4e.lib.enum.Vertragsstatus

fun main() {
    println("Bekannte Sparten im Universum ${Sparte.values().size}")
    Sparte.values().forEach { println(it)}
    println()
    println("Vertragsstatus ${Vertragsstatus.values().size}")
    println(Vertragsstatus.values().joinToString(", "))
}