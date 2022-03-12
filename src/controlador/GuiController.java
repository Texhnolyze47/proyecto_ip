package controlador;


import logica.GenedorIp;
import vista.*;

public class GuiController {
	 public static GuiGenerador frame = new GuiGenerador();
	 public static void mostrar() {frame.setVisible(true);}
	 
	 
	 public static void boton() {
		 
		 frame.getTextAreaResultado().append(GenedorIp.ipAleatoria()+"\n");
	 }
} 
