# Queue

Eine Queue (dt. Warteschlange) ist eine Sammlung von Elementen, die nach dem First-In-First-Out (FIFO) Prinzip arbeitet. Das bedeutet, dass das erste Element, das in die Queue eingefügt wird, auch das erste ist, das wieder herausgenommen wird.

In Java ist Queue ein Interface aus dem java.util Paket, das die grundlegende Funktionalität einer Warteschlange definiert.

Die "Elemente" in einer Queue können in der Praxis nahezu beliebige Objekte oder Datenstrukturen sein, je nachdem, welches Problem mit der Queue gelöst werden soll.

### Beispiele:

1. **Datenpakete in Netzwerken:**
    - In Computernetzwerken werden oft Datenpakete in einer Queue gespeichert, bevor sie gesendet oder nach Erhalt verarbeitet werden.


2. **Aufträge für einen Drucker:**
    - In einem Büro könnten Druckaufträge in einer Queue gespeichert werden, sodass sie in der Reihenfolge, in der sie ankommen, gedruckt werden.


3. **Befehle in einer Befehlsausführung:**
    - Ein System könnte Befehle in einer Queue speichern, um sie der Reihe nach auszuführen.


4. **Kunden in einem Kundendienstsystem:**
    - Ein Callcenter könnte eingehende Anrufe in einer Warteschlange speichern, um sie in der Reihenfolge ihres Eingangs zu bearbeiten.


5. **Daten in einer Datenverarbeitungs-Pipeline:**
    - Bei der Datenverarbeitung könnten Datenpunkte oder -sätze in einer Queue gespeichert werden, um sie sequenziell zu verarbeiten.


6. **Tasks in einem Task-Management-System:**
    - Ein System könnte Tasks in einer Queue speichern, um sie nach Priorität oder nach ihrem Eingangszeitpunkt zu bearbeiten.


7. **Ereignisse in einem Event-basierten System:**
    - Ein ereignisgesteuertes System könnte Ereignisse in einer Queue speichern, um sie in der Reihenfolge ihres Eintreffens zu bearbeiten.

---

## Notizen zum Code

queue.dequeue(). 
Die dequeue-Methode entfernt und gibt das vorderste Element der Queue zurück. Der zurückgegebene Wert (das entfernte Element) wird dann mit "Entfernt: " in der Konsole ausgegeben.

Dieser Codeabschnitt durchläuft jedes Element in der Queue von vorne bis hinten und entfernt jedes Element nacheinander, während es gleichzeitig den Wert des entfernten Elements ausgibt. Am Ende dieses Abschnitts wird die Queue vollständig geleert sein.

---

## Exceptions

### RuntimeException beim Hinzufügen eines Elements (Enqueue)

- **Wann ausgelöst**: Diese Ausnahme wird ausgelöst, wenn versucht wird, ein Element zu einer bereits vollen Queue hinzuzufügen.
- **Nachricht**: "Queue is full!"
- **Empfohlene Handhabung**: Stellen Sie sicher, dass Sie vor dem Hinzufügen eines Elements überprüfen, ob die Queue voll ist, um diese Ausnahme zu vermeiden.

### RuntimeException beim Entfernen eines Elements (Dequeue)

- **Wann ausgelöst**: Diese Ausnahme wird ausgelöst, wenn versucht wird, ein Element aus einer leeren Queue zu entfernen.
- **Nachricht**: "Queue is empty!"
- **Empfohlene Handhabung**: Überprüfen Sie, ob die Queue leer ist, bevor Sie versuchen, ein Element zu entfernen, um diese Ausnahme zu vermeiden.

---

## Testmethoden MyQueueTest:

Es werden alle öffentlichen Methoden aus der Klasse "MyQueue" getestet.

### newQueueIsEmpty:
- **Beschreibung**: Stellt sicher, dass eine neu instanziierte Queue leer ist.
- **Erwartetes Ergebnis**: Die `isEmpty()` Methode sollte `true` zurückgeben.

### enqueueIncreasesSize:
- **Beschreibung**: Überprüft, ob das Einfügen eines Elements die Größe der Queue um eins erhöht.
- **Erwartetes Ergebnis**: Nach dem Einfügen sollte `size()` den Wert 1 zurückgeben.

### enqueueThrowsExceptionWhenFull:
- **Beschreibung**: Testet, ob eine `RuntimeException` geworfen wird, wenn ein Element in eine bereits volle Queue eingefügt wird.
- **Erwartetes Ergebnis**: Eine `RuntimeException` wird ausgelöst.

### dequeueDecreasesSize:
- **Beschreibung**: Prüft, ob das Entfernen eines Elements aus der Queue die Größe verringert.
- **Erwartetes Ergebnis**: Die Queue sollte nach dem `dequeue`-Aufruf leer sein.

### dequeueThrowsExceptionWhenEmpty:
- **Beschreibung**: Überprüft, ob das Entfernen eines Elements aus einer leeren Queue eine `RuntimeException` auslöst.
- **Erwartetes Ergebnis**: Eine `RuntimeException` wird ausgelöst.

### peekReturnsFront:
- **Beschreibung**: Stellt sicher, dass `peek()` das Element am Anfang der Queue zurückgibt.
- **Erwartetes Ergebnis**: `peek()` gibt das vorderste Element zurück, ohne es zu entfernen.

### peekThrowsExceptionWhenEmpty:
- **Beschreibung**: Testet, ob `peek()` eine `RuntimeException` wirft, wenn die Queue leer ist.
- **Erwartetes Ergebnis**: Eine `RuntimeException` wird ausgelöst.

### isFullReturnsTrueWhenFull:
- **Beschreibung**: Überprüft, ob `isFull()` `true` zurückgibt, wenn die Queue ihre maximale Größe erreicht hat.
- **Erwartetes Ergebnis**: `isFull()` gibt `true` zurück.

### isFullReturnsFalseWhenNotFull:
- **Beschreibung**: Prüft, ob `isFull()` `false` zurückgibt, wenn die Queue nicht voll ist.
- **Erwartetes Ergebnis**: `isFull()` gibt `false` zurück.

## Zusätzliche Informationen:

- **Test-Setup**: Jeder Test beginnt mit einer frisch instanziierten Queue mit einer Kapazität von drei Elementen.
- **Ausnahmen**: Die Tests für erwartete Ausnahmen verwenden die `assertThrows` Methode, um zu bestätigen, dass die korrekte Ausnahme unter den definierten Bedingungen geworfen wird.
- **Nachvollziehbarkeit**: Die Fehlermeldungen in den Assertions sind klar und präzise, um die Ursache eines fehlschlagenden Tests leicht identifizieren zu können.
