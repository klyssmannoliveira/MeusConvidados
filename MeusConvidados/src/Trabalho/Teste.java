package Trabalho;

public class Teste {
	static Convidado a1;
	static Convidado a2;
	static Tarefa t1;
	static Tarefa t2;
	static Evento e1;
	static Gasto g1;
	static Gasto g2;
	static Gasto g3;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		e1 = new Evento("Casamento", "30/03/2021", 18, 23);
		a1 = new Convidado("Klyssmann", 1);
		a2 = new Convidado("Giovanna", 5);
		t1 = new Tarefa("Buscar flores", "20/03/2021");
		t1.setPrazo();
		t2 = new Tarefa("Buscar alianças", "15/03/2021");
		t2.setPrazo();
		t2.setConcluido(true);
		g1 = new Bebida("Cervejas", 22.30, 1);
		g2 = new Comida("Salgados", 100.00, 100);
		g3 = new Musica("The Beatles", 100.00);
		 System.out.println(t1.toString());

		e1.adicionarConvidado(a1);
		e1.adicionarConvidado(a2);
		e1.adicionarTarefa(t1);
		e1.adicionarTarefa(t2);
		e1.adicionarGasto(g1);
		e1.adicionarGasto(g2);
		e1.adicionarGasto(g3);
		
		e1.listarConvidados();
		e1.listarTarefas();
		e1.listarGasto();

	}

}
