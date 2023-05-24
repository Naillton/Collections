/*
 *  Collections é um conjunto de interfaces e classes que tratam daddos de uma certa maneira
 *  A collection possui os seguintes elementos, Set, List e Map
 *  Set é uma interface de colecao que nao permite valores duplicados,
 *  Map é uma interface de colecao chave e valor, onde os valores podem ser duplicados mas as chaves nao
 *  List é uma interface de colecao ordenadas podendo conter valores duplicados ou nao
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //listCollection();
        //setCollection();
        mapCollection();
    }

    private static void listCollection() {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(6);
        numeros.add(8);
        numeros.add(4);
        numeros.add(12);
        numeros.add(10);
        System.out.println(numeros);
        // o exemplo acima nao esta ordenado, para ordenarmos usaremos o metodo sort da classe collections
        Collections.sort(numeros);
        System.out.println(numeros);
        // usamos o get para recuperar o valor de um determinado indice no array
        System.out.println(numeros.get(2));
        // usando stream().reduce para somar todos os elementos da minha lista
        Integer number = numeros.stream().reduce(0, (elm, total) -> total + elm );
        System.out.println(number);
        // como o ArrayList é uma colecao de elementos imutaveis, nao podemos adcionar um valor em um indice onde ja exite um valor
        // para conseguirmos fazer isso usamos o Arrays.asList e conseguimos fazer o mesmo, mas, nao conseguiremos
        // adcionar e remover valores, entao, para conseguirmos adcionar e remover valores teremos que colocar o asList dentro de um ArrayList
        ArrayList<String> estudantes = new ArrayList<>(Arrays.asList("Joao", "Maria", "Jose", "Zezin", "Zezinha"));
        estudantes.add("Cesar");
        System.out.println(estudantes);
        // note que ao modficarmos o valor os antigos valores sao modificados para os novos
        estudantes.set(0, "Cabelinho");
        // removendo elementos de uma lista
        estudantes.remove(1);
        System.out.println(estudantes);
        // verificando tamanho de uma lista
        System.out.println(estudantes.size());
        // verificando se na minha lista contem o elemento passado como parametro em contains
        // os metodos retornam um boolean caso contenha na lista retorna true caso noa retorna false
        System.out.println(estudantes.contains("Cabelinho"));
        System.out.println(numeros.contains(13));
    }

    private static void setCollection() {
        // criando listas com set, observe que usaremos uma classe interna de set o TreeSet, que nos ajuda a ordenar os valores por padrao
        // mas nao permite valores repetidos
        // existem subclasses em todos os metodos das collections, olhar na documentacao
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(10);
        numeros.add(4);
        numeros.add(6);
        numeros.add(7);
        System.out.println(numeros);
        // verificando tamanho com o size
        System.out.println(numeros.size());
        // verificando se contem algum valor
        System.out.println(numeros.contains(1));
        // criando lista com hashSet
        HashSet<String> names = new HashSet<>();
        names.add("Michael");
        names.add("Jackon");
        System.out.println(names);
    }

    private static void mapCollection() {
        // criando HashMap e populando
        // lembrando que HashMap visa o alto desempenho e o TreeMap utiliza uma arvore ordenada
        var estudantes = new HashMap<String, String>();
        // diferente do List e do Set no Map usamos o put para poder atualizar nossa lista
        estudantes.put("b", "Zezin");
        estudantes.put("c", "Carlin");
        estudantes.put("d", "Ash");
        estudantes.put("g", "Cagao");
        estudantes.put("a", "Nanico");
        // note que ao fazer um put com uma chave ja existente o valor sera modificado
        estudantes.put("a", "kdakd");
        System.out.println(estudantes);
        // verificando tamanho do map
        System.out.println(estudantes.size());
        // acessando elemento pela sua chave
        System.out.println(estudantes.get("d"));
        // verificando se contem algum valor especifico
        System.out.println(estudantes.containsValue("fhjhf"));
        // removendo estudantes
        estudantes.remove("a");
        System.out.println(estudantes);
        System.out.println(estudantes.put("b", "zezin"));
    }
}