package com.yuliang.lab7.lab71;

public class NameRepositoryOld implements Aggregate{
    private String names[] = {"Rob" , "Jon" ,"Jul" , "Lor", "Pat",
            "Ken"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length) return true;
            return false;
        }

        @Override
        public Object next() {
            if(hasNext()) {
                return names[index++];
            } else {
                return null;
            }
        }
    }
}
