package com.fun.thread;

/**
 * Created by fun on 16/8/15.
 * @deprecated 优惠券发放
 */
public class TestTread implements Runnable{

    public enum Type {
        Static("静态变量" ,1), PROPERTY("静态变量" ,1) , FUNVAR("静态变量" ,1);

        private Type(String name, Integer index) {
            this.name = name;
            this.index = index;
        }

        private String name;
        private Integer index;

        public String toString(){  //覆盖了父类Enum的toString()
            return super.toString()+"("+this.name+","+this.index+")";
        }
    };

    private Type whichType;
    private Integer num = 10;
    private static Integer numStatic = 10;
    private String name;

    public TestTread(String name, Type type) {
        this.name = name;
        System.out.println(type);
        whichType = type;
    }

    public void run() {
        switch (whichType) {
            case PROPERTY:
                runProperty();
                break;
            case FUNVAR:
                runVar();
                break;
            case Static:
                runStatic();
                break;
        }
    }

    private void runStatic() {
        while(true){
            if( numStatic > 0) {
                System.out.println(name + ":" + numStatic);
                numStatic -- ;
            } else {
                break;
            }
        }
    }

    private void runProperty() {
        while(true){
            if( this.num > 0) {
                System.out.println(name + ":" + this.num);
                this.num -- ;
            } else {
                break;
            }
        }
    }

    private void runVar() {
        Integer num = 10;
        while(true){
            if( num > 0) {
                System.out.println(name + ":" + num);
                num -- ;
            } else {
                break;
            }
        }
    }

}
