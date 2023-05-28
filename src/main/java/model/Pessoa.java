package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Taila
 */
@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="cpf")
    private String cpf;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cargo_id", referencedColumnName = "id")
    Endereco endereco;
    
    @Column(name="telefone")
    private String telefone;
    
    @Column(name="email")
    private String email;
    
    @Column(name="papel")
    private Papel papel;
    
    @ManyToMany(mappedBy = "pessoas")
    private Set<Ong> ongs = new HashSet<>();
    
    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, orphanRemoval = true)
    private ArrayList<Atividade> atividades = new ArrayList<>();

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(ArrayList<Atividade> atividades) {
        this.atividades = atividades;
    }


    

enum Papel {
voluntario,
funcionario,
adotante,
gerente}

public Pessoa() {
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Set<Ong> getOngs() {
        return ongs;
    }

    public void setOngs(Set<Ong> ongs) {
        this.ongs = ongs;
    }

}