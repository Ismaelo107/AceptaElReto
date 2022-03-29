import java.util.Scanner;

public class P120 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        int lado,num;
        int[][] matriz ;


        while (!correcto) {
            System.out.println("Introducir número de lados:");
            lado = sc.nextInt();
            num = sc.nextInt();
            

            if (lado % 2 != 0 && lado >=1 && lado <100) {
                correcto = true;
                matriz = new int[lado][lado];

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length; j++) {
                        matriz [i][0]= 5 ;
                    }
                }

                for (int i = 0; i < matriz.length; i++) {
                    System.out.println();

                    for (int j = 0; j < matriz.length; j++) {
                        System.out.print(matriz[j][i]);
                    }

                    if (num>i){
                        for (int j = 0; j < matriz.length; j++) {

                        }
                    }
                }
                















            } else {
                System.out.println("Tiene que ser impar");
            }
        }

    }
}

