import javax.swing.JOptionPane;

public class Ex12_Arrays {

	public static void main(String[] args) {
		String arrayNum=JOptionPane.showInputDialog("Introduzca la cantidad de numeros a generar");
		int arrNum=Integer.parseInt(arrayNum);
		int checkNum=validNumArr();
		int arrNumArr[]=setRandomValue(arrNum);
		int checkNumArr=checkifValid(arrNumArr,checkNum,arrNum);
		int arrCuan[]=fillNumArr(arrNumArr,arrNum,arrNum,checkNumArr);
		
		printArr(arrCuan,checkNumArr);
	}
	public static int validNumArr()
		{
			int numSe=1;
			boolean notvalid=true;
			while(notvalid)
			{
				String numSi=JOptionPane.showInputDialog("Digame el digito a perseguir ");
				numSe=Integer.parseInt(numSi);
				if((numSe/10)<1)
				{
					notvalid=false;
				}
			}
			return numSe;	
		}
	public static int[] setRandomValue(int num)
		{
			int faArray[]=new int[num];
			for(int i=0;i<num;i++)
			{
				faArray[i]=primNum();
				
			}
			return faArray;
		}
	public static int primNum()
		{
			int numRan=0;
			numRan=(int) (Math.random()*300+1);
			return numRan;
		}
	public static int[] fillNumArr(int[] previusArr, int lengArr, int valCheck, int rLeng)
	{
		int numD=0;
		int fdArray[]=new int[rLeng];
		for(int i=0;i<lengArr;i++)
		{
			if((previusArr[i] % 10)==valCheck)
			{
				fdArray[numD]=previusArr[i];
				numD++;
			}
		}
		return fdArray;
	}
	public static int checkifValid(int[] numTo, int valCheck,int leng)
	{
		int numD=0;
		for(int i=0;i<leng;i++)
		{
			if((numTo[i] % 10)==valCheck)
			{
				numD++;
			}
		}
		
		return numD;
	}
		public static void printArr(int[] arrRead, int rLeng)
		{
			for(int i=0;i<rLeng;i++)
			{
				System.out.println("- "+arrRead[i]);
			}
		}
}

