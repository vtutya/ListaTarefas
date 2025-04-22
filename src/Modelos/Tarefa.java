package Modelos;

import java.time.LocalDate;

public class Tarefa {
    private String titulo;
    private String descricao;
    private LocalDate dataInicio;
    private boolean concluida;


    public Tarefa(String titulo, String descricao, LocalDate dataInicio, boolean concluida) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.concluida = false;
    }
    public boolean isConcluida() {
        return concluida;
    }
    public void marcarConcluida(){
        this.concluida = true;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Tarefa:" + titulo + "\n" +
                "Descrição: " + descricao + "\n" +
                "Data de Início: " + dataInicio + "\n" +
                "Concluida: " + (concluida ? "Sim" : "Não") + "\n";
    }
}
