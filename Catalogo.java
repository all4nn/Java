package Principal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Livro> lista = new ArrayList<>();

    public void addLivro(Livro livro) {
        lista.add(livro);
    }

    public Livro getLivro(int id) {
        return lista.get(id);
    }

    public void printCatalogo() {
        for (Livro livro : lista) {
            livro.printLivro();
        }
    }

    public void removerLivro(int id) {
        lista.remove(id);
    }

    public int ultimo() {
        return lista.size();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Livro> getLista() {
        return lista;
    }

    public void setLista(List<Livro> lista) {
        this.lista = lista;
    }
}
