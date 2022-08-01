package com.github.codestickers;

public class ImportantTest {

    @Important("first one")
    @Important("duplicate")
    public static class SomeClass {
        @Important("check if really required")
        public SomeClass() {
        }

        public @Important("dont know how") Void m(@Important long param) {
            return null;
        }
    }
}
