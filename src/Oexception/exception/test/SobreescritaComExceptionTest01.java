package Oexception.exception.test;

import java.io.FileNotFoundException;

import Oexception.exception.dominio.Funcionario;
import Oexception.exception.dominio.LoginInvalidoException;
import Oexception.exception.dominio.Pessoa;

public class SobreescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        
        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
        ;
    }
}
