/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testedespesas;

/**
 *
 * @author Nuno
 */
public class RegDespController {
    
    private int valor;
    private String descricao;

    public RegDespController() {
    }

    public RegDespController(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    
    public int getValor() {
        return valor;
    }

    
    public void setValor(int valor) {
        this.valor = valor;
    }

    
    public String getDescricao() {
        return descricao;
    }

   
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    public String toString() {
        return super.toString();
    }
    
    
    
    
}
