package lab3_excepciones2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JOptionPane;

import Excepciones.MiExcepcion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> listPersona= new ArrayList<Persona>();
		cargarElementos(listPersona);
		try {
		String nomb= JOptionPane.showInputDialog("Ingrese un nombre: ");
		verificarNombre(nomb,listPersona);
		}
		catch(MiExcepcion ee) {
			JOptionPane.showMessageDialog(null, ee);
		}
		
		

	}
	
	public static void cargarElementos(ArrayList<Persona> listaPersonas) {
		String[] nombres= {"Juan","Carlos","Nelson","Lucas","Julian"};
		String[] apellidos= {"Sanchez","Martinez","Gonzalez","Millan","Fernandez"};
		Random rnd= new Random();
		String mostrar="";
		for(int i=0;i<20;i++) {
			String nombre= nombres[rnd.nextInt(nombres.length)];
			String apellido= apellidos[rnd.nextInt(apellidos.length)];
			Integer dni= rnd.nextInt(10000000)*30000000;
			listaPersonas.add(new Persona(nombre, apellido, dni));
			mostrar += "\n "+ apellido + " " + nombre;
		}
		JOptionPane.showMessageDialog(null,mostrar);
	}
	
	public static void verificarNombre(String nombre, ArrayList<Persona>personas) throws MiExcepcion {
		Iterator<Persona> iterator= personas.iterator();
		boolean encontrado= false;
		if(nombre!= null) {
			while(iterator.hasNext()) {
				Persona nuevaPersona= iterator.next();
				if(nuevaPersona.getNombre().equals(nombre)) {
					encontrado=true;
					JOptionPane.showMessageDialog(null, "Nombre encontrado en la lista: "+ nuevaPersona.getApellido()+ " "+nuevaPersona.getNombre());
				}
			}
		}
		if(!encontrado) {
			throw new MiExcepcion();
		}
	}

}
