import java.util.Random;
import java.io.Console;

public class Utils
{
	public static final Random generator = new Random();
	public static final Console console = System.console();
	public static final String NEW_LINE = System.getProperty("line.separator");

	public static void horizontalFlip(int lines, int columns, int[] transformedBoard) {
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

/*	public static void horizontalFlip(int lines, int columns, int[] transformedBoard)
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
	}*/

	public static void verticalFlip(int lines, int columns, int[] transformedBoard) {
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

/*	public static void verticalFlip(int lines, int columns, int[] transformedBoard)
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
	}*/

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
}
