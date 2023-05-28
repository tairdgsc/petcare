package model;

import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
/**
 *
 * @author Taila
 */
@Entity
public class Adocao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nome_adotante")
    private String nome_adotante;
    
    @Column(name = "nome_animal")
    private String nome_animal;
    
    @Column(name = "data_adocao")
    private Date data_adocao;
    
    @Column(name = "historico_animal")
    private String historico_animal;
    
    @Column(name = "historico_adotante")
    private String historico_adotante;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ong_id")
    private Ong ong;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_id")
    private Pessoa adotante;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "animal_id")
    private Animal animal;

    public Ong getOng() {
        return ong;
    }

    public void setOng(Ong ong) {
        this.ong = ong;
    }

    public Pessoa getAdotante() {
        return adotante;
    }

    public void setAdotante(Pessoa adotante) {
        this.adotante = adotante;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }


public Adocao() {
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_adotante() {
        return nome_adotante;
    }

    public void setNome_adotante(String nome_adotante) {
        this.nome_adotante = nome_adotante;
    }

    public String getNome_animal() {
        return nome_animal;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    public Date getData_adocao() {
        return data_adocao;
    }

    public void setData_adocao(Date data_adocao) {
        this.data_adocao = data_adocao;
    }

    public String getHistorico_animal() {
        return historico_animal;
    }

    public void setHistorico_animal(String historico_animal) {
        this.historico_animal = historico_animal;
    }

    public String getHistorico_adotante() {
        return historico_adotante;
    }

    public void setHistorico_adotante(String historico_adotante) {
        this.historico_adotante = historico_adotante;
    }

}
