import javax.swing.JOptionPane;

public class Ex6_Arrays {

	public static void main(String[] args) {
		String numToBin=JOptionPane.showInputDialog("Introduzca el numero");
		int countNum=numLeng(numToBin);
		if(countNum==0)
		{
			JOptionPane.showMessageDialog(null, "No se ha podido contar porque era un numero negativo o no valido");
		}
		else
			JOptionPane.showMessageDialog(null,"Tenia una cantidad de "+countNum+" digitos");
	}
	public static int numLeng(String wordNum)
	{
		int numMult=Integer.parseInt(wordNum);
		if(numMult>0)
		{
			return wordNum.length();
		}
		else
			return 0;
	}

}
