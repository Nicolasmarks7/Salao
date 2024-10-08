import javax.swing.*;
import java.util.ArrayList;

public class CriarServico {

    private ArrayList<Servico> servicos = new ArrayList<>();

    public void criarServico(){
        Servico servico = new Servico();
        servico.setNome(JOptionPane.showInputDialog(null, "Digite o nome: ",
                "Nome",3));
        servico.setDescricao(JOptionPane.showInputDialog(null,
                "Digite a descrição do serviço: ","Descrição",3));
        servico.setValor(Float.parseFloat(JOptionPane.showInputDialog(null,
                "Digite o valor do serviço: ","Valor",3)));
        servicos.add(servico);
        Entrar.preencherServico(servico);
    }

}