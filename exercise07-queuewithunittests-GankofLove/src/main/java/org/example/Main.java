package org.example;


/*
Angabe:
1. ein queue objekt erstellen
2. einzelne elemente aus der queue entfernen
3. überprüfen ob die queue leer ist
4. queue wieder auffüllen
5. überprüfen ob die queue voll ist
*/

public class Main {


    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);

        // 1. Fülle die Queue mit Elementen
        queue.enqueue("Element1");
        queue.enqueue("Element2");
        queue.enqueue("Element3");
        System.out.println("Drei Elemente zur Queue hinzugefügt.");

        // Größe der Queue ausgeben
        System.out.println("Die Größe der Queue ist: " + queue.size());

        // Betrachtet das vorderste Element der Queue
        System.out.println("Das vorderste Element ist: " + queue.peek());

        // 2. Lösche alle Elemente aus der Queue
        // Diese Schleife wird so lange wiederholt, wie die Bedingung !queue.isEmpty() wahr ist
        // Das bedeutet, dass die Schleife weiterläuft, solange die Queue nicht leer ist
        // Das Ausrufezeichen ! ist ein logischer NOT-Operator, der den Wahrheitswert des nachfolgenden Ausdrucks umkehrt
        // Also, wenn queue.isEmpty() true zurückgibt, wird !queue.isEmpty() false sein und umgekehrt
        while (!queue.isEmpty()) {
            System.out.println("Entfernt: " + queue.dequeue());
        }

        // 3. Überprüfe, ob die Queue leer ist
        System.out.println("Ist die Queue leer? " + queue.isEmpty());

        // 4. Fülle die Queue wieder
        queue.enqueue("NeuesElement1");
        queue.enqueue("NeuesElement2");
        queue.enqueue("NeuesElement3");
        queue.enqueue("NeuesElement4");
        queue.enqueue("NeuesElement5");
        System.out.println("Queue wurde wieder aufgefüllt.");

        // 5. Überprüfe, ob die Queue voll ist
        System.out.println("Ist die Queue voll? " + queue.isFull());
    }
}
