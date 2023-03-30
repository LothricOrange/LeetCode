package com.math;

import java.util.Random;

public class _478_在圆内随机生成点 {
    double x;
    double y;
    double radius;

    public _478_在圆内随机生成点(double radius, double x_center, double y_center) {
        this.x = x_center;
        this.y = y_center;
        this.radius = radius;
    }

    public double[] randPoint() {
        Random random = new Random();
        double[] res = new double[2];
        while (true) {
            double dx = random.nextDouble() * 2 * radius - radius;
            double dy = random.nextDouble() * 2 * radius - radius;
            if (dx * dx + dy * dy <= radius * radius) {
                res[0] = x + dx;
                res[1] = y + dy;
                return res;
            }
        }
    }
}
