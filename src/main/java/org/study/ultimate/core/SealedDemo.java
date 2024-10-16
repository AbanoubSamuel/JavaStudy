package org.study.ultimate.core;

sealed public class SealedDemo permits SubSealed {
    public static void show() {
        System.out.println("Sealed demo");
    }
}