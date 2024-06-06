package Materia.Ejercicio_01_sign;

import java.util.Stack;

public class ValidarSignos {
     public static boolean esValido(String a) {

            Stack<Character> stack = new Stack<>();

            for (char caracter : a.toCharArray()) {
                if (caracter == '(') stack.push(')');
                else if (caracter == '{') stack.push('}');
                else if (caracter == '[') stack.push(']');
                else if (stack.isEmpty() || stack.pop() != caracter) return false;
            }
            return stack.isEmpty();
    
    }
}
