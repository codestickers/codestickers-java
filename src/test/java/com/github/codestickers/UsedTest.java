package com.github.codestickers;

public class UsedTest {

    @Used
    public static class SomeClass {
        @Used("by spring")
        public SomeClass() {
        }

        public @Used("by magic") Void m(@Used("though java says no") long param) {
            return null;
        }
    }
}
