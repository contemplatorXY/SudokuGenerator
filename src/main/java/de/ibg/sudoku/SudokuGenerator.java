/*
 * Main Class for use sudoku.jar
 * Date: 01.06.2021
 * Author: Gerard Gaida
 */
package de.ibg.sudoku;

import de.ad.sudoku.Generator;
import de.ad.sudoku.Grid;

public class SudokuGenerator {
    /**
     * Number of empty Cells wired in code
     * @param args will not be used
     */
    public static void main(String[] args) {

        for (int k = 0; k < 100; k++) {

                 Grid sudoku = new Generator().generate(32);

                System.out.print("[");
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9 ; j++) {
                        int val = sudoku.getCell(i,j).getValue();
                        if (val == 0) {
                            System.out.print(" ;");
                        } else {
                            System.out.print(val + ";");
                        }

                    }
                }
                System.out.println("]");

        }
        Grid sudoku = new Generator().generate(32);
        System.out.println(sudoku.toString());

    }
}
