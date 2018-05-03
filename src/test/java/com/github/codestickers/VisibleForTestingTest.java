package com.github.codestickers;

public class VisibleForTestingTest {

    @VisibleForTesting
    public static class SomeClass {
        @VisibleForTesting
        public SomeClass() {
        }

        public @VisibleForTesting Void m(@VisibleForTesting long param) {
            return null;
        }
    }
}
