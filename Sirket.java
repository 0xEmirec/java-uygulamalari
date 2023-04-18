public class Sirket {
    public static void main(String[] args) {
        Calisan calisan1 = new Calisan(1,"Emir","Yardim",15750);
        Calisan calisan2 = new Calisan(2,"Kevin","Mitnick",15350);
        Calisan calisan3 = new Calisan(3,"John","Dalton",8500);
        Calisan calisan4 = new Calisan(4,"Carla","Big",11340);
        Calisan calisan5 = new Calisan(5,"Selin","Adiguzel",12780);
        System.out.println("Çalışan sayısı : "+Calisan.getPerson());
        calisan1.calisanBilgileri();

    }
}

class Calisan{
    private int number;
    private String name;
    private String surname;
    private int salary;
    private static int person;

    public Calisan(){}

    public Calisan(int number, String name, String surname, int salary) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        person++;
    }

    void calisanBilgileri(){
        System.out.println("No : "+getNumber()+" Name : "+getName()+" Surname : "+getSurname()+" Salary : "+getSalary());
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getPerson() {
        return person;
    }

    public static void setPerson(int person) {
        Calisan.person = person;
    }

    @Override
    public String toString() {
        return "No : "+getNumber()+" Name : "+getName()+" Surname : "+getSurname()+" Salary : "+getSalary();
    }
}