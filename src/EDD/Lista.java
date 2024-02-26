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
public class Lista<T> {
    public Nodo<T> head;
    private Nodo<T> tail;

    public Lista() {
        this.head = this.tail = null;

    }

    /**
     *
     * @param n
     */
    public Lista(Nodo<T> n) {
        this.head = this.tail = n;
        
    }
    
    public boolean isEmpty(){
        return this.head == null;
    }
    
    public int size() {
        int i = 0;
        
        if (isEmpty()) {
            return 0;
        }
        Nodo<T> aux = this.head;
        while (aux != null){
            aux = aux.getNext();
            i++;
        }
        return i;
    }
    /**
     *
     * @param dataL
     */
    public void addFirst(T dataL) {
        Nodo<T> n = new Nodo(dataL);
        if (isEmpty()) {
            this.head = n;
            this.tail = n;
            this.head.setNext(this.tail);
            this.tail.setNext(null);
        } else {
            n.setNext(this.head);
            this.head = n;
        }
    }
    
    /**
     *
     * @param dataL
     */
    public void addLast(T dataL) {
        Nodo<T> n = new Nodo(dataL);
        if (isEmpty()) {
            this.head = n;
            this.tail = n;

        }else{
            this.tail.setNext(n);
            this.tail = n;
        }
    }
    
    public void add(T dataL, int i) {
        if (isEmpty() || i == 0) {
            this.addFirst(dataL);
        } else if (i >= (size() - 1)) {
            this.addLast(dataL);
        } else if (i < 0) {
            this.add(dataL, size() + i);
        } else {
            Nodo<T> n = new Nodo(dataL);
            Nodo aux = this.head; 
            int count = 0;
            while (count < i - 1) {
                aux = aux.getNext();
                count++;
            }
            n.setNext(aux.getNext());
            aux.setNext(n);
        } 
    }
    
    public T deleteFirst(){
        if (isEmpty()) {
            return null;
        }else if(size() == 1){
            this.head = null;
            this.tail = null;
            return null;
        }else{
        Nodo<T> temp = this.head;
        this.head = this.head.getNext();
        temp.setNext(null);
        return temp.getData();
        }
    }
    
    public T deleteLast() {
        if (isEmpty()) {
            return null;
        }
        Nodo<T> pre = this.head;
        while (pre.getNext().getNext() != null) {
            pre = pre.getNext();
        }
        Nodo<T> temp = pre.getNext();
        pre.setNext(null);
        this.tail = pre;
        temp.setNext(null);
        return temp.getData();
    }
    
    public T delete(int i){
        if (isEmpty()) {
            return null;
        } else if (i == 0) {
            return deleteFirst();
        } else if (i == size() - 1) {
            return deleteLast();
        } else if (i < 0) {
            return delete(size() + i);
        } else if (i > size() - 1) {
            System.out.println("\nNo Funciona");
            return null;
        } else {
            Nodo<T> aux = this.head;
            int count = 0;
            while (count < i - 1) {
                aux = aux.getNext();
                count++;
            }
            Nodo<T> del = aux.getNext();
            aux.setNext(del.getNext());
            del.setNext(null);
            return del.getData();
        }
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Lista Vacia");
        } else {
            Nodo aux = this.head;
            int i = 0;
            while (aux != null) {
                System.out.print(aux.getData() );
                aux = aux.getNext();
                i++;
            }
            System.out.println("");
        }
    }
    
    /**
     *
     * @param dato
     * @return
     */
    public boolean buscar(T dato){
        Nodo aux = this.head;
        
        while(aux != null){
            if(aux.getData().toString().equals(dato.toString())){
               return true;
            }
        }
        return false;
    }
   
}
