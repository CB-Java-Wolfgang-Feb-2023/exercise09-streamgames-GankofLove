package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MyQueueTest {

    private MyQueue queue;

    // Diese Methode wird vor jedem Testfall ausgeführt, um eine neue Queue mit einer Kapazität von 3 zu initialisieren
    @BeforeEach
    public void setUp() {
        queue = new MyQueue(3);
    }

    // Überprüft, ob eine neu erstellte Queue leer ist
    @Test
    public void newQueueIsEmpty() {
        Assertions.assertTrue(queue.isEmpty(), "Eine neue Queue sollte leer sein.");
    }

    // Überprüft, ob das Einfügen eines Elements die Größe der Queue erhöht
    @Test
    public void enqueueIncreasesSize() {
        queue.enqueue("Element1");
        Assertions.assertEquals(1, queue.size(), "Nach dem Einfügen eines Elements sollte die Größe der Queue zunehmen.");
    }

    // Überprüft, ob eine Exception geworfen wird, wenn versucht wird, ein Element in eine volle Queue einzufügen
    @Test
    public void enqueueThrowsExceptionWhenFull() {
        queue.enqueue("Element1");
        queue.enqueue("Element2");
        queue.enqueue("Element3");
        Assertions.assertThrows(RuntimeException.class, () -> queue.enqueue("Element4"), "Das Einfügen in eine volle Queue sollte eine RuntimeException auslösen.");
    }

    // Überprüft, ob das Entfernen eines Elements die Größe der Queue verringert
    @Test
    public void dequeueDecreasesSize() {
        queue.enqueue("Element1");
        queue.dequeue();
        Assertions.assertTrue(queue.isEmpty(), "Nach dem Entfernen des einzigen Elements sollte die Queue leer sein.");
    }

    // Überprüft, ob eine Exception geworfen wird, wenn versucht wird, ein Element aus einer leeren Queue zu entfernen
    @Test
    public void dequeueThrowsExceptionWhenEmpty() {
        Assertions.assertThrows(RuntimeException.class, () -> queue.dequeue(), "Das Entfernen aus einer leeren Queue sollte eine RuntimeException auslösen.");
    }

    // Überprüft, ob die Methode peek() das vorderste Element der Queue zurückgibt
    @Test
    public void peekReturnsFront() {
        queue.enqueue("Element1");
        Assertions.assertEquals("Element1", queue.peek(), "Peek sollte das vorderste Element zurückgeben, ohne es zu entfernen.");
    }

    // Überprüft, ob eine Exception geworfen wird, wenn peek() auf einer leeren Queue aufgerufen wird
    @Test
    public void peekThrowsExceptionWhenEmpty() {
        Assertions.assertThrows(RuntimeException.class, () -> queue.peek(), "Peek sollte eine RuntimeException auslösen, wenn die Queue leer ist.");
    }

    // Überprüft, ob die Methode isFull() true zurückgibt, wenn die Queue voll ist
    @Test
    public void isFullReturnsTrueWhenFull() {
        queue.enqueue("Element1");
        queue.enqueue("Element2");
        queue.enqueue("Element3");
        Assertions.assertTrue(queue.isFull(), "isFull sollte true zurückgeben, wenn die Queue voll ist.");
    }

    // Überprüft, ob die Methode isFull() false zurückgibt, wenn die Queue nicht voll ist
    @Test
    public void isFullReturnsFalseWhenNotFull() {
        queue.enqueue("Element1");
        Assertions.assertFalse(queue.isFull(), "isFull sollte false zurückgeben, wenn die Queue nicht voll ist.");
    }
}
