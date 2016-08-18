package com.fun.generics;

import java.util.List;

/**
 * Created by fun on 16/8/18.
 * @deprecated 范型
 */
public class testGenerics<T> {

    private T data;

    public testGenerics(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

}
