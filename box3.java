class Box3 {
    double width;
    double height;
    double depth;

    
    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

   
    void volume() {
        System.out.println("The volume of the box is: " + (width * height * depth));
    }

    public static void main(String[] args) {
       
        Box3 box = new Box3(10, 20, 15);
        Box3 box1 = new Box3(3, 6, 9);
        
       
        box.volume();
box1.volume();
    }
}
