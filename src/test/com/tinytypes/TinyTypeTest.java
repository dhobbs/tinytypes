package com.tinytypes;

import junit.framework.Assert;
import org.junit.Test;

public class TinyTypeTest {
    private static class One extends TinyType<String> {
        public One(String value) {
            super(value);
        }
    }

    private static class Two extends TinyType<String> {
        public Two(String value) {
            super(value);
        }
    }

    private static class Three extends TinyType<Long> {
        public Three(Long value) {
            super(value);
        }
    }

    @Test
    public void shouldFindEqualTypesEqual() {
        Assert.assertFalse(new One("Bob").equals(new Two("Bob")));
        
        Assert.assertEquals(0, new One("Bob").compareTo(new Two("Bob")));

        Assert.assertTrue(new One("Bob").equals(new One("Bob")));

        Assert.assertTrue(new One("Bob").compareTo(new One("Bob")) == 0);

        Assert.assertEquals("a".compareTo("b"), new One("a").compareTo(new One("b")));

    }
}
