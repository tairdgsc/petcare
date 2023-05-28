package model;

import java.awt.List;
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Taila
 */
@Entity
@Table(name = "ong")
    public class Ong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="foco")
    private String foco;
    
    @Column(name="contato")
    private String contato;
    
    @Column(name="email")
    private String email;
    
    @Column(name="senha")
    private String senha;
    
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "ong_pessoa",
        joinColumns = { @JoinColumn(name = "ong_id") },
        inverseJoinColumns = { @JoinColumn(name = "pessoa_id") }
    )
    private Set<Pessoa> pessoas = new HashSet<>();
    
    @OneToMany(mappedBy = "ong", cascade = CascadeType.ALL, orphanRemoval = true)
    private ArrayList<Animal> animais = new ArrayList<>();
    
    @OneToMany(mappedBy = "ong", cascade = CascadeType.ALL, orphanRemoval = true)
    private ArrayList<Atividade> atividades = new ArrayList<>();
    
    @OneToMany(mappedBy = "ong", cascade = CascadeType.ALL, orphanRemoval = true)
    private ArrayList<Adocao> adocoes = new ArrayList<>();
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
    
    @OneToMany(mappedBy = "ong", cascade = CascadeType.ALL, orphanRemoval = true)
    private ArrayList<Despesa> despesas = new ArrayList<>();
    
    public int getId() {
        return id;
    }

    public Set<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(Set<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(ArrayList<Animal> animais) {
        this.animais = animais;
    }

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(ArrayList<Atividade> atividades) {
        this.atividades = atividades;
    }

    public ArrayList<Adocao> getAdocoes() {
        return adocoes;
    }

    public void setAdocoes(ArrayList<Adocao> adocoes) {
        this.adocoes = adocoes;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(ArrayList<Despesa> despesas) {
        this.despesas = despesas;
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

    public String getFoco() {
        return foco;
    }

    public void setFoco(String foco) {
        this.foco = foco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public Ong() {
    }

}
