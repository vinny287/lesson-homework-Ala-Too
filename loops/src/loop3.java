void main () {
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nInput num ");
    int tmp =1;
    int num= scanner.nextInt();
    if (num ==0 ){
        System.out.println("Input positive num");
        return;
    }
    while (tmp!=num){
        tmp++;
        System.out.println(tmp);
    }
}
