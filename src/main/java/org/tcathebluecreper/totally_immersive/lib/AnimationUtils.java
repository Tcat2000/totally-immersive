package org.tcathebluecreper.totally_immersive.lib;

public class AnimationUtils {
    public static float lerp(float min, float max, float amount) {
        return min * (1 - amount) + max * amount;
    }
    public static double lerp(double min, double max, double amount) {
        return min * (1 - amount) + max * amount;
    }
    public static float amount(float amount, float max) {
        return amount / max;
    }
}
