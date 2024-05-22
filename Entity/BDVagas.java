package Entity;

import java.util.LinkedList;

public class BDVagas {
    private static BDVagas instance;
    //LinkedLists utilizadas para armazenar as vagas existentes e candidaturas
    LinkedList<Vaga> listaVagas = new LinkedList<Vaga>();

    //Criando vagas manualmente
    public void adicionarVaga(Vaga vaga) {
        listaVagas.add(vaga);
    }

    public static BDVagas getInstance() {
        if (instance == null) {
            instance = new BDVagas();
        }
        return instance;
    }
    public LinkedList<Vaga> listarVagas() {
        return this.listaVagas;
    }
}
