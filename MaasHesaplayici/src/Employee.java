public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double taxAmount;
    double bonus;
    double raisingAmount;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

     public double tax(){
        if (this.salary >= 1000){
            return salary * 0.03;
        }
        return 0;
    }

    public double bonus(){
        if (this.workHours > 40){
            int extra = this.workHours - 40;
            return 30 * extra;
        }
        return 0;
    }

    public double raiseSalary() {
        int year = 2021 - this.hireYear;
        if (year < 10) {
            return this.salary * 0.05;
        }else if (year >= 9 && year < 20) {
            return this.salary * 0.10;
        }else {
            return this.salary * 0.15;
        }
    }

    void toString(Employee e1) {
        double result = e1.salary - e1.tax() + e1.bonus();
        System.out.println("Adı : " + e1.name);
        System.out.println("Maaşı : " + e1.salary);
        System.out.println("Çalışma Saati : " + e1.workHours);
        System.out.println("Başlangıç Yılı: " + e1.hireYear);
        System.out.println("Vergi : " + e1.tax());
        System.out.println("Bonus : " + e1.bonus());
        System.out.println("Maaş Artışı : " + e1.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + result);
        System.out.println("Toplam Maaş : " + (result + e1.raiseSalary()));
    }


}
