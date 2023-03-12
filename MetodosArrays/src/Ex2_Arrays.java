import javax.swing.JOptionPane;

public class Ex2_Arrays {

	public static void main(String[] args) {
		String numOf1=JOptionPane.showInputDialog("Introduzca el maximo");
		int valMax= Integer.parseInt(numOf1);
		String numOf2=JOptionPane.showInputDialog("Introduzca el minimo");
		int valMin= Integer.parseInt(numOf2);
		String numRep=JOptionPane.showInputDialog("Introduzca la cantidad de repeticiones");
		int repNum= Integer.parseInt(numRep);
		
		
		int numArray[]= new int[repNum];
		for(int i=0;i<repNum;i++)
		{
			numArray[i]=newNum(valMax,valMin);
			System.out.println(numArray[i]);
			
		}
		JOptionPane.showMessageDialog(null,"Mira la consola, fin del programa");

	}
	public static int newNum(int maxNum, int minNum)
	{
		double randomNum=(Math.floor(Math.random()*maxNum+minNum));
		int resul= (int) randomNum;
		
		return resul;
		
		
	}
	

}
