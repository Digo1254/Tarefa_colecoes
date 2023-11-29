import java.util.*;

public class Part1 {

    public static void main(String args[]){
        System.out.println("Escreva os quatro nomes com separação de virgulas");
        Scanner nomes = new Scanner(System.in);
        String nomes2 = nomes.next();

        String nome[] = nomes2.split(",");

        List<String> lista = new ArrayList<>();

        lista.add(nome[0]);
        lista.add(nome[1]);
        lista.add(nome[2]);
        lista.add(nome[3]);

        Collections.sort(lista);

        System.out.println(lista);
    }
}
