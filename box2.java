class Box2 {
    double width;
    double height;
    double depth;

    // Constructor to initialize the dimensions of the box
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate the volume
    void volume() {
        System.out.println("The volume of the box is: " + (width * height * depth));
    }

    public static void main(String[] args) {
        // Create an instance of Box2 with dimensions
        Box2 box = new Box2(10, 20, 15);
        box.volume();  // Call the volume method
    }
}
