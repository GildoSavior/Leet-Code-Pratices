package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var isTrue = isPalindrome(323);

        System.out.println(isTrue);
    }


    public static boolean isPalindrome(int x) {

//        if( x<0 ) return false;
//
//        String reversedString = new StringBuilder(String.valueOf(x)).reverse().toString();
//
//        long reversedNumber = Long.parseLong(reversedString);
//
//        return x == reversedNumber;

        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10; // Adicionar o último dígito de x ao reverso
            x /= 10; // Remover o último dígito de x
        }

        // Verificar se x é igual ao reverso ou à metade truncada
        return x == reversedHalf || x == reversedHalf / 10;
    }
}