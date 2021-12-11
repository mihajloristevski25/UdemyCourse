package com.mihajlo;

interface Acessible {
    int SOME_CONSTANT = 100; // package-private
    public void methodA();// public
    void methodB(); // public
    boolean methodC();//public
}
