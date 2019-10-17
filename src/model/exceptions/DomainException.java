package model.exceptions;

public class DomainException extends RuntimeException{ //runtimeexception tipo de excecao que o compilador nao obriga a tratar
    
    public DomainException(String msg){
        super(msg);
    }
}
