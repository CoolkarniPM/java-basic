import java.util.ArrayList;
import java.util.List;

public class SeparateElements {
    public static void main(String[] args) {
        String input = "a+b*(c-{d}/[2])";

        List<Character> numbers = new ArrayList<>();
        List<Character> operators = new ArrayList<>();
        List<Character> brackets = new ArrayList<>();
        List<Character> alphabets = new ArrayList<>();

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                numbers.add(ch);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operators.add(ch);
            } else if (ch == '(' || ch == ')' || ch == '{' || ch == '}' || ch == '[' || ch == ']') {
                brackets.add(ch);
            } else if (Character.isLetter(ch)) {
                alphabets.add(ch);
            }
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Operators: " + operators);
        System.out.println("Brackets: " + brackets);
        System.out.println("Alphabets: " + alphabets);
    }
}
