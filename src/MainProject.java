public class MainProject {


    // args opvragen in IntelliJ via run/debug
    // het werkt als een array
    public static void main(String[] args) {
//        System.out.println(args[0]);
//        System.out.println(args[1]);

        if(args[0].equals("Hey")) {
            System.out.println("Hey");
        } else if(args[0].equals("hi")) {
            System.out.println("hi");
        }
    }


//    // als je niks wilt returnen zet je void ervoor
//    // deze sout doet niks zonder static ervoor
//    public static void saySomething(String[] s) {
//        System.out.println(s);
//   }
}
