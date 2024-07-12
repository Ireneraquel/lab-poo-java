package lab02;

import java.util.Scanner;

public class VolumeScanner {

    public static void main(String[] args) {
            var sc = new Scanner(System.in);
       // Com Scanner
       // Cubo
       System.out.print("Quanto é o lado do cubo? " ); 
       var lCubo = sc.nextDouble();
       var vCubo = Math.pow(lCubo, 3);
       if (lCubo <= 0) {
        System.err.println("dfegubcbgidcgh");
        System.out.println("Não podemos calcular número negativo!");
       } else{
        System.out.println("O valor do volume do cubo é: " + vCubo + " cm³");
       }
       //Paralelepípedo
       System.out.print("Quanto é a altura do Paralelepípedo? ");
       var alPara = sc.nextDouble();
       System.out.print("Qual é o comprimento do Paralelepípedo? ");
       var cPara = sc.nextDouble();
       System.out.print("Qual é a largura do Paralelepípedo? ");
       var lPara = sc.nextDouble();
       var volPara = alPara * cPara * lPara;
       if (alPara <= 0 || lPara <= 0 || volPara <= 0) {
       System.out.println("Não podemos calcular número negativo" );
        } else{
            System.out.println("O volume do Paralelepípedo é:" + volPara + " cm³" );
        }
       //Cilindro 
       System.out.print("Qual é a altura do Cilindro? ");
       var aCi = sc.nextDouble();
       System.out.print("Qual é o raio do Cilindro? " );
       var rCi = sc.nextDouble();
       var vCi = Math.PI * Math.pow(rCi, 2) * aCi;
       double rC = Math.floor(vCi);
       System.out.println("O volume do Cilindro é: "+ rC + " cm³");

       sc.close();
       

    }
}
