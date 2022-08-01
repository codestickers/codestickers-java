package com.github.codestickers;

public class MagicTest {

    @Magic
    public static class SomeClass {
        @Magic("Copied from stackoverflow")
        public SomeClass() {

        }

        @Magic("I don't know what's happening here")
        public static void crazyCodeNinjaShit(@Magic("Only the lord knows where this value comes from") String theHolyScript) {
        }
    }
}
