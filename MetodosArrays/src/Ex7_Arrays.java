import javax.swing.JOptionPane;

public class Ex7_Arrays {
	public static void main(String[] args) {
		String euroOf=JOptionPane.showInputDialog("Introduzca la cantidad a convertir");
		double euroCoin=Double.parseDouble(euroOf);
		String divOf=JOptionPane.showInputDialog("Divisa a cambiar");
		
		ChangeValue(euroCoin, divOf);
	}
	public static void ChangeValue(double euro, String divis)
	{
		double canvioDiv=0;
		switch(divis)
		{	
		case "Libra":
			canvioDiv= euro*0.86;
			JOptionPane.showMessageDialog(null,"Cambio realizado tienes "+canvioDiv+" "+divis);
			break;
		case "Dolar":
			canvioDiv= euro*1.28611;
			JOptionPane.showMessageDialog(null,"Cambio realizado tienes "+canvioDiv+" "+divis);
			break;
		case "Yenes":
			canvioDiv= euro*129.852;
			JOptionPane.showMessageDialog(null,"Cambio realizado tienes "+canvioDiv+" "+divis);
			break;
			default:
				JOptionPane.showMessageDialog(null,"No se ha podido realizar el cambio");
			
		}
		
	}
}
