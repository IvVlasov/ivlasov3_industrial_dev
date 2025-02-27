package testproject;

/**
 * Класс для обработки строк
 */
public class StringProcessor {
    
    /**
     * Переворачивает строку
     * @param input Входная строка
     * @return Перевернутая строка
     */
    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        
        return reversed.toString();
    }
} 