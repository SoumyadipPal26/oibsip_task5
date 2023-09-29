import java.util.*;

class DigitalLibraryManagement{
    HashMap<String,Integer> loginto = new HashMap<>();
    HashMap<Integer,String> map = new HashMap<>();
    public static String userID;
    public static int issues = 0;
    Scanner sc=new Scanner(System.in);
    
    
    public HashMap<Integer,String> book_database_server()
    {
        map.put(1,"EE : Electric Machine-1");
        map.put(2,"EE : Electric Machine-2");
        map.put(3,"EE : Electric Drive");
        map.put(4,"EE : Power System-1");
        map.put(5,"EE : Power System-2");
        map.put(6,"EE : Basic Electrical");
        map.put(7,"EE : Power Electronics");
        map.put(8,"ECE : Basic Electronics");
        map.put(9,"ECE : Microprocessor & Microcontroller");
        map.put(10,"ECE : Analog Electronics");
        map.put(11,"ECE : Digital Electronics");
        map.put(12,"CSE : C Programming");
        map.put(13,"CSE : Java Programming");
        map.put(14,"CSE : Artificial Intelligence");
        map.put(15,"CSE : Object Oriented Programming (OOPs)");
        map.put(16,"IT : Data Structures & Algorithms");
        map.put(17,"IT : Databases - Networks");
        map.put(18,"IT : Statistics");
        map.put(19,"BBA : Principle of Management");
        map.put(20,"BBA : Economics for Engineers");
        map.put(21,"MATHS : Engineering Mathematics-1");
        map.put(22,"MATHS : Engineering Mathematics-2");
        map.put(23,"MATHS : Engineering Mathematics-3");
        map.put(24,"PHYS : Physics");
        map.put(25,"CHEM : Chemistry");
        map.put(26,"ENG : English");
        map.put(27,"BENG : Bengali");
        map.put(28,"HIND : Hindi");
        map.put(29,"EE : Control System");
        map.put(30,"EE : Electrical Circuit Theory");
        map.put(31,"EE : Electric & Hybrid Vehicle");
        map.put(32,"EE : Renewable Energy Sources");
        
        return map;
    }
    
