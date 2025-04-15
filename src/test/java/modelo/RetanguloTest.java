package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Davi Dias Perius
 */
public class RetanguloTest {

    @Test
    public void testGetArea() {
        double altura = 3;
        double base = 2;
        //Retorno esperado para a altura e base especificada
        double retornoEsperado = 6;
        //Instancia um objeto da classe Triangulo
        Retangulo retangulo = new Retangulo(base, altura);
        //Chama a operacao getArea()
        double retornoFeito = retangulo.getArea();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 6);
    }

}
