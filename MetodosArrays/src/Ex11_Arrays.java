import javax.swing.JOptionPane;

public class Ex11_Arrays {
	public static void main(String[] args) {
		String arrayNum=JOptionPane.showInputDialog("Introduzca la largaria del array");
		int arrNum=Integer.parseInt(arrayNum);
		int arrayListBase[]=setRandomValue(arrNum);
		int reverseArray[]=setRandomOrder(arrayListBase,arrNum);
		printArr(arrayListBase,reverseArray,arrNum);
		

	}
	public static int[] setRandomValue(int num)
	{
		int faArray[]=new int[num];
		for(int i=0;i<num;i++)
		{
			faArray[i]=primNum(6,20);
			
		}
		return faArray;
	}
	public static int primNum(int minNu,int maxNu)
	{
		int numRan=(int) (Math.random()*maxNu+minNu);
		return numRan;
	}
	public static int[] setRandomOrder(int[] arrRef,int numArr)
	{
		int faArray[]=new int[numArr];
		for(int i=0;i<numArr;i++)
		{
			int numRan=(int) (Math.random()*numArr);
			faArray[i]= arrRef[numRan];
			
		}
		return faArray;
	}
	public static void printArr(int[] arrRan, int[] arrOrder, int numArr)
	{
		for(int i=0;i<numArr;i++)
		{
			System.out.println("EL numero de los arrays "+i+" son "+arrRan[i]+" y "+arrOrder[i]+" , su multiplicacion es "+(arrRan[i]*arrOrder[i]));
		}
	}
}
