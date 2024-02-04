package automation;

public class MoveHelper {

    public static void main(String[] args) throws Throwable {
        String moves = "RRRRULDDLURUURRDRDRULLURDRDDRDLDDRRUDLLUURULUULULDRULLLDDDLDLLDLU";
        printMoves(moves);
    }

    //automatically write lines of code for moves given a sequence of moves
    public static void printMoves(String moves) {
        // run until moves is empty
        while (!moves.isEmpty()) {
            //check first character of moves
            switch (moves.substring(0, 1)) {
                case "U":
                    System.out.println("move(\"up\");");
                    break;
                case "D":
                    System.out.println("move(\"down\");");
                    break;
                case "L":
                    System.out.println("move(\"left\");");
                    break;
                case "R":
                    System.out.println("move(\"right\");");
                    break;
                case "_":
                    System.out.println("move(\"space\");");
                    break;
            }
            //remove the first character in moves to incrementally write a line of code for each character
            moves = moves.substring(1);
        }
    }
}
