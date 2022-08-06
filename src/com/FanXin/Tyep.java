package com.FanXin;

public class Tyep<T> {
    private T T;

    public Tyep(T t) {
        T = t;
    }

    public Tyep() {
    }

    @Override
    public String toString() {
        return "Tyep{" +
                "T=" + T +
                '}';
    }

    public T getT() {
        return T;
    }

    public void setT(T t) {
        T = t;
    }
}
