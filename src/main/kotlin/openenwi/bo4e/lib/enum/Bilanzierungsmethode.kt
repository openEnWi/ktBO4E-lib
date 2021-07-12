package openenwi.bo4e.lib.enum

/**
 * Mit dieser Aufzählung kann zwischen den Bilanzierungsmethoden bzw. -Grundlagen unterschieden werden.
 *
 * veröffentlicht am 17. Januar 2018
 */
enum class Bilanzierungsmethode(val beschreibung: String) {
    RLM("Registrierende Leistungsmessung"),
    SLP("Standard Lastprofil"),
    TLP_GEMEINSAM("TLP gemeinsame Messung"),
    TLP_GETRENNT("TLP getrennte Messung"),
    PAUSCHAL("Pauschale Betrachtung (Band)")
}
