import javax.swing.JOptionPane;

public class Ex8_Arrays {
	public static void main(String[] args) {
		int valoresArr[]=insertValue(10);
		
		showValue(valoresArr);
		
	}
	public static int[] insertValue(int num)
	{
		int faArray[]=new int[10];
		for(int i=0;i<10;i++)
		{
			String numOf=JOptionPane.showInputDialog("Introduzca un numero");
			faArray[i]=Integer.parseInt(numOf);

		}
		return faArray;
		
	}
	public static void showValue(int lista[])
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(lista[i]);
		}
	}

}
