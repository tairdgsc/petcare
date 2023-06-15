package model;

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
import javax.persistence.Table;
import java.util.Date;
/**
 *
 * @author Taila
 */
@Entity
@Table(name = "adocao")
public class Adocao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "status")
    private Status status;

    @Column(name = "data_adocao")
    private Date data_adocao;

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

    public enum Status {
        RECUSADA,
        APROVADA,
        ESPERANDO
    }

    public void setOng(Ong ong) {
        this.ong = ong;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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
    
    public Adocao() {}

    public Adocao(Status status, Ong ong, Pessoa adotante, Animal animal) {
        this.status = status;
        this.ong = ong;
        this.adotante = adotante;
        this.animal = animal;
        this.data_adocao = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData_adocao() {
        return data_adocao;
    }

    public void setData_adocao(Date data_adocao) {
        this.data_adocao = data_adocao;
    }

}
