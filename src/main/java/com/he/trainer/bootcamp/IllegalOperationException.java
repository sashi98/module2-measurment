package com.he.trainer.bootcamp;

public class IllegalOperationException  extends Exception {
    public IllegalOperationException(){
        System.out.println("IllegalOperationException: Operation not supported");
    }
}
