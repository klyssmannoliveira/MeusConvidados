package Trabalho;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Evento {
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	private String nomeEvento;
	private Date dataEvento;
	private int horaInicio;
	private int horaTermino;
	private static ArrayList<Convidado> bdConvidados = new ArrayList<Convidado>();
	private int totalConvidados = 0;
	private static ArrayList<Tarefa> bdTarefas = new ArrayList<Tarefa>();
	private double taxaTarefas;
	
	public Evento(String nome, String data, int horai, int horaf) throws Exception {
		nomeEvento = nome;
		dataEvento = formato.parse(data);
		horaInicio = horai;
		horaTermino = horaf;
	}
	
	//Listar, adicionar e total de convidados
	public void listarConvidados(){
		System.out.print("\n*** Lista de convidados para o Evento: " + nomeEvento + " ***\n");
		for(int i = 0; i < bdConvidados.size(); i++ ) {
			Convidado aux = bdConvidados.get(i);
			System.out.print(aux.getNome() + " e " + aux.getQuantAcompanhante() + " acompanhante(s)\n");			
		}
		System.out.println("Total de convidados: " + getTotalConvidados());
	}
	public void adicionarConvidado(Convidado convidado) {
		bdConvidados.add(convidado);
	}
	
	public void setTotalConvidados() {
		for(int i = 0; i < bdConvidados.size(); i++ ) {
			Convidado aux = bdConvidados.get(i);
			totalConvidados = totalConvidados + 1 + aux.getQuantAcompanhante();		
		}
	}
	
	//// Listar, adicionar tarefas
	public void listarTarefas() {
		int quantidade = 0;
		System.out.print("\n*** Lista de tarefas para o Evento: " + nomeEvento + " ***\n");
		for(int i = 0; i < bdTarefas.size(); i++ ) {
			Tarefa aux = bdTarefas.get(i);
			System.out.print("Tarefa " + (i+1) + ": " + aux.getDescricao() + "\n    -> Data limite: "
					+ formato.format(aux.getDataLimite()) + "\n    -> Concluído: " + aux.isConcluido() + "\n");	
			quantidade++;
		}
		System.out.println("Total de tarefas: " + quantidade);
	}
	public void adicionarTarefa(Tarefa tarefa) {
		bdTarefas.add(tarefa);
	}
	
	//Getters e setters
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public Date getDataEvento() {
		return dataEvento;
	}
	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}
	public int getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
	public int getHoraTermino() {
		return horaTermino;
	}
	public void setHoraTermino(int horaTermino) {
		this.horaTermino = horaTermino;
	}
	
	public int getTotalConvidados() {
		setTotalConvidados();
		return totalConvidados;
	}
	
	public double getTaxaTarefas() {
		return taxaTarefas;
	}
	public void setTaxaTarefas(double taxaTarefas) {
		this.taxaTarefas = taxaTarefas;
	}
	
	

}
