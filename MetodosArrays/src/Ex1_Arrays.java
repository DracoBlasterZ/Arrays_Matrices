import javax.swing.JOptionPane;

public class Ex1_Arrays {

	public static void main(String[] args) {
		String figOf=JOptionPane.showInputDialog("Introduzca el nombre de su figura");
		
		switch(figOf) {
		
		case "Circulo":
			String radOf=JOptionPane.showInputDialog("Introduzca el radio");
			double circRad=Double.parseDouble(radOf);
			JOptionPane.showMessageDialog(null,"El area del circulo es "+circ(circRad));
			break;
		case "Triangulo":
			String baseOf=JOptionPane.showInputDialog("Introduzca la altura");
			double triBase=Double.parseDouble(baseOf);
			String altOf=JOptionPane.showInputDialog("Introduzca la base");
			double triAlt=Double.parseDouble(altOf);
			JOptionPane.showMessageDialog(null,"El area del triangulo es "+tri(triAlt,triBase));
			break;
		case "Cuadrado":
			String ladOf=JOptionPane.showInputDialog("Introduzca el lado");
			double quaLad=Double.parseDouble(ladOf);
			JOptionPane.showMessageDialog(null,"El area del cuadrado es "+quad(quaLad));
			break;
		default:
			JOptionPane.showMessageDialog(null,"La forma introducida no se ha encontrado");
		
			
		}

	}
	public static double circ(double rad) 
	{
		double resu=(Math.PI*(Math.pow(rad,2)));
		return resu;
	}
	public static double tri(double alt, double base) 
	{
		double resu=((alt*base)/2);
		return resu;
	}
	public static double quad(double lad) 
	{
		double resu=(Math.pow(lad,2));
		return resu;
	}

}
