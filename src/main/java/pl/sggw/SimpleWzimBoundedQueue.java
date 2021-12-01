package pl.sggw;

import java.util.LinkedList;

public class SimpleWzimBoundedQueue<E> implements WzimBoundedQueue<E> {

    E[] array;
    int cap;
    int Size = 0;

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
            if(array[i] == null) {array[i] = e; pom = true; break;}
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
        E pom_zm = array[0];
        array[0] = null;
        Size--;
        return pom_zm;
    }

    public E poll()
    {
        if(Size > 0)
        {
            E pom_zm = array[0];
            array[0] = null;
            Size--;
            return pom_zm;
        }
        else return null;
    }

    public E element() throws IndexOutOfBoundsException{
        if(Size > 0) return array[0];
        return null;
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
