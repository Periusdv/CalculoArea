package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Davi Dias Perius
 */
public class TrianguloTest {

    @Test
    public void testGetArea() {
        double altura = 3;
        double base = 2;
        //Retorno esperado para a altura e base especificada
        double retornoEsperado = 3;
        //Instancia um objeto da classe Triangulo
        Triangulo triangulo = new Triangulo(base, altura);
        //Chama a operacao getArea()
        double retornoFeito = triangulo.getArea();
        //Premissa verifica se os valores são iguais
        assertEquals(retornoEsperado, retornoFeito, 3);
    }
}
