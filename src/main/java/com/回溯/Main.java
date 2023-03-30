package com.回溯;

public class Main {
    public static void main(String[] args) {
        _51_N皇后 queen = new _51_N皇后();
        queen.solveNQueens(4);
        System.out.println("queen.list = " + queen.list);
    }
}
