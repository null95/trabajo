import java.util.Scanner;
/**
 * Write a description of class ejercicio2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ejercicio2
{ public static void main(){
    int vector[]=new int [10];
    int valor;
    boolean resul=false;
    Scanner entrada=new Scanner(System.in);
    
    
    for(int i=0;i<vector.length;i++){
        vector[i]=(int)(Math.random()*100)+1;
        System.out.printf("el valor %d esta en la posicion %d\n",vector[i],i);
    
    }
    System.out.println("intro");
    valor=entrada.nextInt();
    for(int i=0;i<vector.length;i++){
        if(valor==vector[i]){
            resul=true;     
        }
    }
    
    if (resul=false){
        System.out.printf("el valor esta en el vector");
    }else{
        System.out.printf("el valor NO esta en el vector");
    }
}
   
}
