public class ArrayList {
    public static void main(String[] args) {
        String[] studentName = new String[30];
        studentName[0] = "John";
        studentName[1] = "Mary";
        studentName[29] = "Harsh";
        System.out.println(studentName[2]); // null
        System.out.println(studentName[1]); // null

    }
}