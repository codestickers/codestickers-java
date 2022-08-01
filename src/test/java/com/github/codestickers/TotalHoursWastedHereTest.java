package com.github.codestickers;

public class TotalHoursWastedHereTest {

    @TotalHoursWastedHere("80h")
    public static class SomeClass {
        @TotalHoursWastedHere("0.01h")
        public SomeClass() {

        }

        @TotalHoursWastedHere("79.9h. Please update once you attempted to fix this.")
        public static void itSeemsSimpleToOptimizeButItIsNot(@TotalHoursWastedHere("0.09h. Many have come and failed") String val) {
        }
    }
}
