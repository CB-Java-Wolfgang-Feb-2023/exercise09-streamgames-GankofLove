package org.example;

public class MyQueue {
    // Maximale Größe der Queue
    private int maxSize;

    // Index des ersten Elements (vorne)
    private int front;

    // Index des letzten Elements (hinten)
    private int rear;

    // Aktuelle Anzahl der Elemente in der Queue
    private int currentSize;

    // Array zur Speicherung der Queue-Elemente (Strings in diesem Fall)
    private String[] array;

    // Konstruktor -> Initialisiert eine neue Queue mit einer gegebenen maximalen Größe
    public MyQueue(int size) {
        this.maxSize = size;
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
        this.array = new String[maxSize];
    }

    // Methode, um die aktuelle Größe der Queue zu ermitteln
    public int size() {
        return currentSize;
    }

    // Methode, um das vorderste Element der Queue zu betrachten, ohne es zu entfernen
    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }
        return array[front];
    }


    // Überprüft, ob die Queue leer ist
    public boolean isEmpty() {
        return currentSize == 0;
    }

    // Überprüft, ob die Queue voll istbitte füge punkt 1 und unkt 3 hinzu.
    public boolean isFull() {
        return currentSize == maxSize;
    }

    // Fügt ein Element am Ende der Queue hinzu
    // wirft eine RuntimeException, wenn die Queue voll ist
    public void enqueue(String item) {
        if (isFull()) {
            throw new RuntimeException("Queue is full!");
        }
        // Zirkuläres Array
        rear = (rear + 1) % maxSize;        // Modulo stellt sicher, dass rear nicht größer als maxSize wird
        // Wenn rear gleich maxSize ist, wird (rear + 1) % maxSize zu 0, wodurch rear wieder zum Anfang des Arrays gesetzt wird
        array[rear] = item;                 // speichert item an der aktuellen Position (Ende) von rear
        currentSize++;                      // erhöht die Anzahl der Elemente in der Queue um 1.
        // Jedes Mal, wenn ein Element zur Queue hinzugefügt wird, wird currentSize inkrementiert, um die aktuelle Anzahl der Elemente in der Queue zu verfolgen
    }

    // Entfernt und gibt das vorderste Element der Queue zurück
    // wirft eine RuntimeException, wenn die Queue leer ist
    public String dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }
        // Speichern des vordersten Elements temporär zum späteren Zurückgeben
        String temp = array[front];
        // Zirkuläres Array: wenn front das Ende des Arrays erreicht, geht es wieder zum Anfang
        front = (front + 1) % maxSize;
        currentSize--;
        return temp;
    }
}
