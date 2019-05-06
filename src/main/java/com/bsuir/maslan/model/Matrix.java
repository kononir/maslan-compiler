package com.bsuir.maslan.model;

import com.bsuir.maslan.model.exception.MatrixException;

import java.util.Arrays;

public class Matrix {
    private int[][] array;
    private int rowNumber;
    private int columnNumber;

    public Matrix() {
        this.array = null;
        this.rowNumber = 0;
        this.columnNumber = 0;
    }

    public Matrix(int[][] array) {
        this.array = array;
        this.rowNumber = array.length;
        this.columnNumber = array[0].length;
    }

    public Matrix(int rowNumber, int columnNumber) {
        this.array = new int[rowNumber][columnNumber];
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
    }

    public Matrix(Matrix matrix) {
        this(matrix.array.clone());
    }

    public int get(int row, int col) {
        return array[row][col];
    }

    public void set(int row, int col, int val) {
        array[row][col] = val;
    }

    public int nrow() {
        return rowNumber;
    }

    public int ncol() {
        return columnNumber;
    }

    public Matrix plus(Matrix matrix) throws MatrixException {
        checkMatrixRowsAndColumnsNumber(matrix);

        Matrix resultMatrix = new Matrix(rowNumber,columnNumber);

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                resultMatrix.array[i][j] = this.array[i][j] + matrix.array[i][j];
            }
        }

        return resultMatrix;
    }

    public Matrix plus(int x) {
        Matrix resultMatrix = new Matrix(rowNumber, columnNumber);

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                resultMatrix.array[i][j] = this.array[i][j] + x;
            }
        }

        return resultMatrix;
    }

    public Matrix minus(Matrix matrix) throws MatrixException {
        checkMatrixRowsAndColumnsNumber(matrix);

        Matrix resultMatrix = new Matrix(rowNumber,columnNumber);

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                resultMatrix.array[i][j] = this.array[i][j] - matrix.array[i][j];
            }
        }

        return resultMatrix;
    }

    private void checkMatrixRowsAndColumnsNumber(Matrix matrix) throws MatrixException {
        if (this.rowNumber != matrix.rowNumber || this.columnNumber != matrix.columnNumber) {
            throw new MatrixException("Error: illegal matrix sizes");
        }
    }

    public Matrix minus(int x) {
        Matrix resultMatrix = new Matrix(rowNumber,columnNumber);
        for (int i = 0; i < rowNumber; i++)
            for (int j = 0; j < columnNumber; j++)
                resultMatrix.array[i][j] = this.array[i][j] - x;
        return resultMatrix;
    }

    public Matrix mult(Matrix matrix) throws MatrixException {
        checkEqualityOfRowsAndColumnsNumber(matrix);

        Matrix resultMatrix = new Matrix(this.rowNumber,matrix.columnNumber);
        for (int i = 0; i < resultMatrix.rowNumber; i++) {
            for (int j = 0; j < resultMatrix.columnNumber; j++) {
                for (int k = 0; k < this.columnNumber; k++) {
                    resultMatrix.array[i][j] += this.array[i][k] * matrix.array[k][j];
                }
            }
        }

        return resultMatrix;
    }

    private void checkEqualityOfRowsAndColumnsNumber(Matrix matrix) throws MatrixException {
        if (this.columnNumber != matrix.rowNumber) {
            throw new MatrixException("Error: illegal matrix sizes");
        }
    }

    public Matrix mult(int numb) {
        Matrix resultMatrix = new Matrix(this.rowNumber,this.columnNumber);
        for (int i = 0; i < resultMatrix.rowNumber; i++) {
            for (int j = 0; j < resultMatrix.columnNumber; j++) {
                resultMatrix.array[i][j] = this.array[i][j] * numb;
            }
        }

        return resultMatrix;
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

        Matrix matrix = (Matrix) o;
        return rowNumber == matrix.rowNumber &&
                columnNumber == matrix.columnNumber &&
                Arrays.equals(matrix.array, array);
    }

    @Override
    public int hashCode() {
        return 31 * rowNumber + columnNumber + Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        StringBuilder arrayRepresentation = new StringBuilder();
        for (int[] innerArray : array) {
            for (int value : innerArray) {
                arrayRepresentation.append(value).append(" ");
            }
            arrayRepresentation.append("\n");
        }

        return "Matrix {\n" +
                "array:\n" + arrayRepresentation.toString() +
                "rowNumber=" + rowNumber + "\n" +
                "columnNumber=" + columnNumber + "\n" +
                '}';
    }
}
