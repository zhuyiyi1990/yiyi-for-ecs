package com.github.zhuyiyi1990.ecsolutions.yiyiforecs;

import com.github.zhuyiyi1990.ecsolutions.utils.TripleDES;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YiyiForEcsApplicationTests {

    @Test
    void contextLoads() {
        TripleDES tripleDES = null;
        try {
            tripleDES = new TripleDES();
            String decryptedString = tripleDES.decrypt("qX/+kKiz+sthA1hepoCiPzYpnYNuMKLL");
            System.out.println(decryptedString);
        } catch (TripleDES.EncryptionException e) {
            e.printStackTrace();
        }
    }

}
