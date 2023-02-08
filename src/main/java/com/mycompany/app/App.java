/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

public class App {
    public static void main(String[] args) {

        
        String a = new String("hi");
        String b = new String("hi"); // new object in heap
        System.out.println(a==b); // false

        String c = "hi";
        String d = "hi"; // String constant pool in heap
        System.out.println(c==d); // true 

    }
}
