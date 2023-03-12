import javax.swing.JOptionPane;

public class Ex3_Arrays {

	public static void main(String[] args) {
		String numOf=JOptionPane.showInputDialog("Introduzca un numero");
		int numPri=Integer.parseInt(numOf);
		
		boolean check= prim(numPri);
		if(check)
			JOptionPane.showMessageDialog(null,"El numero no era primero");
		else
			JOptionPane.showMessageDialog(null,"El numero era primero");

	}
	public static boolean prim(int numP)
	{
		if(numP==0||numP==1||numP==4)
			return true;
		for(int i=2; i<(numP/2);i++)
		{
			if((numP%i)==0)
			{
				return true;
			}
			
		}
		return false;
	}

}
