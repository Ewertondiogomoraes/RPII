/**
 *
 * @author vagne
 */ // implementar manipulações no inventário / pegar arma do chão e jogar fora / usar potion / história / trocar de armas
package ItemJogo;

import java.util.ArrayList;
import raca.Humano;
import rpii.Arqueiro;
import rpii.Especialidade;
import rpii.Raca;

public class Principal {

    private ArrayList<Item> dispensa = new ArrayList<Item>();

    public static void main(String args[]) {
        Especialidade arqueiro = new Arqueiro();
        Raca humano = new Humano("Vagner", arqueiro);
        Principal p = new Principal();
        // Adicionar itens na dispensa
        p.configuraDispensa(humano.getClasseJogador());
        // Pegar item da dispensa
        humano.adicionarItem(p.getDispensa().get(0));
        // Recompensa por matar um bixo
        humano.adicionarItem(Itens.ESPADADEGELO);
        // Comer um item
        Comida JABUTICABA = (Comida) humano.getInventario().pegarItem(0);
        humano.comer(JABUTICABA);
    }

    public void inicializarJogador() {
        Especialidade arqueiro = new Arqueiro();
        Raca humano = new Humano("Vagner", arqueiro);

    }

    public void configuraDispensa(Especialidade classe) {
        getDispensa().add(Itens.CAMISA);
        getDispensa().add(Itens.JABUTICABA);

        if (classe.getDescricao().equals("Humano")) {
            getDispensa().add(Itens.FACA);
        }
        if (classe.getDescricao().equals("Anao")) {
            getDispensa().add(Itens.CAJADO);
        }
        if (classe.getDescricao().equals("Elfo")) {
            getDispensa().add(Itens.ARCO);
        }
        if (classe.getDescricao().equals("Orc")) {
            getDispensa().add(Itens.FACA);
        }
        if (classe.getDescricao().equals("Undead")) {
            getDispensa().add(Itens.CAJADO);
        }
    }

    public Item[] recompensaBoss1(Especialidade classe) {
        Item[] recompensa = new Item[1];
        if (classe.getDescricao().equals("Humano")) {
            System.out.println("Você ganhou uma " + Itens.ESPADALONGA + " e uma " + Itens.CARNE + "");
            recompensa[0] = Itens.ESPADALONGA;
            recompensa[1] = Itens.CARNE;
            return recompensa;
        } else if (classe.getDescricao().equals("Anao")) {
            System.out.println("Você ganhou um " + Itens.CAJADODEFOGO + " e uma " + Itens.CARNE + "");
            recompensa[0] = Itens.CAJADODEFOGO;
            recompensa[1] = Itens.CARNE;
            return recompensa;
        } else if (classe.getDescricao().equals("Elfo")) {
            System.out.println("Você ganhou um " + Itens.ARCOANTIGO + " e uma " + Itens.CARNE + "");
            recompensa[0] = Itens.ARCOANTIGO;
            recompensa[1] = Itens.CARNE;
            return recompensa;
        } else if (classe.getDescricao().equals("Orc")) {
            System.out.println("Você ganhou uma " + Itens.ESPADALONGA + " e uma " + Itens.CARNE + "");
            recompensa[0] = Itens.ESPADALONGA;
            recompensa[1] = Itens.CARNE;
            return recompensa;
        } else if (classe.getDescricao().equals("Undead")) {
            System.out.println("Você ganhou um " + Itens.CAJADODEFOGO + " e uma " + Itens.CARNE + "");
            recompensa[0] = Itens.CAJADODEFOGO;
            recompensa[1] = Itens.CARNE;
            return recompensa;
        } else {
            return recompensa;
        }
    }

    public ArrayList<Item> getDispensa() {
        return dispensa;
    }

    public void setDispensa(ArrayList<Item> dispensa) {
        this.dispensa = dispensa;
    }
}
