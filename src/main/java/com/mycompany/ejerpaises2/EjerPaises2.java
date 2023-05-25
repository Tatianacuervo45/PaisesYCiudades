
package com.mycompany.ejerpaises2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class EjerPaises2 {

   
    String pais, ciudad;
    HashMap<String, ArrayList<String>> mapPaises = new HashMap<String, ArrayList<String>>();
    ArrayList<String> listCiudades;
    
    
    
    String result="";
      String menu="";
      public  EjerPaises2(){
          Procesos();
      }
    
    public void Procesos() {
		System.out.println("Entra");
		
		menu="OPCIONES\n";
		menu+="1. Registrar paises\n";
		menu+="2. registrar ciudades\n";
		menu+="3. Imprimir Lista\n";
		menu+="4. Salir\n\n";
    
    int opc=0;
		do {
	opc=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			validarMenu(opc);
			
		} while (opc!=4);	
}
        
    public void validarMenu(int cod) {
		
	       switch (cod) {
            case 1:
                registarPais();
            break;
                case 2:
                    ingresarCiudades();
            break;
                case 3:
                    imprimirMapa();
            break;
    default:
       System.out.println("ff");
} }
    
   public void ingresarCiudades() {
    String nose = "";
  
    do {
        listCiudades  = new ArrayList<>();
        String ciudad = JOptionPane.showInputDialog("Ingrese la ciudad");
        nose = JOptionPane.showInputDialog("Ingrese: \nsi para continuar con otra ciudad ");
        listCiudades.add(ciudad);
    } while (nose.equalsIgnoreCase("si"));
    mapPaises.put(pais, listCiudades);
}

    public void registarPais(){
        pais=JOptionPane.showInputDialog("Ingrese el pais");
    }
    
    public void guardarDatos(ArrayList<String> listaPaises) {
		mapPaises.put(listaPaises.get(0), listaPaises);
		JOptionPane.showMessageDialog(null, "nnn");
	}
    public int getSizeMap() {
		
		return mapPaises.size();
	}
    
    public void imprimirMapa() {
		Iterator<String> itera=mapPaises.keySet().iterator();
		String valor;
		while (itera.hasNext()) {
			valor =itera.next();
			System.out.println(valor + " - "+mapPaises.get(valor));
		}
}
}
