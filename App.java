import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class App {
    public static void main(String[] args) {

    //com o HashSet ele não mantem os itens adicionados em ordem conforma for adicionando
    Set <String> teste = new HashSet<>();
    
    //o Set não permite a adição de valores repetidos, por isso no console
    //só vai exibir "valor 1" e "valor 2"
    teste.add("valor 1");
    teste.add("valor 1");
    teste.add("valor 2");
    teste.add("valor 10");
    teste.add("valor 4");
    teste.add("valor 5");
    teste.add(null);

    //método booleano para verificar se existe um valor ou não (true ou false) adicionado em um Set
    System.out.println( teste.contains("valor 3"));
    System.out.println( teste.contains("valor 1"));

    //método para remover um valor do Set
    teste.remove("valor 4");

    for (String valores : teste) {
        System.out.println(valores);
    }
    
    System.out.println("-----------------------");

    //com o LinkedHashSet fica os itens do Set ficam ordenados conforme a ordem de adição
    Set <String> teste2 = new LinkedHashSet<>();

    teste2.add("valor 1");
    teste2.add("valor 1");
    teste2.add("valor 2");
    teste2.add("valor 10");
    teste2.add("valor 4");
    teste2.add("valor 5");
    teste2.add(null);

    for (String valores2 : teste2) {
        System.out.println(valores2);
    }

    System.out.println("-----------------------");

    //organiza os itens do menor ao maior, ou seja, uma árvore binária
    Set <Integer> teste3 = new TreeSet<>();

    teste3.add(1);
    teste3.add(1);
    teste3.add(2);
    teste3.add(10);
    teste3.add(4);
    teste3.add(5);
    //diferente do HashSet e o LinkedHashSet, no TreeSet não se pode adicionar um elemento null

    //poderia colocar o int também invés do Integer, ambos tem o mesmo resultado
    for (Integer valores3 : teste3) {
        System.out.println(valores3);
    }

    }
}
