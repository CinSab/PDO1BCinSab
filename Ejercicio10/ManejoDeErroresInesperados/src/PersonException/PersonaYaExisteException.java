package PersonException;

import Persona.Persona;

public class PersonaYaExisteException extends PersonaException{
    PersonaYaExisteException(){}
    PersonaYaExisteException(String detailMessage){ super(detailMessage);}
}
