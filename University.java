
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ACER PC
 */
public class University {

    public static void University() {
        Double name;
        String address;
        int mbr;
        Boolean status;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Matric No/Staff No");
        name = scan.nextDouble();
        System.out.println();

        System.out.println("Enter Your Password");
        address = scan.next();
        System.out.println();

        do {
            System.out.println("You are Welcome");
            System.out.println();

            System.out.println("Are you a Student  orStaff");
            System.out.println("Press 1 if You're a student");
            mbr = scan.nextInt();

            if (mbr == 1) {

                Semester();

            } else {
                University();
            }

            //System.out.println("Are you a Student?");
            System.out.println("You can proceed with your");
            status = scan.nextBoolean();
            if (status == true) {

            }

        } while (status.equals("n"));
        //  Boolean false= (char)String ("n");
        Semester();
        {
            System.out.println("Click on the Staff Portal");

        }

    }

    public static void Semester() {
        Scanner scan = new Scanner(System.in);
        String[] smstr;
        smstr = new String[]{"100H", "100R", "200H", "200R", "300H", "300R", "400H", "400R"};

        System.out.println("Please Choose Your Current Semester");

        System.out.println("-------------");
        System.out.println("Enter 1 for 100H");
        System.out.println("Enter 2 for 100R");
        System.out.println("Enter 3 for 200H");
        System.out.println("Enter 4 for 200R");
        System.out.println("Enter 5 for 300H");
        System.out.println("Enter 6 for 300R");
        System.out.println("Enter 7 for 400H");
        System.out.println("Enter 8 for 400R");

        int option;
        option = scan.nextInt();

        switch (option) {
            case 1:
                System.out.println("You are Resuming for :" + smstr[0]);
                break;
            case 2:
                System.out.println("You are Resuming for :" + smstr[1]);
                ;
                break;
            case 3:
                System.out.println("You are Resuming for :" + smstr[2]);
                break;
            case 4:
                System.out.println("You are Resuming for :" + smstr[3]);
                break;
            case 5:
                System.out.println("You are Resuming for :" + smstr[4]);
                break;
            case 6:
                System.out.println("You are Resuming for :" + smstr[5]);
                break;
            case 7:
                System.out.println("You are Resuming for :" + smstr[6]);
                break;
            case 8:
                System.out.println("You are Resuming for :" + smstr[7]);
                break;
            default:

        }
        
         
        
        
    }

    public static void main(String[] args) {
        University();
        Semester();
    }
}
