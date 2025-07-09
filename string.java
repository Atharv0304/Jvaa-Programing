public class string {
    public static void main(String[] args) {
        //CONCATENATE
        String name1 = "Abhi";
        String name2 = "Satghare";

        

        String name3 = name1 +" "+ name2;

        System.out.println(name3);

        //CharAt

        System.out.println(name3.charAt(5));

        //LENGTH

        System.out.println(name3.length());

        //REPLACE

        String finalname = name1.replace("bhi", "tharv");
        System.out.println(finalname);

        //SUBSTRING

        System.out.println(finalname.substring(0,6));

    }
}
