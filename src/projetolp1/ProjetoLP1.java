package projetolp1;

public class ProjetoLP1 {

    public static void main(String[] args) {
        Eletronicos e[] = new Eletronicos[3];
        Estoque est = new Estoque();
        Pereciveis p[] = new Pereciveis[2];
        
        e[0] = new Eletronicos(001, "Celular", "Apple", 1200.0, 10,"Bom");
        e[1] = new Eletronicos(002, "Notebook", "Dell", 2500.0, 980, "Bom");
        p[0] = new Pereciveis(120, "Leite", "Nestle", 5.50,10,12);
        p[1] = new Pereciveis(122,"Feijao", "Joao", 7.50, 10, 6);
        
        est.adicionarAoEstoque(p[1]);
        est.adicionarAoEstoque(e[0]);
        est.adicionarAoEstoque(p[0]);
        est.statusEstoque();
    }
    
}
