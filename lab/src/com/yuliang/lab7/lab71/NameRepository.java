package com.yuliang.lab7.lab71;

public class NameRepository implements Aggregate{
    private char[][] names = {{'R','o','b'}, {'J','o', 'n'} ,{'J','u','l'} , {'L','o','r'}, {'P','a','t'},
            {'_','e','n'}};

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

            while(hasNext()) {
                if(names[index][0] != '_') {
                    return names[index++];
                }
            }

            return null;
        }
    }

    public static void main(String[] args) {
        Iterator iterator = new NameRepository().getIterator();
        while (iterator.hasNext()) {
            char[] next = (char[]) iterator.next();
            for (char c : next) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
