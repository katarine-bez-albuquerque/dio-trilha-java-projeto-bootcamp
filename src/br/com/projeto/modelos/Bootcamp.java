package br.com.projeto.modelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Katarine Albuquerque
 */
public class Bootcamp {
    private LocalDate dataInicio;
    private LocalDate dataFinal;
    private String nome;
    private String Descricao;
    private List<Desenvolvedor> desenvolvedores;
    private List<Mentoria> mentorias;
    private List<Curso> cursos;
    
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");

    public Bootcamp() {
    }

    public Bootcamp(LocalDate dataInicio, LocalDate dataFinal, String nome, String Descricao) {
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.nome = nome;
        this.Descricao = Descricao;
        this.desenvolvedores = new ArrayList<>();
        this.mentorias = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public List<Desenvolvedor> getDesenvolvedores() {
        return desenvolvedores;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
    
    public void adicionarDesenvolvedor(Desenvolvedor desenvolvedor) {
        this.desenvolvedores.add(desenvolvedor);
    }
    
    public void removerDesenvolvedor(Desenvolvedor desenvolvedor) {
        this.desenvolvedores.remove(desenvolvedor);
    }
    
    public void adicionarMentoria(Mentoria mentoria) {
        this.mentorias.add(mentoria);
    }
    
    public void removerMentoria(Mentoria mentoria) {
        this.mentorias.remove(mentoria);
    }
    
    public void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
    }
    
    public void removerCurso(Curso curso) {
        this.cursos.remove(curso);
    }

    @Override
    public String toString() {        
        StringBuilder sb = new StringBuilder();
        sb.append("\nBootcamp:\n")                
                .append(this.nome)
                .append("\n")
                .append(this.Descricao)
                .append("\n")
                .append("Data inicial: ")
                .append(this.dataInicio.format(formatter))
                .append("\nData final: ")
                .append(this.dataFinal.format(formatter))
                .append("\n");
        return sb.toString();
    }
}