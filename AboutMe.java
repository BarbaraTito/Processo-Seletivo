import java.awt.image.SampleModel;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Barbara");
        String nome = Scanner.next();
        
        System.out.println("Tito");
        String sobrenome = Scanner.next();

        System.out.println("35");
        int idade = SampleModelcanner.nextInt();
        
        System.out.println("1.67");
        double altura = Scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        
    }
}
