import java.util.Scanner;
public class Algoritmo {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa el primer numero ");
        int A = sc.nextInt();
        System.out.println("Ingresa el segundo numero ");
        int B = sc.nextInt();
        System.out.println("Ingresa el tercer numero ");
        int C = sc.nextInt();
        if(A < B && A < C){
        System.out.println("El numero menor es " + A);
        }else{
            if(B < A && B < C){
            System.out.println("El numero menor es " + B);
            }else{
            System.out.println("El numero menor es " + C);
        if(A > B && A > C){
        System.out.println("El numero mayor es " + A);
        }else{
            if(B > A && B > C){
            System.out.println("El numero mayor es " + B);
            }else{
            System.out.println("El numero mayor es " + C);
        
                }
            }
        }
    }
}
}