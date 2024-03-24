import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Resultado para a questão 1: " + SequenceSearch.searchFor(App.getNumberList(), 77));
        System.out.println("Resultado para a questão 2: " + SequenceSearch.searchFor(App.getNumberList(), 600));
        System.out.println("Resultado para a questão 3: " + SequenceSearch.searchFor(App.getNumberList(), 56));
        System.out.println("Resultado para a questão 4: " + SequenceSearch.searchFor(App.getNumberList(), 65));
        System.out.println("Resultado para a questão 5: " + App.prettify(SequenceSearch.searchAll(App.getNumberList(), 65)));

        Pessoa[] listaPessoas = App.getPersonList();
        QuickSort.sort(listaPessoas, 0, listaPessoas.length - 1);
        System.out.printf("Resultado para a questão 6: %s\n", BinarySearch.searchFor(listaPessoas, 100, 0, listaPessoas.length - 1));
        System.out.println("Resultado para a questão 7:");
        for (int index : SequenceSearch.greaterThan(listaPessoas, 30)) {
            Pessoa p = listaPessoas[index];
            System.out.printf("\tNome: %s. Idade: %d\n", p.getName(), p.getAge());
        }
        System.out.println("Resultado para a questão 8:");
        for (Pessoa p : listaPessoas) {
            p.setAge(18);
            System.out.printf("\tNome: %s. Idade: %d\n", p.getName(), p.getAge());
        }

        int[] anotherList = App.getAnotherNumberList();
        System.out.println("Resultado para a questão 9: " + BinarySearch.searchFor(anotherList, 99, 0, anotherList.length));
        System.out.println("Resultado para a questão 9: " + BinarySearch.searchFor(anotherList, 81, 0, anotherList.length));

    }

    public static int[] getNumberList() {
        int[] list = { 
             40,  63,  40,  36,  10,  89,  74,  32,  59,  13, 
             29,  12,  40,   8,  11,  63,   1,  52,  25,  92, 
             42,  76,  33,   2,  72,  15,  92,  65,   3,  19, 
             33,  21,  57,  19,  55,  93,  31,  54,  31,  50, 
             66,  44,  54,  55,  29,  75,  43,  88,  61,  65, 
             49,  87,  10,  25,  33,  70,  84, 125, 345, 400, 
             77,  32,  41,  66,  33,  70,  84, 125, 600,  38, 
             43,  51,  34,  76,  25,  48,  14,  50,  71,   1, 
             98,  86,  38,  91,  65,  96,  60,  43,  75,  86, 
             59,  17,  86,  12,  10,  16,  10,  33,  15,  77, 
             22,  56,   4,   9,  63,  49,  80,  39,  53,  97, 
             36,  34,  16,   1,  98,  78,  92, 100,  35 
        };
        return list;
    }

    public static int[] getAnotherNumberList() {
        int[] listaNumeros = { 
             52,  53,  54,  55,  56,  57,  58,  59,  60,  61, 
             62,  63,  64,  65,  66,  67,  68,  69,  70,  71, 
             72,  73,  74,  75,  76,  77,  78,  79,  80,  81,
             82,  83,  84,  85,  86,  87,  88,  89,  90,  91, 
             92,  93,  94,  95,  96,  97,  98,  99, 100 
        };
            return listaNumeros;
    }

    public static Pessoa[] getPersonList() {
        Pessoa[] result = {
                new Pessoa("Vinícius", 41),
                new Pessoa("Daniela", 44),
                new Pessoa("Ana", 18),
                new Pessoa("Carla", 20),
                new Pessoa("Daniel Paiva", 31),
                new Pessoa("Felipe", 24),
                new Pessoa("Patricia", 23),
                new Pessoa("Rafael", 20),
                new Pessoa("Pedro", 22),
                new Pessoa("Marcela", 24),
                new Pessoa("Amanda", 100)
        };
        return result;
    }

    public static String prettify(ArrayList<Integer> list) {
        int index = 0;
        String result = "" + list.get(index);
        while (++index < list.size())
            result += ", " + list.get(index);
        return result;
    }
}
