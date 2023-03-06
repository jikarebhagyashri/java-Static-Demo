public class Main {
    public static void main(String[] args) {


                //System.out.println("Company = " + Emp.company);
                //Emp.company = "New BitCode";

                System.out.println("Company = " + Emp.getCompany());

                Emp e1 = new Emp( "Shaa",10000);
                Emp e2 = new Emp( "Ro", 12000);
                Emp e3 = new Emp( "Pratiksha", 14000);

                e1.display();
                e2.display();
                e3.display();

                e1.setCompany("BitCode P L");
                System.out.println(e1.getCompany());

                e1.display();
                e2.display();
                e3.display();



    }
}