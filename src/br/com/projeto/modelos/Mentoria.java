package br.com.projeto.modelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Katarine Albuquerque
 */
public class Mentoria extends Treinamento implements CalculaPonto {
    private LocalDate dataMentoria;
    private Bootcamp bootcamp;
    
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");

    public Mentoria() {
    }

    public Mentoria(LocalDate dataMentoria, Bootcamp bootcamp, String titulo, String descricao) {
        super(titulo, descricao);
        this.dataMentoria = dataMentoria;
        this.bootcamp = bootcamp;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    public Bootcamp getBootcamp() {
        return bootcamp;
    }

    public void setBootcamp(Bootcamp bootcamp) {
        this.bootcamp = bootcamp;
    }
    
    @Override
    public int valorDoPonto(int valor) {
        return valor;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.dataMentoria.format(formatter))
                .append(" - ")
                .append(this.titulo)
                .append(" - ")
                .append(this.descricao)
                .append("\n");
        return sb.toString();
    }    
}