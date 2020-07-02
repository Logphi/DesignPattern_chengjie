package com.ttl.designpattern.ch20;

/**
 * @ClassName ConcreteAggregate
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 11:18
 * Version 1.0
 **/
public class ConcreteAggregate implements Aggregate {

    private Object[] items;

    public ConcreteAggregate(int capacity, Object... params) {
        items = new Object[capacity];
        for (int i = 0; i < capacity; i++) {
            items[i] = params[i];
        }
    }

    @Override
    public Iterator createIterator() {
        return new Iterator() {
            private int current = -1;

            @Override
            public Object first() {
                return items[0];
            }

            @Override
            public Object next() {
                if (current >= items.length) {
                    throw new RuntimeException("超出集合范围");
                }
                current++;
                return items[current];
            }

            @Override
            public boolean hasNext() {
                return current < items.length - 1;
            }

            @Override
            public Object currentItem() {
                return items[current];
            }
        };
    }
}
