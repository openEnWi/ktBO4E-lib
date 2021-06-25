package de.progresslab.bo4e.lib.enum

enum class Bilanzierungsmethode(val beschreibung: String) {
    RLM("Registrierende Leistungsmessung"),
    SLP("Standard Lastprofil"),
    TLP_GEMEINSAM("TLP gemeinsame Messung"),
    TLP_GETRENNT("TLP getrennte Messung"),
    PAUSCHAL("Pauschale Betrachtung (Band)")
}