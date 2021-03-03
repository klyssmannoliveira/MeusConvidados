package Trabalho;

public class Teste {
	static Convidado a1;
	static Convidado a2;
	static Tarefa t1;
	static Tarefa t2;
	static Evento e1;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		a1 = new Convidado("Klyssmann", 1);
		a2 = new Convidado("Giovanna", 5);
		t1 = new Tarefa("Buscar flores", "10/03/2021");
		t1.setPrazo();
		e1 = new Evento("Casamento", "12/03/2021", 18, 23);
		e1.adicionarConvidado(a1);
		e1.adicionarConvidado(a2);
		e1.adicionarTarefa(t1);
		
		e1.listarConvidados();
		e1.listarTarefas();

	}

}
