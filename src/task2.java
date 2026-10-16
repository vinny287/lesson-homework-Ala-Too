void main() {
Scanner VIN = new Scanner(System.in);
int age = VIN.nextInt();
if (age > 18){
   System.out.println("You can vote");
}else{
   System.out.println("You cannot vote");
}
}