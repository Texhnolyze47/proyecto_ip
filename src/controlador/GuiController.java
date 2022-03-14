package controlador;

import logica.*;
import vista.*;

public class GuiController {
	public static GuiGenerador frame = new GuiGenerador();

	public static void mostrar() {
		frame.setVisible(true);
	}

	public static void boton() {
		String ip = GenedorIp.ipAleatoria();
		String name = GenedorIp.nombres();
		frame.getTextAreaResultado().append(ip + "\n");
		PcDao pcDao = new PcDao();
		Pc pc = new Pc(name, ip);
		pcDao.agregarIp(pc);
	}
}
