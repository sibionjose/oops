class Statement {
    public static void main(String args[]) {
        int num1 = 100;
        int num2 = 200;
        int num3 = 150;

        // Declare 'largest' variable
        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("The largest number is = " + largest);
    }
}
