package com.bsuir.maslan.model;

import com.bsuir.maslan.model.exception.VectorException;

import java.util.Arrays;

public class Vector {
    private int[] array;
    private int length;

    public Vector() {
        this.array = null;
        this.length = 0;
    }

    public Vector(int[] array) {
        this.array = array;
        this.length = array.length;
    }

    public Vector(int length) {
        this.array = new int[length];
        this.length = length;
    }

    public void set(int row, int val) {
        array[row] = val;
    }

    public int get(int row) {
        return array[row];
    }

    public void insert(int val) {
        array = Arrays.copyOf(array, length + 1);
        array[length] = val;
        length++;
    }

    public int remove() {
        length--;
        int value = array[length];
        array = Arrays.copyOf(array, length);
        return value;
    }

    public int len() {
        return this.length;
    }

    public Vector plus(Vector vector) throws VectorException {
        checkVectorLength(vector);

        Vector resultVector = new Vector(array.length);
        for (int i = 0; i < resultVector.length; i++) {
            resultVector.array[i] = array[i] + vector.array[i];
        }

        return resultVector;
    }

    public Vector plus(int x) {
        Vector resultVector = new Vector(array.length);
        for (int i = 0; i < resultVector.length; i++) {
            resultVector.array[i] = array[i] + x;
        }

        return resultVector;
    }

    public Vector minus(Vector vector) throws VectorException {
        checkVectorLength(vector);

        Vector resultVector = new Vector(array.length);
        for (int i = 0; i < resultVector.length; i++) {
            resultVector.array[i] = array[i] - vector.array[i];
        }

        return resultVector;
    }

    public Vector minus(int x) {
        Vector resultVector = new Vector(array.length);
        for (int i = 0; i < resultVector.length; i++)
            resultVector.array[i] = array[i] - x;

        return resultVector;
    }

    public int mult(Vector vector) throws VectorException {
        checkVectorLength(vector);

        int resultNumber = 0;
        for (int i = 0; i < array.length; i++) {
            resultNumber += array[i] * vector.array[i];
        }

        return resultNumber;
    }

    public Vector mult(int numb) {
        Vector resultVector = new Vector(array.length);
        for (int i = 0; i < resultVector.length; i++) {
            resultVector.array[i] = array[i] * numb;
        }

        return resultVector;
    }

    private void checkVectorLength(Vector vector) throws VectorException {
        if (this.array.length != vector.array.length) {
            throw new VectorException("Error: illegal vectors sizes.");
        }
    }

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Vector vector = (Vector) o;
        return length == vector.length &&
                Arrays.equals(array, vector.array);
    }

    @Override
    public int hashCode() {
        return 31 * length + Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "Vector {\n" +
                "array:\n" + Arrays.toString(array) + "\n" +
                "length=" + length + "\n" +
                '}';
    }
}
