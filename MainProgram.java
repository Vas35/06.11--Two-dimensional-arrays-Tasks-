package ua.univer.task;

public class MainProgram {

	public static void main(String[] args) {
//Task1
		/* 1. Вывести все положительные елементы; */

		int[][] mat = new int[3][6];
		MethodLib.fillRandMatrix(mat);
		MethodLib.positiveMatrix(mat);

		// Task2
		/*
		 * 2. Вывести количество строк, не содержащих ни одного нулевого элемента;
		 */

		MethodLib.fillRandMatrix(mat);
		MethodLib.countLineMatrix(mat);

		// Task3
		/*
		 * 3. Вывести номера столбцов, содержащих хотя бы один нулевой элемент;
		 */
		MethodLib.fillRandMatrix(mat);
		MethodLib.numbOfPoleMat(mat);

		// Task4
		/*
		 * 4. Вывести количество строк и номера строк в которых есть отрицательные
		 * елементы.
		 */

		MethodLib.fillRandMatrix(mat);
		MethodLib.countNumbOfLine(mat);

		// Task5
		/*
		 * 5. Вывести максимальное из чисел, встречающихся в заданной матрице более
		 * одного раза.
		 */
		MethodLib.fillRandMatrix(mat);
		MethodLib.maxNumbOfMatrix(mat);
		// Task6
		/*
		 * 6. Вывести номер строки, в которой находится самая длинная серия одинаковых
		 * элементов.
		 */

		MethodLib.fillRandMatrix(mat);
		int sum = 0;
		int[] sumRow = new int[mat.length];
		for (int i = 0; i < mat.length; i++) {
			sum = MethodLib.getMaxCount(mat[i]);
			sumRow[i] = sum;
			System.out.println(" row " + i + " = " + sum);
		}

		// Task7
		/*
		 * 7. Характеристикой строки целочисленной матрицы назовем сумму ее
		 * положительных четных элементов. Переставляя строки заданной матрицы,
		 * расположить их в соответствии с ростом характеристик.
		 */

		MethodLib.fillRandMatrix(mat);
		MethodLib.sortRowBySumPositiveEvenNumb(mat);

	}
}