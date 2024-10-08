//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.example.triangulo;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class triangulo_Test {
    public triangulo_Test() {
    }

    @Test
    public void triangulo_Test() {
        triangulo tr = new triangulo();
        Assertions.assertTrue(tr.isTriangle(3, 4, 5));
        Assertions.assertFalse(tr.isTriangle(1, 1, 3));
    }
}
