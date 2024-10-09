import org.example.numMed;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class numMed_Test {
    private numMed numMed;

    @BeforeEach
    public void atualizaTemp(){
        numMed=new numMed();//Aqui inicializamos novamente o objeto antes de cada teste,funcionando como uma espécie de limpeza
    }
    @Test
    public void validarResultado(){
        int numero=12345;
        double resultadoE=1234.0;
        double resultado= numMed.calcularMediaDosDigitos( numero);
        assertEquals(resultado,resultadoE);
    }
}
