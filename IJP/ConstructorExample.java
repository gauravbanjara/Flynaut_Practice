package IJP;

public class ConstructorExample{
    private int rollNo;
    private String name;
    private String sub;

    public ConstructorExample(int rollNo, String name, String sub) {
        this.rollNo = rollNo;
        this.name = name;
        this.sub = sub;
    }

    @Override
    public String toString() {
        return "ConstructorExample{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", sub='" + sub + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample(1,"Gaurav","Java");


        System.out.println(obj);
    }

}
