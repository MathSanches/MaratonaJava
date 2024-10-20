package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int age = 10;
        long numeroGrande = 10000000;
        double salarioDouble = 2000;
        float salarioFloat = 2500.0f; // caso você queira especificar que esse numero é realmente de um float, você deve colocar um "f" ou "F" no final
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        System.out.println("A idade é "+age);
    }
}
