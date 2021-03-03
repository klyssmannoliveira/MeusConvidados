package Trabalho;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Tarefa {
	private String descricao;
	private Date dataLimite;
	private long prazo;
	private boolean concluido;
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	public Tarefa(String desc, String data) throws Exception {
		descricao = desc;
		dataLimite = formato.parse(data);
	}
	
	public String isConcluido() {
		if (concluido == true) {
			return "Sim";
		}
		else {
			return "Não";
		}
		
	}
	public void setPrazo() {
		GregorianCalendar d= new GregorianCalendar();
		Date agora = d.getTime();
		prazo = (dataLimite.getTime() - agora.getTime()) / (1000*60*60*24);
	}
	
	public String toString() {
		return "Tarefa: " + descricao + "\nData Limite: " + formato.format(dataLimite) 
				+ "\nPrazo: " + prazo + "dia(s)";
	}
	
	//getters e setters
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataLimite() {
		return dataLimite;
	}
	public void setDataLimite(Date dataLimite) {
		this.dataLimite = dataLimite;
	}
	public long getPrazo() {
		return prazo;
	}
	
	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}
	
}
