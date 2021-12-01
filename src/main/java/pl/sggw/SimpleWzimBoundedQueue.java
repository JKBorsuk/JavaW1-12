package pl.sggw;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class SimpleWzimBoundedQueue<E> implements WzimBoundedQueue<E> {

    E[] array;
    int cap;
    int Size = 0;
    int Lewa = 0;

    // .
    public SimpleWzimBoundedQueue(final int maxCapacity) {
        array = (E[]) new Object[maxCapacity];
        cap = maxCapacity;
    }

    public boolean add(final E e)
    {
        boolean pom = false;
        for(int i = 0; i<array.length; i++)
        {
            if(array[i] == null) {
                array[i] = e; pom = true; break;
            }
        }
        if(pom)
        {
            Size++;
            return pom;
        }
        else{
            throw new IllegalStateException();
        }
    }

    public boolean offer(final E e)
            throws IllegalStateException{
        boolean pom = false;
        for(int i = 0; i<array.length; i++)
        {
            if(array[i] == null) {array[i] = e; pom = true; break;}
        }
        if(pom)
        {
            Size++;
            return pom;
        }
        else{
            return false;
        }
    }

    public E remove()
    {
        if(Size > 0)
        {
            E pom_zm = array[Lewa];
            array[Lewa] = null;
            Size--;
            Lewa+= 1;
            return pom_zm;
        }
        else throw new NoSuchElementException();
    }

    public E poll()
    {
        if(Size > 0)
        {
            E pom_zm = array[Lewa];
            array[Lewa] = null;
            Size--;
            Lewa+= 1;
            return pom_zm;
        }
        else return null;
    }

    public E element()
    {
        if(Size > 0) return array[0];
        else{
            throw new NoSuchElementException();
        }
        //return null;
    }

    public E peek()
    {
        if(Size > 0) return array[0];
        else return null;
    }

    /**
     *
     * @return current size
     */
    public int size()
    {
        return Size;
    }

    /**
     *
     * @return maximum number of elements that this queue can hold
     */
    public int capacity()
    {
        return cap;
    }

}
