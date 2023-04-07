import java.util.Scanner;

class animal {
    private String name;
    private double height;
    private double weight;
    private double speed;

    public animal(String name, double height, double weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Speed: " + speed);
    }

    public double distance(int x, double y) {
        return x * y * speed;
    }

    public double distance(int x) {
        return x * speed;
    }

    public static void showinfo() {
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}

class human extends animal {
    private String gender;

    public human(String name, double height, double weight, double speed, String gender) {
        super(name, height, weight, speed);
        this.gender = gender;
    }

    public void show() {
        super.show();
        System.out.println("Gender: " + gender);
    }
}

class snow extends human {
    private String freezeSkill;

    public snow(String name, double height, double weight, double speed, String gender, String freezeSkill) {
        super(name, height, weight, speed, gender);
        this.freezeSkill = freezeSkill;
    }

    public void show() {
        super.show();
        System.out.println("Freeze Skill: " + freezeSkill);
    }

    public double distance(int x, double y) {
        return 2 * super.distance(x, y);
    }

    public double distance(int x) {
        return 2 * super.distance(x);
    }
}

public class A1103348_0331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        animal animal1 = new animal("Donkey", 1.5, 300, 10);
        animal animal2 = new animal("Snowball", 1.2, 150, 20);
        human human1 = new human("Hans", 1.8, 80, 30, "male");
        human human2 = new human("Anna", 1.6, 50, 25, "female");
        snow snowQueen = new snow("Elsa", 1.7, 60, 40, "female", "YES");

        animal1.show();
        System.out.print("Enter time(min): ");
        int time1 = sc.nextInt();
        System.out.print("Enter acceleration(double): ");
        double acceleration1 = sc.nextDouble();
        System.out.println("Distance: " + animal1.distance(time1, acceleration1) + " m");

        animal2.show();
        System.out.print("Enter time(min): ");
        int time2 = sc.nextInt();
        System.out.print("Enter acceleration(double): ");
        double acceleration2 = sc.nextDouble();
        System.out.println("Distance: " + animal2.distance(time2, acceleration2) + " m");

        human1.show();
        System.out.print("Enter time(min): ");
        int time3 = sc.nextInt();
        System.out.print("Enter acceleration(double): ");
        double acceleration3 = sc.nextDouble();
        System.out.println("Distance: " + human1.distance(time3, acceleration3) + " m");

        snowQueen.show();
        System.out.print("Enter time(min): ");
        int time4 = sc.nextInt();
        System.out.print("Enter acceleration(double): ");
        double acceleration4 = sc.nextDouble();
        System.out.println("Distance: " + snowQueen.distance(time4, acceleration4) + " m");
        System.out.println("Enter x: ");
        int x1 = sc.nextInt();
        System.out.println("Distance: " + snowQueen.distance(x1) + " m");
    }
}
