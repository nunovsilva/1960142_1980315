/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testedespesas;

/**
 *
 * @author Nuno
 */
public class Despesa {
    
    private int valor;
    private String descricao;

    public Despesa() {
    }

    public Despesa(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    
    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
    
}
