// O jshell é um interpretador de programa Java.
//  Para executar esse arquivo jshell <nome_do_arquivo.jsh>
// https://docs.oracle.com/en/java/javase/21/jshell/scripts.html
// https://cr.openjdk.org/~rfield/tutorial/JShellTutorial.html


// Hello Word
System.out.println("Alô, meu mundo!!");

// Variáveis inteiras
// Tipos existentes
// Byte/byte (1 byte) Short/short (2 bytes) Integer/int (4 bytes) Long/long (8 bytes)
byte a = 10;
a = 20;
System.out.println("Passando dos limites do Byte");
a = -129;
a = -10;
a = -128;
a = -127;
a --;
a ++;
a;
a--;
a
a--;
a;
a ++;
// Cuidado com incrementos e decrementos pois ao esbarrar nos limites ele fecha um anel -128 - 1 = 127.
// Usando as classes Wrappers.
a = Byte.MAX_VALUE;
a = Byte.MIN_VALUE;
a = 0;
// Podemos usar "_"
a += 4_000_000;
System.out.println(a);
a ++;
System.out.println(a)
long a = Long.MAX_VALUE;
a = a - 1;
a = 10;
// Usando operações var <operacao>= valor ---> var = var <operacao> valor.
// Exemplos
a += 12;
a -= 12;
a *= 12;
a /= 12;
// Para o Java essa variável é 1/3, apesar de existir uma diferença.
a = 0.333333333333333333333333333333333333333333D;
a -= (1./3.)
boolean b = (a == 0.)
// b == true ? Pq. Ajuste da linguagem.
// Veja especificação da IEEE754
// https://en.wikipedia.org/wiki/IEEE_754

// Qual a diferença das contas ? Pq uma dá zero e a outra não ?
double diff1 = ( (100.0101 * (1./3.) ) * 3. ) - 100.0101
double diff2 = ( ( (1./3.) * 3.) * 100.0101 ) - 100.0101


// Tamanho Float/float 4 bytes, Double/double 8 bytes.
a += 10_000_000.0D;
float  f_a = 0.33333333333333333F;
f_a += 10E7F;
f_a
var f_b = f_a - (10E7F + (1.F/3.F));
f_b == 0.0F
f_b
f_a=0.F
// Diferença...
double a = (1./3.);
//a ==> 0.3333333333333333
double a *= 3E100
//$25 ==> 9.999999999999998E99 (não deu 1E100)


// Forma de comparar 2 valores double usando ...
double a = 100.0
double b = ( 100.0 * (1./3.) ) * (3.)
boolean c = (Math.abs(a - b) == 0);
// Ué ... Não eh true ?

// Vamos fazer uma comparação mais flouxa
boolean c = (Math.abs(a - b) < 1E-5);
// Resp = True

// Se for mais rígido, ....
boolean c = (Math.abs(a - b) < 1E-15);
// Resp = False

// Não é necessário importar java.lang.
Math.abs(-10)
Math.abs(10)
Math.abs(-10.005F)
Math.abs(10.005F)
Math.abs(10.005D)
Math.abs(-10.00005D)

var medi = 115;
var ref = 100;
boolean diabetes_ok = (Math.abs(ref - medi) <= 20);

// Char.
char letra_atual = '1';
short letra_atual_em_numero = (short) letra_atual;
// Qual é o número (no byte...) representa o número do caracter '1' ?

letra_atual_em_numero
"Letra = %d".formatted((short) letra);
//"Letra = 49"

// Podemos usar o char para guardar caracteres unicode em 2 bytes.
char letra_estranha = '\u0fff';
System.out.printf("A letra estranha é %c",letra_estranha);

// Tenho que guardar, n valores... Como fazer isso usando o que aprendemos ?
var v1 = 10;
var v2 = 20;
var v3 = 40;
// 3 inteiros, e se tiver 4, 5, ...1000...100000 ?

// Podemos usar arrays ;-)
//https://www.jdevtreinamento.com.br/arrays-ou-vetores-e-sua-estrutura/

// Alocação de 10 espaços de memória, para guardar inteiros.
int [] arr_ints = new int[10];
// Ela já nasce inicializada com Zeros, False...

// Escrevendo na memória.
arr_ints[0] = 10;
arr_ints[1] = 20;
arr_ints[2] = 30;
arr_ints
// Lendo e imprimindo...
System.out.println(arr_ints[9]);
System.out.println(arr_ints[0]);

