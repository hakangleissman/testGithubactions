package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextUtilTest {
    @Test
    public void testFormatStringToNameFormat(){
        TextUtil util = new TextUtil();
        String toFormat = "KALLE";
        Assertions.assertEquals("kalle", util.toNameFormat(toFormat));
    }
}
