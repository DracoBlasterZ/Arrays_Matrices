import javax.swing.JOptionPane;

public class Ex9_Arrays {

	public static void main(String[] args) {
		String arrayNum=JOptionPane.showInputDialog("Introduzca el numero");
		int arrNum=Integer.parseInt(arrayNum);
		int arrayListBase[]=setRandomValue(arrNum);
		showSumArray(arrayListBase,arrNum);

	}
	public static int[] setRandomValue(int num)
	{
		int faArray[]=new int[num];
		for(int i=0;i<num;i++)
		{
			faArray[i]=(int) (Math.random()*9+0);

		}
		return faArray;
	}
	public static void showSumArray(int[] araArray, int num)
	{
		int sum=0;
		for(int i=0;i<num;i++)
		{
			System.out.println(araArray[i]);
			sum = sum+araArray[i];
		}
		JOptionPane.showMessageDialog(null, "La suma de todo el array es "+sum);
	}

}
