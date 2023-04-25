package strings;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//      As senhas podem estar alocadas no mesmo espaco de memoria

//        So serao diferentes se eu instanciar uma nova String como um objeto

        String x = new String("Ola mundo"); // 0012
        String y = new String("Ola mundo");// 0012

        String password = "1234"; //0010
        System.out.println("Digite a sua senha: ");
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        if(password == pass) {
            System.out.println(password.equals(pass));
        } else {
            System.out.println(password.equals(pass));
        }
    }
}
