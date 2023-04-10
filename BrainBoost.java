class BrainBoost
{
  public static void main (String[] args)
  {
    int task;
    do
    {
      System.out.println("Enter the task number you wish to accomplish");
      System.out.println("Options: (1) homework");
      System.out.println("         (2) cleaning");
      System.out.println("         (3) exit");
      task = In.getInt();
      
      if (task == 1)
      {
        System.out.println("Make a list of the classes you have homework for, in order of what will take the longest to shortest amount of time: ");
        String class1 = In.getString();
        String class2 = In.getString();
        String class3 = In.getString();
        String class4 = In.getString();
        
        System.out.println("You have 90 minutes to complete your homework for " + class1 + ".");
        System.out.println("You have 60 minutes to complete your homework for " + class2 + ".");
        System.out.println("You have 45 minutes to complete your homework for " + class3 + ".");
        System.out.println("You have 30 minutes to complete your homework for " + class4 + ".");
        System.out.println();
        System.out.println("Enter your next task, enter 3 to leave: ");
        System.out.println();
        
      }
      
      else if (task == 2)
      {
        System.out.println("If you would like to clean your room, you have 45 minutes to do so.");
        System.out.println("If you would like to clean your washroom, you have 30 minutes to do so.");
        System.out.println("If you would like to clean your kitchen, you have 45 minutes to do so.");
        System.out.println("If you would like to clean your whole house, you have 3 hours to do so.");
        System.out.println();
        System.out.println("Reminders: (1) Mop the room you are cleaning.");
        System.out.println("           (2) Vaccuum the room you are cleaning.");
        System.out.println("           (3) Wash your hands once you are finished :).");
        System.out.println();
        System.out.println("Enter your next task, enter 3 to leave: ");
        System.out.println();
        
      }
      
      else if (task == 3) 
      {
        System.out.println("Bye, have a nice day!");
      }
      
    } while (task != 3);
  }
}


