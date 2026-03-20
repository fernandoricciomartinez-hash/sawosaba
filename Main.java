import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Usuario[] usuarios = crearUsuarios(2);

        for (Usuario u : usuarios) {
            System.out.println(u.nombre + " " + u.apellidos + " - " + u.email);
        }
    }

    public static Usuario[] crearUsuarios(int n) {
        Scanner sc = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[n];

        for (int i = 0; i < n; i++) {
            usuarios[i] = new Usuario();

            System.out.println("Usuario " + (i+1));
            System.out.print("Nombre: ");
            usuarios[i].nombre = sc.nextLine();

            System.out.print("Apellidos: ");
            usuarios[i].apellidos = sc.nextLine();

            System.out.print("Email: ");
            usuarios[i].email = sc.nextLine();
        }

        return usuarios;
    }
}