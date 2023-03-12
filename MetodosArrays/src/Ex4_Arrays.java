import javax.swing.JOptionPane;

public class Ex4_Arrays {
	public static void main(String[] args) {
		String numOf=JOptionPane.showInputDialog("Introduzca un numero");
		int numMult=Integer.parseInt(numOf);
		int respuesta=Respu(numMult) ;
		JOptionPane.showMessageDialog(null,"La factorial es "+respuesta);
		
		
	}
	public static int Respu(int nunMM)
	{
		int total=1;
		for(int i=nunMM;i>0;i--)
		{
			total=total *i;
		}
		return total;
	}

}
