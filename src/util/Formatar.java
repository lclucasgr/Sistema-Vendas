/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author lcluc
 */
public class Formatar {

    public double converterVirgulaParaPonto(String p) {
        String retorno = new String();
        int tamanho = p.length();

        for (int i = 0; i < tamanho; i++) {
            if (p.charAt(i) == ',') {
                retorno += '.';
            } else {
                retorno += p.charAt(i);
            }
        }
        return Double.parseDouble(retorno);
    }

}
