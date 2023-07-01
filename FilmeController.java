//@Controller = Indicando que isto é uma classe controladora do MVC, ou seja, é o C do MVC.
//@RequestMapping ("/filmes") = Indicando que quando seja teclado /filmes no navegador vai exibir o FilmeController.
//@GetMapping = é o que vai retornar para o navegador, ou seja, no localhost8080 irá retornar o codigo HTML por método GET.
//@PostMaping = é o que vai retornar para o navegador, ou seja, no localhost8080 irá retornar o codigo HTML por método POST.

package br.com.alura.screenmatch.controller;

import br.com.alura.screenmatch.domain.filme.Filme;
import br.com.alura.screenmatch.domain.filme.dadosCadastroFilme;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping ("/filmes")
public class FilmeController {

    private List<Filme> filmes = new ArrayList<>(); //ArrayList = Array onde os novos filmes cadastrados irão ser armazendos

    @GetMapping ("/formulario")//Método GET, localhost:8080/filmes/fomulario --> O formulário de cadastro de filmes
    public String carregaPaginaFormulario () {

        return "filmes/formulario";
    }

    @GetMapping //Método GET,localhost:8080/filmes --> Apenas a listagem dos filmes já cadastrados
    public String carregaPaginaListagem (Model model) {
        model.addAttribute("lista", filmes); //"lista", filmes --> ArrayList.
        return "filmes/listagem";
    }

    @PostMapping
    public String cadastraFilme(dadosCadastroFilme dados) {
        var filme = new Filme(dados);
        filmes.add(filme);

        return "redirect:/filmes";
        //Logo quando o botão "Cadastrar" for clicado para adicionar um filme, o comando :
        //"redirect:/filmes" irá redirecionar automáticamente para a página filmes, e
        //assim irá mostrar o histórico com todos os filmes que já foram cadastrados anteriormente.
    }
}

