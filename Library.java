import java.util.Scanner;
class Library{
    public static void main(String[]main){
        Scanner sc = new Scanner(System.in);
        char choiceShelf;
        char choiceBook = 0;
         while(true){
            System.out.println("Wellcome to java Library we have 5 shelfs in our library.");
            System.out.println("1. Shelf No 1");
            System.out.println("2. Shelf No 2");
            System.out.println("3. Shelf No 3");
            System.out.println("4. Shelf No 4");
            System.out.println("5. Shelf No 5\n");
            System.out.println("If you want to exit from this library enter 0.\n");
            System.out.println("Chose one shelf : ");
            choiceShelf = sc.next().charAt(0);
            if(choiceShelf == '0'){
                System.out.println("you exixt from library.");
                break;
            }
        if(choiceShelf < '1' || choiceShelf > '5'){
            System.out.println("Invalid shelf choice!");
            continue;
        }
         
        switch(choiceShelf){
            case '1' : // case 1 for shelf choice
                do{
            System.out.println("you enter in 1st shelf there are 4 books for class 10th in this shellf ");
            System.out.println("1. chemistry book for class 10th ");
            System.out.println("2. Physics book for class 10th");
            System.out.println("3. English book for class 10th ");
            System.out.println("4. Urdu book for class 10th");
            System.out.println("4. If you want to back enter 9");
            System.out.println("chose one book ");
            choiceBook = sc.next().charAt(0);
        }while(choiceBook < 1 || choiceBook < 4);
        switch(choiceBook){
            case '1' :
                System.out.println("You chose Chemistry book for class 10th.");
                System.out.println("in Chemistry book there are 10 chapters in this book\n ");
            break;
            case '2' :
                System.out.println("You chose Physics book for class 10th.");
                System.out.println("in Physics book there are 14 chapters in this book \n");
            break;
            case '3' :
                System.out.println("You chose English book for class 10th.");
                System.out.println("in English book there are 7 chapters in this book \n");
            break;
        
            case '4' :
                    System.out.println("You chose Urdu book for class 10th.");
                    System.out.println("in Urdu book there are 15 chapters in this book \n");
            break;
        }               
        break;
        
         case '2' : // case 2 for shelf choice
                do{
            System.out.println("you enter in 2nd shelf there are 3 books for class 7th in this shellf ");
            System.out.println("1. English litratue book for class 7th ");
            System.out.println("2. Science book for class 7th");
            System.out.println("3. Urdu kawaid book for class 7th\n ");
            System.out.println("chose one book ");
            choiceBook = sc.next().charAt(0);
        }while(choiceBook < 1 || choiceBook < 3);
        switch(choiceBook){
            case '1' :
                System.out.println("You chose English litrature book for class 7th.");
                System.out.println("in Enlish litrature book there are 3 strories in this book\n ");
                break;
            case '2' :
                System.out.println("You chose Science book for class 7th.");
                System.out.println("in Science book there are 20 chapters in this book\n ");
                break;
            case '3' :
                System.out.println("You chose Urdu kawaid book for class 7th.");
                System.out.println("in Urdu kawaid book there are 9 chapters in this book\n ");
                break;
        }
        case '3' : // case 3 for shelf choice
                do{
            System.out.println("you enter in 3rd shelf there are 5 books for class 8th in this shellf ");
            System.out.println("1. Maths book for class 8th ");
            System.out.println("2. Chemistry book for class 8th");
            System.out.println("3. Physics book for class 8th ");
            System.out.println("4. Islamiyat book for class 8th ");
            System.out.println("5. English book for class 8th\n ");
            System.out.println("chose one book ");
            choiceBook = sc.next().charAt(0);
        }while(choiceBook < 1 || choiceBook < 5);
        switch(choiceBook){
            case '1' :
                System.out.println("You chose Maths book for class 8th.");
                System.out.println("in Maths book there are 16 chapters in this book\n ");
                break;
            case '2' :
                System.out.println("You chose Chemistry book for class 8th.");
                System.out.println("in Chemistry book there are 13 chapters in this book\n ");
                break;
            case '3' :
                System.out.println("You chose Physics  book for class 8th.");
                System.out.println("in  Physics book there are 9 chapters in this book \n");
                break;
            case '4' :
                System.out.println("You chose Islamiyat book for class 8th.");
                System.out.println("in  Islamiyat book there are 10 chapters and 91 ayats with tarjuma in this book \n");
                break;
            case '5' :
                System.out.println("You chose English book for class 8th.");
                System.out.println("in  English book there are 14 chapters in this book\n ");
                break;
        }
        break;
                case '4' : // case 4 for shelf choice
                do{
            System.out.println("you enter in 4th shelf there are 6 books for BSCS 1st semister in this shellf ");
            System.out.println("1. Programing Fundamental book");
            System.out.println("2. ITC book");
            System.out.println("3. Physics book");
            System.out.println("4. Calsulas book ");
            System.out.println("5. Enlish book ");
            System.out.println("6. Islamiyat book\n ");
            System.out.println("chose one book ");
            choiceBook = sc.next().charAt(0);
        }while(choiceBook < 1 || choiceBook < 6);
        switch(choiceBook){
            case '1' :
                System.out.println("You chose Programing Fundamental book.");
                System.out.println("in Programing Fundamental book there is compelete C language in this book\n ");
                break;
            case '2' :
                System.out.println("You chose ICT book.");
                System.out.println("in ICT book there are 10 chapters in this book\n ");
                break;
            case '3' :
                System.out.println("You chose Physics  book.");
                System.out.println("in  Physics book there are 5 chapters in this book\n ");
                break;
            case '4' :
                System.out.println("You chose Calculas book.");
                System.out.println("in  Calculas book there are 13 chapters in this book\n ");
                break;
            case '5' :
                System.out.println("You chose English book.");
                System.out.println("in  English book there are 11 chapters in this book\n ");
                break;
            case '6' :
                System.out.println("You chose Islamiyat book.");
                System.out.println("in  Islamiyat book there are 16 chapters and 121 ayats with tarjuma in this book\n");
                break;    
        }
        break;
            case '5' : // case 5 for shelf choice
                do{
            System.out.println("you enter in 5th shelf there are 6 books for BSCS 2nd semister  in this shellf ");
            System.out.println("1. OOPS book");
            System.out.println("2. DLD book");
            System.out.println("3. Discrete Structre book");
            System.out.println("4. Linear Algebra book ");
            System.out.println("5. Comunication Skills book ");
            System.out.println("6. Pakistan Studies \n ");
            System.out.println("chose one book ");
            choiceBook = sc.next().charAt(0);
        }while(choiceBook < 1 || choiceBook < 6);
        switch(choiceBook){
            case '1' :
                System.out.println("You chose OOPS book.");
                System.out.println("in OOPS book there is compelete java language in this book\n ");
                break;
            case '2' :
                System.out.println("You chose DLD book.");
                System.out.println("in Chose DLD book there are 15 chapters in this book\n ");
                break;
            case '3' :
                System.out.println("You chose Discrete Structre book.");
                System.out.println("in  Discrete Structre book there are 22 chapters in this book\n ");
                break;
            case '4' :
                System.out.println("You chose Linear Algebra book.");
                System.out.println("in  Linear Algebra book there are 15 chapters in this book\n ");
                break;
            case '5' :
                System.out.println("You chose Comunication Skills book.");
                System.out.println("in  Comunication Skills book there are 9 chapters in this book\n ");
                break;
            case '6' :
                System.out.println("You chose Pakistan Studies book.");
                System.out.println("in  Pakistan Studies book there are 14 chapters in this book\n");
                break;    
        }
        break;


        }
            
        }
    }
}