import java.util.Scanner;
public class Operaciones{
    public static void main(String []args){
        Scanner ope = new Scanner(System.in);
        int numero1, numero2, resultado, respuesta;
        do{
            System.out.println("Que deseas hacer?\n1- SUMA  2- RESTA  3- MULTIPLICACION  4- DIVISION  5- SALIR");
            respuesta=ope.nextInt();
            switch (respuesta){
                case 1:
                    System.out.print("Digita el primer numero: ");
                    numero1 = ope.nextInt();
                    System.out.print("Digita el segundo numero: ");
                    numero2 = ope.nextInt();
                    resultado=numero1+numero2;
                    System.out.println("La SUMA es "+resultado);
                    break;
                case 2:
                    System.out.print("Digita el primer numero: ");
                    numero1 = ope.nextInt();
                    System.out.print("Digita el segundo numero: ");
                    numero2 = ope.nextInt();
                    resultado=numero1+numero2;
                    System.out.println("La RESTA es "+resultado);
                    break;
                case 3:
                    System.out.print("Digita el primer numero: ");
                    numero1 = ope.nextInt();
                    System.out.print("Digita el segundo numero: ");
                    numero2 = ope.nextInt();
                    resultado=numero1*numero2;
                    System.out.println("La MULTIPLICACION es "+resultado);
                    break;
                case 4:
                    System.out.print("Digita el primer numero: ");
                    numero1 = ope.nextInt();
                    System.out.print("Digita el segundo numero: ");
                    numero2 = ope.nextInt();
                    resultado=numero1/numero2;
                    System.out.println("La DIVISION es "+resultado);
                    break;
                case 5: System.exit(0);
                    break;

                default: System.out.println("Digita algo valido");
            }
        }while(true);
    }
}
