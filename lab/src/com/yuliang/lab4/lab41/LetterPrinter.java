package com.yuliang.lab4.lab41;

public abstract class LetterPrinter {
    public final void printCompleteLetter(char[][] letterArray) {
        SymmetryType symmetryType = getSymmetryType(letterArray);
        char[][] completeCharArray = reConstruct(letterArray, symmetryType);
        printLetter(completeCharArray);
    }

    protected abstract void printLetter(char[][] completeCharArray);

    protected abstract char[][] reConstruct(char[][] letterArray, SymmetryType symmetryType);

    public abstract SymmetryType getSymmetryType(char[][] letterArray);
}
