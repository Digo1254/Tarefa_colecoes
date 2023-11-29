import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Part2 {

    public static void main(String args[]){
        System.out.println("Digite os 4 nomes e o sexo de cada um separando por virgula dessa forma:nome-sexo");
        Scanner plural = new Scanner(System.in);
        String singular = plural.next();

        String dividido[] = singular.split(",");
        int contador = 0;
        List<String> masculino =new ArrayList<>();
        List<String> feminino = new ArrayList<>();
        while(contador<4){


            if(dividido[contador].contains("-m")){
                masculino.add(dividido[contador]);
                contador++;

        }
            else{
                feminino.add(dividido[contador]);
                contador++;
    }
}
        System.out.println("-------MASCULINOS-------");
        System.out.println(masculino);

        System.out.println("-------FEMININOS-------");
        System.out.println(feminino);
    }}
