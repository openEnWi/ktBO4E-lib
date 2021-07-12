package openenwi.bo4e.lib.com

/**
 * Viele Datenobjekte weisen in unterschiedlichen Systemen eine eindeutige ID (Kundennummer, GP-Nummer etc.) auf.
 *
 * Beim Austausch von Datenobjekten zwischen verschiedenen Systemen ist es daher hilfreich,
 * sich die eindeutigen IDs der anzubindenden Systeme zu merken.
 * Diese Komponente ermöglicht es, sich die SAP GP-Nummer zu merken,
 * um diese bei SAP-Aufrufen als Parameter mitgeben zu können.
 *
 * veröffentlicht am 10. Oktober 2020
 */
data class ExterneReferenz(val exRefName: String, val exRefWert: String)
