/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RVT
 */
public class Stack {
    private boolean empty, full; //variable empty dan full
    private int pos; //variable posisi
    private int max_data=3;//data maximal
    private int item[]= new int[max_data];//mendeklarasikan data dengan nama item
    public void Stack(){
        full=false; //full=false
        empty=true;//empty=true
        pos=0;//posisi = 0
    }
    public boolean isFull(){ //method untuk mengecek benar atau tidak dengan nama isFull
        return (full);
    }
    public boolean isEmpty(){//method untuk mengecek tempat, kosong atau tidak
        return(empty);
    }
    public void push(int data){//method untuk menambahkan Stack
        if(!isFull()){//jika benar
            item[pos++]=data;//maka item ditambahkan sama dengan data
            empty=false;//empty sama dengan false
            if(pos==max_data){//jika posisi sama dengan maksima data
                full=true;//maka full sama dengan true
            }
            System.out.println("data sudah ditambah");//menampilkan hasil data sudah ditambahkan
        }else{
            System.out.println("stack sudah penuh");//maka akan ditampilkan data sudah penuh
        }
        return;
    }
    public int pop(){//method pop
        int x=0;//variable x sama dengan 0
        if(!isEmpty()){//untuk menampung array dari item
            x=item[--pos];//cek apakah array nya kosong, item indexnya dikurangi
            full=false;//full sama dengan false
            System.out.println("data yang di pop adalah "+item[pos]);//maka akan ditampilkan data yang dipop item dalam index
            System.out.println("");
            item[pos]=0;//item pos sama dengan 0
            if(pos==0){//jika pos sama dengan 0
                empty=true;
                System.out.println("stack adalah kosong");//maka akan ditampilkan stack adalah kosong
            } else{
                System.out.println("data sudah di ambil");//maka akan ditampilkan data sudah diambil
            }
        }else{
            System.out.println("stack masih kosong ! \n");//maka akan ditampilkan stack masih kosong
        }
        return(x);
    }
    public void display(){//methoduntuk menampilkan
        System.out.println("isi stack adalah");//menampilkan isi stack
        for (int i = 0; i < pos; i++) {//perulangan, jika i sama dengan 0, i kurang dari posisi maka i increment
            System.out.println(item[i]+"");           
        }
        System.out.println("\n");
    }
}
