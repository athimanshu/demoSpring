public class Triangle {
    private String type;

    public int getHeight() {
        return height;
    }

    private int height;
    //Constructor Injection
    Triangle(String type)
    {
        this.type=type;
    }

    public Triangle(String type, int height)
    {
        this.type=type;
        this.height=height;
    }

    public String getType() {
        return type;
    }

    //Commenting out the setter to use contructor injection
//    public void setType(String type) {
//        this.type = type;
//    }

    public void draw()
    {
        //System.out.println(getType()+" Triangle drawn");
        System.out.println(getType() +" Triangle drawn of height "+ getHeight());
    }
}