// Alocando arrays 2D ;-) Em uma linha. 
// Em linguagens de nível mais baixo como C/C++ dá
// um trabalho ... bravo.
boolean [] [] arr_analise_pesos_altura = new boolean [10] [10];

//Escrevendo no array, na forma de linha/coluna(por exemplo)
arr_analise_pesos_altura[0][1] = true
arr_analise_pesos_altura[1][1] = true

// Lendo dados do array.
arr_analise_pesos_altura[0][0]
arr_analise_pesos_altura[0][1]

// Imprimindo todo o array.
arr_analise_pesos_altura

// Alocando 10 itens (int) e escrevendo a posição + 1.
int [] arr_analise_pesos_altura = new int[10];
for (int idx=0; idx<arr_analise_pesos_altura.length; idx++){
    arr_analise_pesos_altura[idx] = idx+1;
}
// Imprime todo a array.
arr_analise_pesos_altura

// Escrevendo todos os itens usando potência 2 
for (int idx=0; idx<arr_analise_pesos_altura.length; idx++){
    arr_analise_pesos_altura[idx] = (int) Math.pow(idx,2);
// outra possibilidade.    
//    arr_analise_pesos_altura[idx] = idx * idx;
}


a = 100;
// Se dividir a / 21 temos a parte inteira 4.
// O resto da divisão é 16.
a % 21
//Resp: 16.

boolean eh_par = (a % 2)
//Resp: true ;-) 100 é Par, pois o resto é Zero!


// Nas posições pares faço a potencia de 2.
// Se a posição for impar a potência 3.
for (int idx=0; idx < arr_analise_pesos_altura.length; idx++){
    if ( (idx % 2) == 0 ) {
        arr_analise_pesos_altura[idx] = (int)Math.pow(idx,2.);
    }else {
        arr_analise_pesos_altura[idx]= (int)Math.pow(idx,3.);
    }
}
arr_analise_pesos_altura

// If simples.
int a = 50_000;
if ( a > 0 && a < 1_000 ){
    System.out.print("Fase 1");
}
else {
    System.out.print("Fora da fase...");
}

// If encadeado
a = 1501
if ( a > 0 && a < 1_000 ){
    System.out.print("Fase 1");
} else if (a >= 1_000 && a < 30_000){
    System.out.print("Fase 2");
} else if (a >= 30_000 && a < 50_000){
   System.out.print("Fase 3 Final");
} else {
   System.out.print("Fora das fases...");
}

int a = 10_000;
double temperatura = 38.01
// Cuidado com essa estrutura !! Aumenta a complexidade e aumenta a chance de erros.
if ( a < 1000 ){
   if (temperatura < 25.)
  	System.out.println("Fase baixa...");
} else {
   if (a > 9_000){
   	if (temperatura > 35.){
   	  System.out.println("Fase alta.");
   	} else {
   	  System.out.println("Fase Baixa.");   	
   	}
   } else {
   	  System.out.println("Fase MUITO alta.");   
   }
}

// Se puder simplificar o processamento usando o switch
a = 3
   switch (a){
            case 1 -> System.out.print("Fase 1");
            case 2 -> System.out.print("Fase 2");
            case 3 -> System.out.print("Fase 3");
            case 4 -> System.out.print("Fase 4");
            default -> System.out.print("Sem fase");
        }
        
a = 11
    switch (a){
            case 1,2,3 -> System.out.print("Fase 1");
            case 4,5,6 -> System.out.print("Fase 2");
            case 7,8,9 -> System.out.print("Fase 3");
            case 10,11,12 -> System.out.print("Fase 4");
            default -> System.out.print("Sem fase");
        }

// A classe é como uma  "planta de uma casa". A casa ainda não existe.
class Pessoa {
    public String nome;
    public int idade;
    public String apresentar(String nome){
        return "Olá sou %s e tenho %d anos - [%s]".formatted(this.nome, this.idade, nome);
    }
};

Pessoa pessoaQueExecuta = new Pessoa();
pessoaQueExecuta.nome="Joaquim";
pessoaQueExecuta.idade=50;
//jshell> pessoaQueExecuta
//pessoaQueExecuta ==> Pessoa@63c12fb0
// Não mostra os dados tem que reescrever o método toString()


