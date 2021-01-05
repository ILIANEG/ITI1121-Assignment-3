import java.util.Random;
import java.io.Console;

public class test
{
	public static void oldhorizontalFlip(int lines, int columns, int[] transformedBoard) {
		int[] boardIndices = new int[lines * columns];
		int count = 0;
		for (int i = 0; i < lines*columns; i++) {
			boardIndices[i] = transformedBoard[i];
		}
		for (int i = lines - 1; i >= 0; i--) for (int j = 0; j < columns; j++)
		{
			transformedBoard[count++] = boardIndices[i * columns + j];
		}
	}

	public static void horizontalFlip(int lines, int columns, int[] transformedBoard)
	{
		int count = 0;
		for (int i = lines - 1; i >= 0; i--) for (int j = 0; j < columns; j++)
		{	
			int index = i * columns + j;
			if (count != index)
			{
				int tmp = transformedBoard[count];
				transformedBoard[count++] = transformedBoard[index];
				transformedBoard[index] = tmp;
			}
		}
	}

	public static void oldverticalFlip(int lines, int columns, int[] transformedBoard) {
		int[] boardIndices = new int[lines * columns];
		int count = 0;
		for (int i = 0; i < lines*columns; i++) {
			boardIndices[i] = transformedBoard[i];
		}
		for (int i = 0; i < lines; i++) for (int j = columns - 1; j >= 0; j--)
		{
			transformedBoard[count++] = boardIndices[i * columns + j];
		}
	}

	public static void verticalFlip(int lines, int columns, int[] transformedBoard)
	{
		int count = 0;
		for (int i = 0; i < lines; i++) for (int j = columns - 1; j >= 0; j--)
		{
			int index = i * columns + j;
			if (count != index)
			{
				int tmp = transformedBoard[count];
				transformedBoard[count++] = transformedBoard[index];
				transformedBoard[index] = tmp;
			}
		}
	}

	public static void rotate(int lines, int columns, int[] transformedBoard)
	{
		if (lines == columns)
		{
			int[] tmp = new int[lines*lines];
			for (int i = 0; i < lines*lines; i++) tmp[i] = transformedBoard[i];

			int count = 0;
			for (int i = 0; i < lines; i++) for (int j = lines - 1; j >= 0; j--)
			{
				transformedBoard[count++] = tmp[lines * j + i];
			}
		}

		else
		{
			horizontalFlip(lines, columns, transformedBoard);
			verticalFlip(lines, columns, transformedBoard);
		}
	}

	public static void main(String[] args)
	{
		int lines = Integer.parseInt(args[0]);
		int columns = Integer.parseInt(args[1]);
		int[] arr = new int[lines*columns];
		for (int i = 0; i < lines*columns; i++) arr[i] = i;

		int[] arroh = 

		System.out.println("arr:");
		for (int i = 0; i < lines * columns; i++)
		{
			if ((i+1) % columns == 0) System.out.println(arr[i]);
			else System.out.print(arr[i]);
		}

		System.out.println("oldhorizontalFlip:");
		for (int i = 0; i < lines * columns; i++)
		{
			if ((i+1) % columns == 0) System.out.println(oldhorizontalFlip(lines,columns,arr[i]));
			else System.out.print(oldhorizontalFlip[i]);
		}

		System.out.println("horizontalFlip:");
		for (int i = 0; i < lines * columns; i++)
		{
			if ((i+1) % columns == 0) System.out.println(horizontalFlip(lines,columns,arr[i]));
			else System.out.print(horizontalFlip[i]);
		}

		System.out.println("oldverticalFlip:");
		for (int i = 0; i < lines * columns; i++)
		{
			if ((i+1) % columns == 0) System.out.println(oldverticalFlip(lines,columns,(arr[i]));
			else System.out.print(oldverticalFlip[i]);
		}

		System.out.println("verticalFlip:");
		for (int i = 0; i < lines * columns; i++)
		{
			if ((i+1) % columns == 0) System.out.println(verticalFlip(lines,columns,arr[i]));
			else System.out.print(verticalFlip[i]);
		}

		System.out.println("rotate:");
		for (int i = 0; i < lines * columns; i++)
		{
			if ((i+1) % columns == 0) System.out.println(rotate(lines,columns,arr[i]));
			else System.out.print(rotate[i]);
		}
	}
}
