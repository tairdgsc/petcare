package model;

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

    @Column(name = "nome")
    private String nome;

    @Column(name = "foco")
    private String foco;

    @Column(name = "contato")
    private String contato;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "ong_pessoa",
            joinColumns = {
                @JoinColumn(name = "ong_id")},
            inverseJoinColumns = {
                @JoinColumn(name = "pessoa_id")}
    )
    private Set<Pessoa> pessoas = new HashSet<>();

    @OneToMany(mappedBy = "ong", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Animal> animais = new HashSet<>();

    @OneToMany(mappedBy = "ong", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Atividade> atividade = new HashSet<>();

    @OneToMany(mappedBy = "ong", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Adocao> adocoes = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    @OneToMany(mappedBy = "ong", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Despesa> despesas = new HashSet<>();

    public int getId() {
        return id;
    }

    public Set<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(Set<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Set<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(Set<Despesa> despesas) {
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

    public Set<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(Set<Animal> animais) {
        this.animais = animais;
    }

    public Set<Atividade> getAtividades() {
        return atividade;
    }

    public void setAtividades(Set<Atividade> atividades) {
        this.atividade = atividades;
    }

    public Set<Adocao> getAdocoes() {
        return adocoes;
    }

    public void setAdocoes(Set<Adocao> adocoes) {
        this.adocoes = adocoes;
    }

    public Ong(String nome, String foco, String contato, String email, String senha, Set<Pessoa> pessoas,
            Set<Animal> animais, Set<Atividade> atividades, Set<Adocao> adocoes, Endereco endereco,
            Set<Despesa> despesas) {
        this.nome = nome;
        this.foco = foco;
        this.contato = contato;
        this.email = email;
        this.senha = senha;
        this.pessoas = pessoas;
        this.animais = animais;
        this.atividade = atividades;
        this.adocoes = adocoes;
        this.endereco = endereco;
        this.despesas = despesas;
    }

    public Ong() {
        // Empty constructor required by JPA
    }

}
