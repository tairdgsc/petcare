package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Taila
 */
@Entity
@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "especie")
    private String especie;

    @Column(name = "raca")
    private String raca;

    @Column(name = "idade")
    private int idade;

    @Column(name = "sexo")
    private Sexo sexo;

    @Column(name = "cor")
    private String cor;

    @Column(name = "peso")
    private String peso;

    @Column(name = "pelagem")
    private String pelagem;

    @Column(name = "observacao")
    private String observacao;

    @Column(name = "tamanho")
    private String tamanho;
    
    @Column(name = "historico_saude")
    private String historico_saude;

    @Column(name = "comportamento")
    private String comportamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ong_id")
    private Ong ong;

    public Animal() {
    }

    public Animal(String nome, String especie, String raca, int idade, Sexo sexo, String cor,
            String peso, String pelagem, String observacao, String tamanho,
            String historico_saude, String comportamento, Ong ong) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.sexo = sexo;
        this.cor = cor;
        this.peso = peso;
        this.pelagem = pelagem;
        this.observacao = observacao;
        this.tamanho = tamanho;
        this.historico_saude = historico_saude;
        this.comportamento = comportamento;
        this.ong = ong;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public enum Sexo {
        M,
        F
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getHistorico_saude() {
        return historico_saude;
    }

    public void setHistorico_saude(String historico_saude) {
        this.historico_saude = historico_saude;
    }

    public String getComportamento() {
        return comportamento;
    }

    public void setComportamento(String comportamento) {
        this.comportamento = comportamento;
    }

}
