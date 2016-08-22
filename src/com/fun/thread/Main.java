package com.fun.thread;

import com.fun.file.FileTest;
import com.fun.generics.*;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by fun on 16/8/10.
 */
public class Main {


    public static void main(String[] args) {
        try {
            javaSocket();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void java201608() {
        // write your code here
        System.out.println("Hello, World");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        threadDemo();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        testGenerics<String> a = new testGenerics<String>("test1");
        testGenerics<Integer> b = new testGenerics<Integer>(123);
        System.out.println(a.getData());
        System.out.println(b.getData());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        FileTest f = new FileTest();
        try {
            f.fileRead();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void javaSocket() throws Exception{

        ServerSocket server = new ServerSocket(4001);//bind port

        Socket socket = server.accept();//accept

        String line; //input read string

        //get read line
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //output
        PrintWriter output = new PrintWriter(socket.getOutputStream());

        boolean flag = true;

        while(flag && (line = bufferedReader.readLine()) != null ) {
            System.out.println(line);
            output.println(line);
            output.flush();
            if (line.equals("exit")) {
                output.println("byebye");
                output.flush();
                bufferedReader.close();
                output.close();
                socket.close();
                flag = false;
            }
        }
    }

    private static void threadDemo() {
        TestTread t = new TestTread("入口一", TestTread.Type.FUNVAR);
        TestTread t1 = new TestTread("入口一", TestTread.Type.FUNVAR);

//        TestTread t3 = new TestTread("入口二", TestTread.Type.PROPERTY);
//        TestTread t4 = new TestTread("入口二", TestTread.Type.PROPERTY);

        TestTread t6 = new TestTread("入口三", TestTread.Type.Static);
        TestTread t7 = new TestTread("入口三", TestTread.Type.Static);
        t.run();
        t1.run();

        /*t3.run();
        t4.run();*/

        t6.run();
        t7.run();
    }

}
