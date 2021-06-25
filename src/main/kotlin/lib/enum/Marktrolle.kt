package de.progresslab.bo4e.lib.enum

enum class Marktrolle(val beschreibung: String) {
    NB("Netzbetreiber"),
    LF("Lieferant"),
    MSB("Messstellenbetreiber"),
    MDL("Messdienstleister"),
    DL("Dienstleister"),
    BKV("Bilanzkreisverantwortlicher"),
    BKO("Bilanzkoordinator/Marktgebietsverantwortlicher"),
    UENB("Übertragungsnetzbetreiber"),
    KUNDE_SELBST_NN("Kunden die NN-Entgelte selbst zahlen"),
    MGV("Marktgebietsverantwortlicher"),
    EIV("Einsatzverantwortlicher"),
    RB("Registerbetreiber"), // Beispielsweise Herkunftsnachweisregister
    KUNDE("Kunde"),
    INTERESSENT("Interessent")
}