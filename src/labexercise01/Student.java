
package labexercise01;

public class Student {
    
    private String name;
    private int Birthyr;
    private String major;

    
    public Student(String name, int Birthyr , String major) {
        this.name = name;
        this.Birthyr = Birthyr;
        this.major = major;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthyr() {
        return Birthyr;
    }

    public void setBirthyr(int Birthyr) {
        this.Birthyr = Birthyr;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

     @Override
    public String toString() {
        return " \nName: " + name +"\n" + " Birth year: " + Birthyr +"\n"+ " Major: " + major +"\n";
    }
}