    public void homepage()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("----- WELCOME TO DIGITAL LIBRARY MANAGEMENT SYSTEM -----");
        System.out.println("----------------------- HOMEPAGE -----------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Please Select One Option..." + "\n");
        System.out.println("1.>>> Admin Login >>>");
        System.out.println("2.>>> User Login >>>");
        System.out.println("3.>>> Exit >>>");
        System.out.println("--------------------------------------------------------");
        System.out.print("Select Option: ");
        int sp=sc.nextInt();
        switch(sp){
            case 1: 
            	admin_login();
            	break;
            case 2: 
            	user_login();
            	break;
            case 3:
                System.out.print("\n" + "Do You want to Exit? (Y/N): ");
                String exit = sc.next();
                if(exit.equalsIgnoreCase("Y"))
                {
                    System.out.println("\n" + "--------------------------------------------------------");
                    System.out.println("\n" + "EXITING SUCCESSFULLY...!");
                    System.out.println("\n" + "--------------------------------------------------------");
                    System.out.println("\n" + "Thank You.!!! Please Visit Again...");
                    System.out.println("\n" + "--------------------------------------------------------");
                	System.exit(0);
                }
                else{
                    System.out.println("\n" + "Exiting Cancelled... Stayed on the HomePage...");
                    homepage();
                }
            	break;
            default: 
            	System.out.println("\n" + "Invalid Option Choice.! Please Try again...");
            	homepage();
            	break;
        }
    }
    
    public void admin_login()
    {
    	System.out.println("--------------------------------------------------------");
    	System.out.println("------------------- ADMIN LOGIN PAGE -------------------");
    	System.out.println("--------------------------------------------------------");
        System.out.print("Enter User-Id: ");
        userID = sc.next();
        System.out.print("Enter Password: ");
        int password = sc.nextInt();
        loginto.put("Soumya",13579);
        loginto.put("Soumyadip",20026);
        
        if (loginto.containsKey(userID) && loginto.get(userID) == password)
        {
            System.out.println("--------------------------------------------------------");
            System.out.println("\n" + "LOGIN SUCCESSFULLY...!");
            System.out.println("\n" + "--------------------------------------------------------");
            admin_mainpage();
        }
        else{
            System.out.println("\n" + "Invalid login credentials.!!! Please try again...");
            admin_login();
        }
    }

    public void user_login()
    {
    	System.out.println("--------------------------------------------------------");
    	System.out.println("-------------------- USER LOGIN PAGE -------------------");
    	System.out.println("--------------------------------------------------------");
        System.out.print("Enter User-Id: ");
        userID = sc.next();
        System.out.print("Enter Password: ");
        int password = sc.nextInt();
        loginto.put("Soumya",13579);
        loginto.put("Soumyadip",20026);
        loginto.put("Soumy",12345);
        loginto.put("SPal",24680);
        loginto.put("Dip",11111);
        
        if (loginto.containsKey(userID) && loginto.get(userID) == password)
        {
            System.out.println("--------------------------------------------------------");
            System.out.println("\n" + "LOGIN SUCCESSFULLY...!");
            System.out.println("\n" + "--------------------------------------------------------");
            user_mainpage();
        }
        else{
            System.out.println("\n" + "Invalid login credentials.!!! Please try again...");
            user_login();
        }
    }

    public void admin_mainpage()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("----- Digital Library ---> Welcome Admin " + DigitalLibraryManagement.userID + "! ----");
        System.out.println("-------------------- ADMIN MAINPAGE --------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Please Select One Option..." + "\n");
        System.out.println("1.>>> Add a New Book >>>");
        System.out.println("2.>>> Update a Existing Book >>>");
        System.out.println("3.>>> Delete a Existing Book >>>");
        System.out.println("4.>>> Go To User MainPage >>>");
        System.out.println("5.>>> Logout >>> Back to HomePage >>>");
        System.out.println("--------------------------------------------------------");
        System.out.print("Select Option: ");
        int sp=sc.nextInt();
        switch(sp){
            case 1: 
            	map = add_new();
            	admin_mainpage();
            	break;
            case 2:
                map = upd_old();
                admin_mainpage();
                break;
            case 3: 
            	map = del_old();
            	admin_mainpage();
            	break;
            case 4:
                user_mainpage();
                break;
            case 5:
                System.out.println("--------------------------------------------------------");
                System.out.println("\n" + "LOGOUT SUCCESSFULLY...!");
                System.out.println("\n" + "--------------------------------------------------------");
            	homepage();
            	break;
            default: 
            	System.out.println("\n" + "Invalid Option Choice.! Please Try again...");
            	admin_mainpage();
            	break;
        }
    }
    
    public void user_mainpage()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("----- Digital Library ---> Welcome User " + DigitalLibraryManagement.userID + "! -----");
        System.out.println("--------------------- USER MAINPAGE --------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Please Select One Option..." + "\n");
        System.out.println("1.>>> View any Book >>>");
        System.out.println("2.>>> Issue a Book >>>");
        System.out.println("3.>>> Return a Book >>>");
        System.out.println("4.>>> Logout >>> Back to HomePage >>>");
        System.out.println("--------------------------------------------------------");
        System.out.print("Select Option: ");
        int sp=sc.nextInt();
        switch(sp){
            case 1: 
            	views();
            	break;
            case 2: 
            	borrows();
            	break;
            case 3:
                returns();
                break;
            case 4:
                System.out.println("--------------------------------------------------------");
                System.out.println("\n" + "LOGOUT SUCCESSFULLY...!");
                System.out.println("\n" + "--------------------------------------------------------");
            	homepage();
            	break;
            default: 
            	System.out.println("\n" + "Invalid Option Choice.! Please Try again...");
            	user_mainpage();
            	break;
        }
    }

    public HashMap<Integer,String> add_new()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------- ADD A NEW BOOK -------------------");
        System.out.print("Enter a New Book Number: ");
        int addbook = sc.nextInt();
        if(book_database_server().containsKey(addbook))
        {
            System.out.println("\n" + "This Book Number is already exist... Please try with another number...");
        }
        else if(addbook == 0 || addbook < 0)
        {
            System.out.println("\n" + "You can't assign Zero(0) or a Negative(-ve) number for a book...");
        }
        else{
            System.out.print("Enter New Book Details: ");
            String addbookdetails = scanner.nextLine();
            map.put(addbook,addbookdetails);
            System.out.println("\n" + "New Book added Successfully...");
            System.out.println("New Book No.:: " + addbook);
            System.out.println("New Book Name & Details:: " + map.get(addbook));
        }
        return map;
    }
    
    public HashMap<Integer,String> upd_old()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------- UPDATE A BOOK DETAILS ----------------");
        System.out.print("Enter a Book No. to Update its Details: ");
        int updbook = sc.nextInt();
        if(book_database_server().containsKey(updbook))
        {
            System.out.println("Backdated Book Name & Details:: " + map.get(updbook));
            System.out.print("Enter the Updated Book Details: ");
            String upbookdetails = scan.nextLine();
            book_database_server().replace(updbook,upbookdetails);
            System.out.println("\n" + "Book Details Updated Successfully...!");
            System.out.println("Book No.:: " + updbook);
            System .out.println("Updated Book Name & Details:: " + map.get(updbook));
        }
        else{
            System.out.println("\n" + "This Book Number is not Available...!");
        }
        return map;
    }
    
    public HashMap<Integer,String> del_old()
    {
        System.out.println("----------------- DELETE A BOOK DETAILS ----------------");
        System.out.print("Enter the Book Number, which you want to delete: ");
        int delbook = sc.nextInt();
        if(book_database_server().containsKey(delbook))
        {
            System.out.println("\n" + "Book Details You Want to Delete...>>>");
            System.out.println("Book No.:: " + delbook);
            System .out.println("Book Name:: " + map.get(delbook));
            System.out.print("\n" + "Do You want to Delete this Book? (Y/N): ");
            String delbookdetails = sc.next();
            if(delbookdetails.equalsIgnoreCase("Y"))
            {
                String returned_value = (String)map.remove(delbook);
                System.out.println("\n\"" + returned_value + "\" Book Details Deleted Successfully...");
            }
            else{
                System.out.println("\n" + "Book Deletion Cancelled...!");
            }
        }
        else{
            System.out.println("\n" + "This Book Number Already not Exists.!!!");
        }
        return map;
    }
    
    public void views()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("---------------------- VIEW BOOKS ----------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Please Select One Option..." + "\n");
        System.out.println("1.>>> View a Specific Book >>>");
        System.out.println("2.>>> View all Books >>>");
        System.out.println("3.>>> Back to MainPage >>>");
        System.out.println("--------------------------------------------------------");
        System.out.print("Select Option: ");
        int dip=sc.nextInt();
        switch(dip){
            case 1: 
                System.out.println("--------------------------------------------------------");
                System.out.print("Enter Book Number: ");
                int books = sc.nextInt();
            	if(book_database_server().containsKey(books))
            	{
            	    System.out.println("\n" + books + " ---> " + map.get(books));
            	}
            	else{
            	    System.out.println("\n" + "Oops.! This book no. is not available... Please Try Another...");
            	}
            	views();
            	break;
            case 2:
                System.out.println("\n" + "All Available Books...>>>" + "\n");
                for(Map.Entry<Integer, String> entry : book_database_server().entrySet()) 
                {
                    int key = entry.getKey();
                    String value = entry.getValue();
                    System.out.println(key + " ---> " + value);
                }
                views();
                break;
            case 3: 
                System.out.println("--------------------------------------------------------");
                System.out.println("\n" + "REDIRECTING TO USER MAINPAGE..." + "\n");
                System.out.println("--------------------------------------------------------");
            	user_mainpage();
            	break;
            default: 
            	System.out.println("\n" + "Invalid Option Choice.! Please Try again...");
            	views();
            	break;
        }
    }
    
    public void borrows()
    {
        System.out.println("--------------------- ISSUE A BOOK ---------------------");
        System.out.print("Enter a Book Number which You want to Issue: ");
        int isbook = sc.nextInt();
        if(issues == 0 && isbook > 0 && book_database_server().containsKey(isbook))
        {
            issues = isbook;
            System.out.println("\n" + "Successfully Issued the Book...");
            System.out.println("Issued Book No.:: " + isbook);
            System .out.println("Issued Book Name & Details:: " + map.get(isbook));
        }
        else if(issues != 0)
        {
            System.out.println("\n" + "You have Already Issued a Book.! Please Return that book to Issue a new book...");
        }
        else
        {
            System.out.println("\n" + "Invalid Book Number or Book is not Available...");
        }
        user_mainpage();
    }
    
    public void returns()
    {
        System.out.println("--------------------- RETURN A BOOK --------------------");
        if(book_database_server().containsKey(issues))
        {
            System.out.println("Issued Book Details...>>>");
            System.out.println("Book No.:: " + issues);
            System .out.println("Book Name:: " + map.get(issues));
            System.out.print("\n" + "Do You want to Return this Book? (Y/N): ");
            String rebook = sc.next();
            if(rebook.equalsIgnoreCase("Y"))
            {
                issues = 0;
                System.out.println("\n" + "Book Returned Successfully...");
            }
            else{
                System.out.println("\n" + "Book Return Cancelled...!");
            }
        }
        else{
            System.out.println("\n" + "You don't have any issued book.!!!");
        }
        user_mainpage();
    }
    
    
    public static void main(String args[]){
    	DigitalLibraryManagement system_run = new DigitalLibraryManagement();
        system_run.homepage();
    }
}