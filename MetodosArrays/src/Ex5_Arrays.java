import javax.swing.JOptionPane;

public class Ex5_Arrays {
	public static void main(String[] args) {
		String numToBin=JOptionPane.showInputDialog("Introduzca el radio");
		double numDec=Double.parseDouble(numToBin);
		JOptionPane.showMessageDialog(null, setOnBin(numDec));
	}
	public static String setOnBin(double DecToBin)
	{

		String binStrin= "";
		
		do {
			binStrin = DecToBin % 2 == 0 ? "0" + binStrin : "1" + binStrin;;
			DecToBin=DecToBin/2;
		}while(DecToBin>2);
		return binStrin;

	}
	
}
