
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RVT
 */
public class Main {
    public static void main(String[] args) {
        int pilihan; //variable
        int data; //variable
        Stack result = new Stack(); //memanggil kelas stack
        do{ //perulangan
            System.out.println("1.PUSH"); //tampilkan 1.PUSH
            System.out.println("2.POP ITEM"); //tampilkan 2.POP ITEM
            System.out.println("3.LIHAT ISI DATA"); // tampikan 3.LIHAT ISI DATA
            System.out.println("4.KELUAR"); //tampilkan 4.KELUAR
            Scanner input= new Scanner(System.in);
            pilihan=input.nextInt(); //pilihan = input
            if(pilihan==1){ //jika pilihan 1
                System.out.println("data yang ditambahkan :"); //tampilkan "data yang ditambahkan"
                data=input.nextInt(); //data = input.nextInt
                result.push(data); //panggil method puh
            }
            else if(pilihan==2){ //jika pilihan 2 
                result.pop(); //result.pop
        }
            else if(pilihan==3){ //jika pilihan 3
                result.display(); //result.display
            }else if(pilihan==0){ //jika pilihan 0
                System.exit(0); //system.exit
            }else{ //jika tidak ada
                System.out.println("pilihan tidak ada"); //tampilkan "pilihan tidak ada"
            }
        }while(pilihan !=0); //program mengulang pilihan
    }
}
