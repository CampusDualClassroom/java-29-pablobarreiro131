package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        int [] array = new int [2];
        try{
            for (int i = 0; i<5 ; i++){
                array[i]=i;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No hay espacio en el array.");
        }
    }
}
