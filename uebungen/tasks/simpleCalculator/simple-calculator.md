# Übung: Zeichenketten in Zahlen umwandeln und Fehler abfangen – Taschenrechner für Grundoperationen

## Beschreibung
Schreibe ein Java-Programm, das einen simplen Taschenrechner simuliert. Der Benutzer soll aufgefordert werden, zwei Zahlen und eine Rechenoperation (Addition, Subtraktion, Multiplikation oder Division) einzugeben. Das Programm führt dann die gewünschte Operation durch und gibt das Ergebnis aus. Tritt bei der Eingabe oder Berechnung ein Fehler auf (z. B. ungültige Eingabe, Division durch Null), soll eine Fehlermeldung angezeigt und die Eingabe wiederholt werden.

## Anforderungen
1. **Zahleneingabe**: Verwende eine geeignete Eingabemethode, um den Benutzer nach zwei Zahlen zu fragen.
2. **Fehlerbehandlung bei Umwandlung**: Nutze `try-catch`, um Fehler bei der Umwandlung der Eingaben in Ganzzahlen (`int`) abzufangen.
3. **Rechenoperation**: Lasse den Benutzer eine der folgenden Rechenoperationen auswählen: Addition (`+`), Subtraktion (`-`), Multiplikation (`*`) oder Division (`/`).
4. **Fehlermeldungen**:
   - **Ungültige Eingabe**: Zeige eine Fehlermeldung, wenn die Eingabe keine Zahl ist oder eine ungültige Operation ausgewählt wird.
   - **Division durch Null**: Zeige eine spezifische Fehlermeldung, falls eine Division durch Null versucht wird.
5. **Ergebnis**: Gib das Ergebnis mittel geeigneter Ausgabemethode aus.

## Beispielablauf
- **Eingabe**: `12`, `4`, `*`
- **Ausgabe**: `"The result is: 48"`

- **Fehlerfall**: Der Benutzer gibt `"abc"` als Zahl ein oder wählt eine ungültige Operation.
- **Ausgabe**: Eine Fehlermeldung wird angezeigt, und die Eingabe wird erneut angefordert.
