package Behavioural.Iterator.GnericIterator;

import java.util.ArrayList;
import java.util.List;

interface Iterator<T>
{
    boolean hasNext();
    T next();
}
interface Aggregator<T>
{
    void add(T item);            // ✅ added
    void remove(int index);
    public Iterator<T> createIterator();
}
class ConcreteAggregator<T> implements Aggregator<T>
{
    private List<T> items;
    public ConcreteAggregator(List<T> items)
    {
        this.items=items;
    }
    public ConcreteAggregator()
    {
        items= new ArrayList<T>();
    }
    @Override
    public Iterator<T> createIterator() {
        return new BookIterator<>();
    }
    public void add(T item)
    {
        items.add(item);
    }
    public void remove(int indx)
    {
        if(indx<items.size())
        {
            items.remove(indx);
        }
    }
    private class BookIterator<T> implements Iterator<T>
    {
        int cursor=0;
        @Override
        public boolean hasNext() {
            return cursor<items.size();
        }

        @Override
        public T next() {
            if(cursor<items.size())
                return (T) items.get(cursor++);
            return null;
        }
    }
}
public class GenericIteratorDemo {
    public static void main(String[] args) {
//        Aggregator<String> aggregator = new ConcreteAggregator<>();
//        Iterator<String> iterator = aggregator.createIterator();
//        aggregator.a
        Aggregator<String> aggregator = new ConcreteAggregator<>();
        aggregator.add("java");
        aggregator.add("springbbot");
        aggregator.add("python");
        aggregator.add("leetcode");
        aggregator.add("lld");
        aggregator.add("hld");


        Iterator<String> iterator = aggregator.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        }
    }

