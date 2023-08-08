package pucese.com.listas;

import java.util.Scanner;

public class AppEstudiante {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Scanner leer = new Scanner(System.in);
			Estudiante E1= new Estudiante();
			System.out.println("Ingresa su nombre ");
				E1.setNombre(leer.next());
				System.out.println("Ingresa su cedula ");
				E1.setCedula(leer.nextInt());
				System.out.println("Ingresa su ultimas 3 notas ");
				E1.setNota1(leer.nextInt());
				E1.setNota2(leer.nextInt());
				E1.setNota3(leer.nextInt());
			 SimpleLinkedList<Estudiante> e = new SimpleLinkedList<>();
			 e.addFirst(E1);
			 
				double promedio=(E1.getNota1()+E1.getNota2()+E1.getNota3())/3;
				System.out.println("El promedio de nota es: "+ promedio);
				
			 }
	

	}


