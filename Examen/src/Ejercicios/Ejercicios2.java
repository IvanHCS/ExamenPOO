package Ejercicios;
import java.util.Scanner;
public class Ejercicios2  {
    Scanner entrada = new Scanner(System.in);
    public int promedios(){ 
    
int numero1;
int numero2;
int numero3;
int numero4;
int numero5;
int promedio=0;

System.out.println("Ingrese la primera nota: ");        
numero1 = entrada.nextInt();

System.out.println("Ingrese la segunda nota: ");        
numero2 = entrada.nextInt();

System.out.println("Ingrese la tercera nota: ");        
numero3 = entrada.nextInt();

System.out.println("Ingrese la cuarta nota: ");        
numero4 = entrada.nextInt();

System.out.println("Ingrese la quinta nota: ");        
numero5 = entrada.nextInt();

if(numero1<numero2 && numero1<numero3 && numero1<numero4 && numero1<numero5){
               promedio= (numero2+numero3+numero4+numero5 )/4;
               System.out.println(promedio);
}else{
    if (numero2<numero1 && numero2<numero3 && numero2<numero4 && numero2<numero5){
            promedio=(numero1+numero3+numero4+numero5 )/4;
               System.out.println(promedio);
    }else{
        if (numero3<numero1 && numero3<numero2 && numero3<numero4 && numero3<numero5);{
        promedio=(numero1+numero2+numero4+numero5 )/4;
               System.out.println(promedio);
    }{
        if (numero4<numero1 && numero4<numero2 && numero4<numero3 && numero4<numero5);{
            promedio=(numero1+numero2+numero3+numero5 )/4;
            System.out.println(promedio);
    }{
        if (numero5<numero1 && numero5<numero2 && numero5<numero3 && numero5<numero4);{
        promedio=(numero1+numero2+numero3+numero4 )/4;
        System.out.println(+promedio);
    }    
   }
  }
 }
}               
return promedio;
    }
    
    
    public double hipotenuza(){
    
        double catetox;
        double catetoy;
        double hipotenusa=0;
        
        
       
         System.out.println("Ingresar el primer dato: ");
         catetox=entrada.nextDouble();
         
         System.out.println("Ingresar el segundo dato: ");
         catetoy =entrada.nextDouble();
         
        hipotenusa= (catetox*catetox)+(catetoy*catetoy);
        
        hipotenusa= Math.sqrt(hipotenusa);
        
        return hipotenusa;
}
    public void diasPrestamo(){
        
        String dia;
        
        int numDias;
        
        String[] dias={"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sábado"}; 
        
        double [] prestamo = new double[7];
        
        for (int i=0; i< dias.length;i++){
            System.out.println(i+"|"+dias[i]);
        }
        System.out.println("Ingresar el dia: ");
        dia=entrada.next();
        System.out.println("Ingresar el numero del día: "+ dia);
        numDias=entrada.nextByte();
        System.out.println("Ingrear la cantidad de prestamo ");
        prestamo[numDias]=entrada.nextDouble();
        
        if(prestamo[numDias]<0){
            System.out.println("No se pudo detectar el valor ");
            prestamo[numDias]=0;          
        }
        
       
    }

    public void Edades(){
        
	Scanner dp = new Scanner(System.in);
        
	int estudiantes,i,edadMayor,edadMenor,Final,Edades;
 
	System.out.print("Ingresar la cantidad de alumnos: ");
	estudiantes = dp.nextInt();
 
	edadMayor = 0;
	edadMenor = 100;
	Edades = 0;
 
 
	for(i = 1; i <= estudiantes; i++)
	{
		System.out.print("Ingresar la edad del estudiante " + i + " : ");
		Final = dp.nextInt();
 
		Edades = Edades + Final;
		if(Final > edadMayor)
		{
			edadMayor=Final;
		}
		if(Final < edadMenor)
		{
			edadMenor=Final;
		}
	}
 
	System.out.print("La nota mayor es: " + edadMayor + "\n");
	System.out.print("La nota menor es: " + edadMenor + "\n");
    
}
    public static void main(String[] args) {
     
       Ejercicios2 lol =new Ejercicios2();
        System.out.println("El promedio e las 4 notas mas altas es: "+lol.promedios());
        System.out.println("La hipotenusa es: "+lol.hipotenuza());
        lol.diasPrestamo();
        lol.Edades();
      
    }
    
}
