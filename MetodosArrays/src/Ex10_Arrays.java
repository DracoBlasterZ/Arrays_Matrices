import javax.swing.JOptionPane;

public class Ex10_Arrays {

	public static void main(String[] args) {
		String arrayNum=JOptionPane.showInputDialog("Introduzca la cantidad de numeros a generar");
		int arrNum=Integer.parseInt(arrayNum);
		String minNumOf=JOptionPane.showInputDialog("Introduzca el numero minimo");
		int minNum=Integer.parseInt(minNumOf);
		String maxNumOf=JOptionPane.showInputDialog("Introduzca el numero maximo");
		int maxNum=Integer.parseInt(maxNumOf);
		int arrayListBase[]=setRandomValue(arrNum,minNum,maxNum);
		showSumArray(arrayListBase,arrNum);

	}
	public static int[] setRandomValue(int num, int min, int max)
	{
		int faArray[]=new int[num];
		for(int i=0;i<num;i++)
		{
			faArray[i]=primNum(min,max);
			
		}
		return faArray;
	}
	public static int primNum(int minNu,int maxNu)
	{
		int numRan=0;
		boolean itsPrim=false;
		while(!itsPrim)
		{
			numRan=(int) (Math.random()*maxNu+minNu);
			itsPrim=checkPrim(numRan);
		}
		return numRan;
	}
	public static boolean checkPrim(int numCheck)
	{
		if(numCheck==0||numCheck==1||numCheck==4)
			return false;
		for(int i=2; i<(numCheck/2);i++)
		{
			if((numCheck%i)==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void showSumArray(int[] araArray, int num)
	{
		int sum=0;
		for(int i=0;i<num;i++)
		{
			if(araArray[i]>sum)
			{
				sum=araArray[i];
			}
		}
		System.out.println("El numero mas grande generado es "+sum);
	}

}
