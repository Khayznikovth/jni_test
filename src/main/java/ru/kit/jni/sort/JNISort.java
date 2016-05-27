package ru.kit.jni.sort;

/**
 * Created by khayz on 23.05.2016.
 */
public class JNISort {
    static {
        System.loadLibrary("JNI_sort");
    }

    public native int inc(int num);

    public static void main(String[] args) {
        System.out.println(new JNISort().inc(1));
    }
}
