package com.grupoht3;

public class App 
{
    public static void main( String[] args )
    {
        MetodosDeOrdenamiento prueba = new MetodosDeOrdenamiento();
        int[] arr = prueba.generateRandomArray(30, 0, 50);
        System.out.println(arr);
        System.out.println();
    }
}
