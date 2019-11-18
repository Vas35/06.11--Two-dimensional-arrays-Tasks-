package ua.univer.task;

import java.util.Random;

public class MethodLib {
	// Task1
	public static void fillRandMatrix(int[][] matrix) {
		Random r = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = r.nextInt(8);
				System.out.print(matrix[i][j] + ",");
			}
			System.out.println();
		}
	}

	public static void positiveMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > 0) {
					System.out.print(matrix[i][j] + ", \n");
				}

			}

		}
	}

	// Task2
	public static void countLineMatrix(int[][] matrix) {
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			int temp = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0)
					temp++;

			}
			if (temp != 0)
				count++;
			System.out.println(count);
		}
		int line = matrix.length - count;
		System.out.println("Количество строк, не содержащих ни одного нулевого элемента = " + line);
	}

	// Task3

	public static void numbOfPoleMat(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {

				if (matrix[i][j] == 0) {

					System.out.println("Pole = " + j + ", ");
				}
			}
		}
	}

	// Task4
	public static void countNumbOfLine(int[][] matrix) {
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			int temp = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 0) {
					temp++;
				}
			}
			if (temp != 0) {
				count++;
				System.out.println("Номера строк в которых есть отрицательные елементы = " + i);
			}

		}

		System.out.println("Количество строк = " + count);
	}

	// Task5
	public static void maxNumbOfMatrix(int[][] matrix) {
		int max = 0;
		max = matrix[0][0];
		boolean flag = false;
		int count = 0;

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {

				if (max < matrix[i][j]) {
					max = matrix[i][j];
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == max) {
					count++;
				}
			}
		}
		do {
			if (count > 1) {
				flag = true;
			} else {
				max--;
				for (int i = 0; i < matrix.length; i++) {

					for (int j = 0; j < matrix[i].length; j++) {

						if (matrix[i][j] == max) {
							count++;
						}
					}
				}
			}
		} while (!flag);
		System.out.println(max);
	}

	// Task6
	public static int getMaxCount(int[] row) {
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < row.length - 1; i++) {
			if (row[i] == row[i + 1]) {
				count++;
			} else {
				if (maxCount < count)
					maxCount = count;
				count = 0;
			}
		}
		if (row.length > 2 && row[row.length - 1] == row[row.length - 2])
			if (maxCount < count)
				maxCount = count;

		return maxCount + 1;
	}

	// Task7
	public static void sortRowBySumPositiveEvenNumb(int[][] matrix) {
		int sum = 0;
		int[] row = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > 0 && matrix[i][j] % 2 == 0) {
					sum += matrix[i][j];
				}
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println("row " + i + " = " + sum);
			row[i] = sum;
		}
		int temp = 0;
		for (int i = 0; i < row.length; i++) {

			for (int j = 0; j < row.length - 1 - i; j++) {
				if (row[j] > row[j + 1]) {
					temp = row[j + 1];
					int[] refRow = matrix[j];

					row[j + 1] = row[j];
					matrix[j + 1] = matrix[j];

					row[j] = temp;
					matrix[j] = refRow;
				}

			}

		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println(" row = " + row[i]);
		}
	}
	// Task8

	public static int[] convertMatrixToArray(int[][] matrix) {
		int elementId = 0;
		int[] array = new int[matrix.length * matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				array[elementId] = matrix[i][j];
				elementId++;
			}
		}
		return array;
	}

}
