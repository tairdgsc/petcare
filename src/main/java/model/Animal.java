package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Taila
 */

@Entity
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
    
    @Column(name = "tamanho")
    private String tamanho;
    
    @Column(name = "historico_saude")
    private String historico_saude;
    
    @Column(name = "comportamento")
    private String comportamento;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ong_id")
    private Ong ong;

enum Sexo {
M,
F}

public Animal() {
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
