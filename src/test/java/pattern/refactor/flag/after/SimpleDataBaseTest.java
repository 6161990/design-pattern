package pattern.refactor.flag.after;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

class SimpleDataBaseTest {

    @Test
    void after() throws IOException {
        SimpleDataBase simpleDataBase = new SimpleDataBase(new FileReader("/Users/6161990src/Documents/GitHub/design-pattern/src/test/java/pattern/refactor/flag/test.txt"));

        Iterator<String> ir = simpleDataBase.iterator();

        while (ir.hasNext()){
            String key = ir.next();
            System.out.println("key:" + key);
            System.out.println("value:" + simpleDataBase.getValue(key));
        }
    }
}