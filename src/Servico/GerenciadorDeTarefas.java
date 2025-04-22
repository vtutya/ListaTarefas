package Servico;

import Modelos.Tarefa;

import java.util.ArrayList;

public class GerenciadorDeTarefas {
    private ArrayList<Tarefa> listaTarefa = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {             // metodo de adicionar tarefa na lista
        listaTarefa.add(tarefa);
    }
    public void removerTarefa(Tarefa tarefa) {               // metodo de remover tarefa da lista
        if (listaTarefa.isEmpty()) {
            System.out.println("Lista de tarefas vazia.");
        } else {
            for (Tarefa t : listaTarefa) {
                if (t.equals(tarefa)) {
                    listaTarefa.remove(t);
                    System.out.println("Tarefa removida com sucesso.");
                    return;
                }
            }
            }
        }
    public void listarTarefas() {
        if (listaTarefa.isEmpty()) {
            System.out.println("Lista de tarefas vazia.");
        } else {
            for (Tarefa t : listaTarefa) {
                System.out.println(t);
            }
        }
    }
    public Tarefa buscarPeloTitulo(String titulo) {
            for(Tarefa t: listaTarefa){
                if(t.getTitulo().equals(titulo)){
                    return t;
                }
            }
            return null;
        }
    }

