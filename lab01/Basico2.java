package lab01;

public class Basico2 {

    public static void main(String[] args) {

        /**
         * Os tipos primitivos são os tipos de dados mais simples e são fornecidos pela
         * linguagem de programação. Eles não são objetos e não possuem métodos. Existem
         * oito tipos primitivos em Java:
         */

        byte numeroByte1 = -128;
        byte numeroByte2 = 127;
        // byte numeroByte3 = 128; //ERRO
        byte numeroByte4 = Byte.MIN_VALUE;
        byte numeroByte5 = Byte.MAX_VALUE;

        short numeroShort1 = -32768;
        short numeroShort2 = 32767;
        // short numeroShort3 = 32768; //ERRO
        short numeroShort4 = Short.MIN_VALUE;
        short numeroShort5 = Short.MAX_VALUE;

        int numero1 = -2147483648;
        int numero2 = 2147483647;
        int numero3 = 2_147_483_647;
        int numero4 = Integer.MIN_VALUE;
        int numero5 = Integer.MAX_VALUE;
        var numero6 = 1;

        float numeroFloat1 = 3.2f;
        float numeroFloat2 = Float.MIN_VALUE;
        float numeroFloat3 = Float.MAX_VALUE;
        var numeroFloat4 = 3.2f;

        double numeroDouble1 = 3.2;
        double numeroDouble2 = Double.MIN_VALUE;
        double numeroDouble3 = Double.MAX_VALUE;
        var numeroDouble4 = 3.2d;

        char caractere1 = 'a';
        char caractere2 = Character.MIN_VALUE;
        char caractere3 = Character.MAX_VALUE;
        var caractere4 = 'b';
        var caractere5 = '\uFAFF';

        boolean booleano1 = true;
        boolean booleano2 = Boolean.FALSE;
        boolean booleano3 = Boolean.TRUE;
        var booleano4 = false;
        
    

    }

}
