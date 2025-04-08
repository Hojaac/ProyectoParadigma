package co.edu.poli.paradigmas.tc.presentacion;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;


import co.edu.poli.paradigmas.tc.entities.Email;
import co.edu.poli.paradigmas.tc.entities.Persona;
import co.edu.poli.paradigmas.tc.entities.Telefono;
import co.edu.poli.paradigmas.tc.entities.TipoDocumento;
import co.edu.poli.paradigmas.tc.negocio.PersonaManager;
import co.edu.poli.paradigmas.tc.negocio.TelefonoManager;
import co.edu.poli.paradigmas.tc.negocio.TipoDocumentoManager;

public class Presentacion {
	dfgdgdggd
	
	
	private static List<Persona> miAgenda;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opLista = 1;
		int idTipoDoc=0;
		String nomTD="", nombre="", apellido ="";
		TipoDocumento myTipoDoc=null;
		Long numDoc=0L;
		miAgenda = new ArrayList<Persona>();
		System.out.println("Hola, bienvenido!");
		do {
		System.out.println("vamos a crear una persona");
		int datoCorrecto = 0;
		do {
			
		try {
			datoCorrecto = 0;
		System.out.println("digite el id del tipo documento");
		idTipoDoc = sc.nextInt();
		sc.nextLine();
		System.out.println("digite el nombre del tipo de documento");
		nomTD = sc.next();
		sc.nextLine();
		myTipoDoc = TipoDocumentoManager.crearActualizarTipoDoc(idTipoDoc, nomTD);
		System.out.println("digite el numero de documento");
		numDoc = sc.nextLong();
		sc.nextLine();
		System.out.println("digite el nombre");
		nombre = sc.next();
		sc.nextLine();
		System.out.println("Digite el apellido");
		apellido = sc.next();
		sc.nextLine();
		}catch(InputMismatchException e) {
			System.out.println("Tipo de dato no válido");
			datoCorrecto = 1;
		}
		}while(datoCorrecto == 1);
		List<Telefono> misT = new ArrayList<Telefono>();
		int op = 1;
		System.out.println("Vamos a agregar Telefonos");
		boolean flag;
		do {
			flag = true;
			try {
			System.out.println("digite el id del telefono");
			int idTel = sc.nextInt();
			System.out.println("digite el número del telefono");
			String numeroTelefono = sc.next();
			Telefono miTel = TelefonoManager.crearActualizarTelefono(idTel, numeroTelefono);
			misT.add(miTel);
			System.out.println("Desea agregar otro teléfono? digite 0 para terminar");
			op = sc.nextInt();
			sc.nextLine();
			}catch(InputMismatchException e) {
				flag = false;
				System.out.println("Valor inválido, intente de nuevo");
			}
		}while(op!=0 && flag);
		
		int opE = 1;
		List<Email> misE = new ArrayList<Email>();
		System.out.println("Vamos a agregar emails");
		boolean flagE;
		do {
			flagE = true;
			try {
			System.out.println("digite el id del email");
			int idEmail = sc.nextInt();
			System.out.println("Digite el correo");
			String correo = sc.next();
			Email miEmail =  new Email(idEmail, correo);
			misE.add(miEmail);
			System.out.println("Desea agregar otro email? digite 0 para terminar");
			opE = sc.nextInt();
			sc.nextLine();
			}catch(InputMismatchException e) {
				flagE = false;
				System.out.println("Valor inválido, intente de nuevo");
			}
		}while(opE != 0 && flagE);
		new PersonaManager();
		Persona miP = PersonaManager.crearActualizarPersona(misE, misT, myTipoDoc, numDoc, nombre, apellido);
		
		System.out.println("los valores ingresados son "+miP.toString());
		miAgenda.add(miP);
		System.out.println("Desea agregar otro usuario? digite 0 para terminar");
		opLista = sc.nextInt();
		}while(opLista != 0);
		sc.nextLine();
		System.out.println("Ver Lista de Personas agregadas");
		for(Persona p:miAgenda) {
			System.out.println(p.toString());
			
			System.out.println("");
		}
	}

}
