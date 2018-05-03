package com.github.codestickers;

public class FixMeTest {

    @FixMe
    public static class SomeClass {
        @FixMe("check if really required")
        public SomeClass() {
        }

        public @FixMe("dont know how") Void m(@FixMe long param) {
            return null;
        }
    }
}
