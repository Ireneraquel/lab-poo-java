package lab02;
public class VolumeCubo {
    // Não execute no 'Run'. Execute no Terminal
    // java 02-argumentos/Argumentos1.java romulo // 3 solidos fazer com scanner 
    public static void main(String[] args) {
    //Cubo
       var lado = Float.parseFloat(args[0]);
       var volume = Math.pow(lado, 3);
       if (lado < 0) {
         System.out.println("Não podemos calcular número negativo");
       } else {
         System.out.println("O volume para este cubo é: " + volume + " cm³");
       }
    //Paralelepípedo
       var altP = Float.parseFloat(args[1]);
       var comP = Float.parseFloat(args[2]);
       var larP = Float.parseFloat(args[3]);
       var volumeP = altP * comP * larP ;
       if (altP <0 || larP <0 || comP <0) {
         System.out.println("Não podemos calcular número negativo");
       } else {
         System.out.println("O volume para este paralelepípedo é: " + volumeP + " cm³");
       }
    //Cilindro
       var altC = Float.parseFloat(args[4]);
       var raioC = Float.parseFloat(args[5]);
       var volumeC = Math.PI * Math.pow(raioC, 2) * altC;
       double resultaC = Math.floor(volumeC);
       System.out.println("O volume para este cilindro é: " + resultaC + " cm³");
       
    }
}
