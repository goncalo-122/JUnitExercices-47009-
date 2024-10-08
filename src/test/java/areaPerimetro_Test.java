//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.example.areaPerimetro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class areaPerimetro_Test {
    public areaPerimetro_Test() {
    }

    @Test
    public void testAreaPerim() {
        areaPerimetro areaP = new areaPerimetro();
        int area1 = areaP.area(3, 5);
        int testArea1 = 15;
        int area2 = areaP.area(5, 8);
        int testArea2 = 40;
        int area3 = areaP.area(2, 4);
        int testArea3 = 8;
        int perm1 = areaP.perimetro(3, 5);
        int testPer1 = 16;
        int perm2 = areaP.perimetro(5, 8);
        int testPer2 = 26;
        int perm3 = areaP.perimetro(2, 4);
        int testPer3 = 12;
        Assertions.assertEquals(area2, testArea2);
        Assertions.assertEquals(area1, testArea1);
        Assertions.assertEquals(area3, testArea3);
        Assertions.assertEquals(perm1, testPer1);
        Assertions.assertEquals(perm2, testPer2);
        Assertions.assertEquals(perm3, testPer3);
    }
}
