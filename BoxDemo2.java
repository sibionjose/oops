class Box {
    double width;
    double height;
    double depth;
}

class BoxDemo2 {
    public static void main(String args[]) {
        Box mybox = new Box();
	 Box mybox1 = new Box();
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
	mybox1.width = 8;
        mybox1.height = 6;
        mybox1.depth = 9;

       
        double vol = mybox.width * mybox.height * mybox.depth;
	double vol1 = mybox1.width * mybox1.height * mybox1.depth;

        System.out.println("The volume of the box is: " + vol);
	 System.out.println("The volume of the box1 is: " + vol1);
    }
}
