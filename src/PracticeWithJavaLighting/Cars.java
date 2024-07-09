package PracticeWithJavaLighting;

public class Cars {
    private String Make;
    private  String Model;

    Cars(String Make, String Model){
        this.Make = Make;
        this.Model = Model;
    }

    public String getMake() {return Make;}
    public String getModel() {return Model;}

    public void setMake(String make) {Make = make;}
    public void setModel(String model) {Model = model;}
}

