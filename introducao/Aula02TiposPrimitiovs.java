package academy.introducao;

/**
 * TIPOS PRIMITIVOS: <br>
 * <b>int, double, float, char, byte, shart, long, boolean</b>
 */

public class Aula02TiposPrimitiovs {
    public static void main(String[] args) {

        int age = (int) 1000000000L;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdade = true;
        boolean falso = false;
        char caractere = '\u0041';

        System.out.println("A idade é " + age);
        System.out.println(falso);
        System.out.println("Char" + caractere);
        System.out.println(numeroGrande);
    }
}
