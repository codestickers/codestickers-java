package com.github.codestickers;

public class ForTestOnlyTest
{
    @ForTestOnly
    public static class SomeClass {

        @ForTestOnly
        public Object ref;

        @ForTestOnly
        public SomeClass() {
        }

        @ForTestOnly
        public Void m(long param) {
            return null;
        }
    }
}
