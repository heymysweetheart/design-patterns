package com.yuliang.lab3.lab32;

public class SynchronizationProxy implements ITable{

    Table table;

    @Override
    public int numOfRows() {
        return table.numOfRows();
    }

    @Override
    public IRow getRow(int rowNum) {
        return table.getRow(rowNum);
    }

    @Override
    public void addRow(IRow row, int rowNum) {
        synchronized (row) {
            table.addRow(row, rowNum);
        }
    }

    @Override
    public void modifyRow(int rowNum, IRow row) {
        synchronized (row) {
            table.modifyRow(rowNum, row);
        }
    }

    @Override
    public void deleteRow(int rowNum) {
        IRow row = table.getRow(rowNum);
        synchronized (row) {
            table.deleteRow(rowNum);
        }
    }
}
