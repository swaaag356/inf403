//package lab14;
//
//public class Matrix {
//    private double[][] components;
//
//    public Matrix(double[][] components) {
//        this.components = components;
//    }
//
//    public Matrix(LAVector[] rows) {
//        components = new double[rows.length][rows[0].length()];
//        for (int i = 0; i < rows.length; ++i) {
//            for (int j = 0; j < rows[0].length(); ++j) {
//                components[i][j] = rows[i].getComponent(j);
//            }
//        }
//    }
//
//    public Matrix(int rows, int columns) {
//        components = new double[rows][columns];
//        for (int i = 0; i < rows; ++i) {
//            for (int j = 0; j < columns; ++j) {
//                components[i][j] = components[i][j];
//            }
//        }
//    }
//
//    public Matrix(int size, double diagElement) {
//        components = new double[size][size];
//        for (int i = 0; i < size; ++i) {
//            components[i][i] = diagElement;
//        }
//    }
//
//    public int rows() {
//        return this.components.length;
//    }
//
//    public int columns() {
//        return this.components[0].length;
//    }
//
//    public double det(Matrix matrix) {
//        double det = 1;
//        for (int i = 0; i < matrix.rows(); ++i) {
//
//        }
//        return det;
//    }
//
//    public double detFor2(Matrix matrix) {
//        return matrix.components[0][0] * matrix.components[1][1] - matrix.components[0][1] * matrix.components[1][0];
//    }
//
//    public double decomposition(int x, int y) {
//        Matrix decompositionMatrix = new Matrix(this.rows() - 1, this.columns() - 1);
//        if (this.rows())
//        for (int i = 0; i < this.rows() - 1; ++i) {
//            for (int j = 0; j < this.columns() - 1; ++j) {
//                if (y != i && x != j) {
//                    decompositionMatrix.components[i][j] = this.components[i][j];
//                }
//            }
//        }
//        return decompositionMatrix;
//    }
//
//    public LAVector multRVector(LAVector vector) {
//        return null;
//    }
//
//    public LAVector multLVector(LAVector vector) {
//        return null;
//    }
//
//    public Matrix transp() {
//        Matrix transpmatrix = new Matrix(this.columns(), this.rows());
//        for (int i = 0; i < this.rows(); ++i) {
//            for (int j = 0; j < this.columns(); ++j) {
//                transpmatrix.components[j][i] = this.components[i][j];
//            }
//        }
//
//        return transpmatrix;
//    }
//
//    public String toString() {
//        return "";
//    }
//}