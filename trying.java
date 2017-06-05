import java.util.*;
public class trying {
static Scanner read = new Scanner (System.in);
static int n = 5;
public static void main (String [] args) {

try {a();}
catch (InputMismatchException e) {
System.out.println("Catch main input");}
catch (RuntimeException e) {
System.out.println("Catch main run");}


} 
public static void a(){
   try{
      //B();
      throw new InputMismatchException("oops");}
   catch (RuntimeException e) {
      System.out.println("catch runtime");
      throw e;}}


/*public static int B(){
   try {
      C();
      System.out.println("try b");
      return n++;}
   
   finally {
   System.out.println("n: "+n);}}

public static void C(){
   try {
      D();
      System.out.println("try c");}    
   catch (ArithmeticException e) {
      System.out.println("catch c");}
   catch (NullPointerException e) {
      System.out.println(e);}
  /* catch (ExceptionB exp) {
   try {
   System.out.println(exp);
   throw new NumberFormatException();}
   catch (NumberFormatException e){
   throw e; }
    finally {
    System.out.println("finally c");}}

public static void D (){
try{
throw new Exception();}
catch (Exception e) {
System.out.println("wow");}}*/

}