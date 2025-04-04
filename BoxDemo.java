class Box {
    double width;
    double height;
    double depth;
}

class BoxDemo {
    public static void main(String args[]) {
        Box mybox = new Box();
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

       
        double vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("The volume of the box is: " + vol);
    }
}
