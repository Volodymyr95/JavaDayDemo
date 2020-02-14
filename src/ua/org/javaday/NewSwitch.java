package ua.org.javaday;

public class NewSwitch {

    public static void main(String[] args) {
        var result = switch ("December") {
            case "December", "January", "February" -> "Winter";
            case "March", "April", "May" -> "Spring";
            default -> "Summer or Authumn";
        };

        var value = switch ("hi") {
            case "hi" -> {
                System.out.println("I am not just yielding!");
                yield 1;
            }
            case "hello" -> {
                System.out.println("Me too.");
                yield 2;
            }
            default -> {
                System.out.println("OK");
                yield -1;
            }

        };
    }
}
