## Command line arguments
There's one more way a Java program can accept input from the user, and that is before they actually run the program!

Remember the declaration of the main method:
```java
public static void main(String args[]){
}
```

Notice that the method accepts a String array called args[] as an input parameter, but we never explicitly call the main method ourselves! So what is this String array and where does its value ever come from?

If you end up running the program from the command line, anything you type after the program name is considered an input argument.

For example, if we had a Java program called weather that prints today's weather, running it from the command line is as simple as typing in the program name:


If we wanted the program to be more customizable, we could set it up to accept a city input and print the weather there. So to get the weather in Sydney you can type:


The way this works is through the String [] args that's passed to the main method, which means inside the main method, the first String in that String array args contains the value "Sydney".


```java
public static void main(String [] args){
   if(args.length==0) {
      System.out.println("Please specify a location");
   }
   else {
      String location = args[0];
      int temperature = 60 + (int)(Math.random()*10);
      System.out.println("The weather in "+location+" is "+ temperature);
   }
}
```

You can loop through the args array and collect as many arguments as you want.

Feel free to read more information on how to read and use the [command line
 arguments](https://docs.oracle.com/javase/tutorial/essential/environment/cmdLineArgs.html)

Now it's time to try all of these input types in our project
