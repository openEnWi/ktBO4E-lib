package de.progresslab.bo4e.lib.enum

/**
 * Bezeichnungen für die Ausschreibungsphasen.
 *
 * veröffentlicht am 28. Februar 2018
 */
enum class Ausschreibungsstatus(val beschreibung: String) {
    PHASE1("Phase1: Teilnahmewettbewerb"),
    PHASE2("Phase2: Angebotsphase"),
    PHASE3("Phase3: Verhandlungsphase"),
    PHASE4("Phase4: Zuschlagserteilung")
}
