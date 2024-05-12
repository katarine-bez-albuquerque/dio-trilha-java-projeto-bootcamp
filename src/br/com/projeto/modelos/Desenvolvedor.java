package br.com.projeto.modelos;

import br.com.projeto.excessoes.ValoresException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Katarine Albuquerque
 */
public class Desenvolvedor {

    private String nome;
    private Bootcamp bootcamp;

    private int total;
    private int progresso;

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, Bootcamp bootcamp) {
        this.nome = nome;
        this.bootcamp = bootcamp;
        this.total = 0;
        this.progresso = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Bootcamp getBootcamp() {
        return bootcamp;
    }

    public void setBootcamp(Bootcamp bootcamp) {
        this.bootcamp = bootcamp;
    }
    
    public void inscreverBootcamp() {
        this.bootcamp.adicionarDesenvolvedor(this);
    }

    public double progredir(int aulas) {
        if(bootcamp.getCursos().size() < 0) {
            throw new ValoresException("Não há cursos cadastrados.");
        }
        this.progresso =  bootcamp.getCursos().size();
        this.progresso -= aulas;
        return this.progresso;
    }

    public double calcularTotalDePontos(int pontoCurso, int pontoMentoria) {
        for (Curso c : bootcamp.getCursos()) {
            for (Mentoria m : bootcamp.getMentorias()) {
                this.total += c.valorDoPonto(pontoCurso) + m.valorDoPonto(pontoMentoria);
            }
        }
        return this.total;
    }

    public List<Curso> exibirCursosARealizar() {
        List<Curso> lista = new ArrayList<>();
        if (this.bootcamp.getCursos().size() < 0) {
            throw new ValoresException("Não há cursos cadastrados.");
        }        
        for(int i = this.progresso; i< this.bootcamp.getCursos().size(); i++) {
            lista.add(this.bootcamp.getCursos().get(i));
        }
        return lista;
    }
    
    public List<Curso> exibirCursosConcluídos() {
        List<Curso> lista = new ArrayList<>();
        if (this.bootcamp.getCursos().size() < 0) {
            throw new ValoresException("Não há cursos cadastrados.");
        }        
        for(int i = 0; i< this.progresso; i++) {
            lista.add(this.bootcamp.getCursos().get(i));
        }
        return lista;
    }
    
    @Override
    public String toString() {        
        StringBuilder sb = new StringBuilder();
        sb.append(" Desenvolvedor\n\n")
                .append("Nome: ")
                .append(this.nome)
                .append(" \n")
                .append("Bootcamp: ")
                .append(this.bootcamp.getNome())
                .append("\n")
                .append("Total de Pontos: ")
                .append(this.total)
                .append("\n")
                .append("Progresso: ")
                .append(this.progresso)
                .append(" atividades concluídas\n")
                .append("\nAtividades concluídas:\n")
                .append(this.exibirCursosConcluídos())
                .append("\n\nAtividades para realizar:\n")
                .append(this.exibirCursosARealizar())
                .append("\n\n------------- // -------------\n");
        return sb.toString();
    }
}