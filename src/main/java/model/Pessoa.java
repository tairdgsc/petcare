package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    Endereco endereco;
    
    @Column(name="telefone")
    private String telefone;
    
    @Column(name="email")
    private String email;
    
    @Column(name="papel")
    public Papel papel;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ong_id")
    private Ong ong;
    
    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Atividade> atividades = new HashSet<>();

    public Set<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(HashSet<Atividade> atividades) {
        this.atividades = atividades;
    }


    

public enum Papel {
voluntario,
funcionario,
adotante,
gerente}

public Pessoa() {
}

    public int getId() {
        return id;
    }

    public Ong getOng() {
        return ong;
    }

    public void setOng(Ong ong) {
        this.ong = ong;
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


    
    public Pessoa( String nome, String cpf, Endereco endereco, String telefone, String email,
              Papel papel, Ong ong, Set<Atividade> atividades) {
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
    this.telefone = telefone;
    this.email = email;
    this.papel = papel;
    this.ong = ong;
    this.atividades = atividades;
}


}