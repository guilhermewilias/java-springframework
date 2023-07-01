//Classe JAVA criada para entrada de dados dos filmes.
// Contrutores ligados com a class dadosCadastroFilme.java

package br.com.alura.screenmatch.domain.filme;

public class Filme {

    private String nome;
    private Integer duracaoEmMinutos;
    private Integer anoDeLancamento;
    private String genero;

    public Filme (dadosCadastroFilme dados){
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoDeLancamento = dados.ano();
        this.genero = dados.genero();
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                ", anoDeLancamento=" + anoDeLancamento +
                ", genero='" + genero + '\'' +
                '}';
    }

    //Construtores --> Getters and setters.
    //Generate (cmd + n = Generate) --> Selecionar Getter and Setter --> selecionar as variaveis que quer construir.



    public String getNome() {
        return nome;
    }

    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public Integer getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getGenero() {
        return genero;
    }
}
