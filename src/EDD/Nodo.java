/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author CMGamer
 * @param <T>
 */
public class Nodo<T> {
    private T data;
    public Nodo next;

    /**
     * @param dataL
    */
    public Nodo(T dataL) {
        this.data = dataL;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public Nodo<T> getNext() {
        return next;
    }

    /**
     *
     * @param data
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     *
     * @param next
     */
    public void setNext(Nodo next) {
        this.next = next;
    }

    
}