class Pessoa {
    public String nome;
    public int idade;
    public String apresentar(String nome){
        return "Olá sou %s e tenho %d anos - [%s]".formatted(this.nome, this.idade, nome);
    }
    @Override
    public String toString(){
    	return "Pessoa com nome =%s idade= %d anos".formatted(this.nome, this.idade);
    }
};


// Funciona como uma classe, mas não precisa reescrever métodos como toString além de ser imutável
record Pessoa (
    String nome,
    int idade){
    public String apresentar(String nome){
        return "Olá sou %s e tenho %d anos - [%s]".formatted(this.nome, this.idade, nome);
    }
}

Pessoa pessoaQueExecuta = new Pessoa ("Joao de Almeida mello", 48);
pessoaQueExecuta.apresentar("<teste do parametro nome>");
ArrayList<Pessoa> lista_pessoas = new ArrayList<Pessoa>(1000);
lista_pessoas.add(pessoaQueExecuta);
lista_pessoas.add(new Pessoa("Atchim de mentira X",30));
lista_pessoas.add(new Pessoa("Espirro sem barulho Segundo",31));
lista_pessoas.add(new Pessoa("Saude de Oliveira II",33));
lista_pessoas.add(new Pessoa("Alegrete de Herbácea IV",33));
lista_pessoas
lista_pessoas.add(pessoaQueExecuta);
lista_pessoas.add(pessoaQueExecuta);
lista_pessoas.add(pessoaQueExecuta);
lista_pessoas.add(pessoaQueExecuta);
lista_pessoas.add(pessoaQueExecuta);
lista_pessoas.add(pessoaQueExecuta);
// CHamamando 1 pessoa por posição (iniciando em Zero)
lista_pessoas.get(4).apresentar("Com Parâmetro XXX");

// Fazendo um loop usando foreach mais simples (sem índice)
for ( Pessoa p : lista_pessoas){ 
  System.out.println(p.apresentar("TESTE de Loop"));
}

// Fazendo loop usando Stream (Fluxo de dados) e passando uma interface funcional para executar um procedimento
lista_pessoas.stream().forEach(System.out::println);

// Podemos aplicar filtros...
lista_pessoas.stream().filter(f->f.idade() > 31).forEach(System.out::println);
// E outras coisas como map<conversao de um tipo de dado do fluxo em outro>, sumarização, estatística, etc....

// Exemplo de uma interface simples.
interface ImprimePessoaComIdade{
    String imprimeIdadeSemNome(int anoAtual, Pessoa pessoa);
}

// Um Classe que usa essa interface.
class ExecutaPessoaSimples implements ImprimePessoaComIdade {
    public String imprimeIdadeSemNome(int anoAtual, Pessoa pessoa){
    if (pessoa.idade() <= 30)    
        return "A pessoa é %s tem %d anos e estamos no ano %d ano atual".formatted(pessoa.nome(), pessoa.idade(), anoAtual);
    else 
        return "";
    }
}
// Outro tipo de classe que usa essa interface.
class ExecutaPessoaInteressante implements ImprimePessoaComIdade {
    public String imprimeIdadeSemNome(int anoAtual, Pessoa pessoa){
    if (pessoa.idade() > 30)
        return "A pessoa é interessante e tem o nome %s tem %d anos e estamos no ano %d ano atual. Nossa que nova !!".formatted(pessoa.nome(), pessoa.idade(), anoAtual);
    else
     return "";
    }
}

// Criando uma lista de Interfaces para executar....
// Na verdade são classes que implementam o contrato da interface e podem ser adicionadas na lista.
ArrayList<ImprimePessoaComIdade> listaInterfaces = new ArrayList<ImprimePessoaComIdade>();
listaInterfaces.add(new ExecutaPessoaInteressante());
listaInterfaces.add(new ExecutaPessoaSimples());
listaInterfaces

// Estamos rodando as regras (interfaces de execução) em todos os dados (lista de pessoas)...
//... Como ficaria se fosse o inverso?
//... Faria diferença na performance?
//... Se for igual, com poderíamos aumentar a performance?
listaInterfaces
   .stream()
   .forEach(i -> {
      lista_pessoas
         .stream()
         .forEach(p -> {
            String strPrint = i.imprimeIdadeSemNome(2012,p);
            if (!strPrint.isEmpty())
              System.out.println( strPrint ); 
         }); 
   });
